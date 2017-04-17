package com.example.android.schoolreport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowReportCardActivity extends AppCompatActivity {
    static String mStudentName; //记录需显示成绩学生的姓名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_show_report_card );

        //修改成绩单上学生姓名
        TextView studentName = (TextView) findViewById( R.id.student_name );
        String name = getString( R.string.student_name, mStudentName );
        studentName.setText( name );

        //调用calculateReportCard()获得包含学期总分的成绩。
        final ArrayList<ReportCard> sumReportCard = calculateReportCard();
        //初始化ListView
        final ListView reportCardListView = (ListView) findViewById( R.id.show_report_card_list_view );
        //初始化ReportCardAdapter并与ListView绑定
        ReportCardAdapter reportCardAdapter = new ReportCardAdapter( this, sumReportCard );
        reportCardListView.setAdapter( reportCardAdapter );


        final Button setReportCardButton = (Button) findViewById( R.id.student_set_report_card );
        setReportCardButton.setTag( "showState" );
        setReportCardButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (setReportCardButton.getTag().equals( "setState" )) {
                    //1.进入现实成绩状态 2.初始化ReportCardAdapter并重新计算总分 3.将修改的成绩HashMap传入StoreReportCard使用户的修改生效
                    MainActivity.mStoreReportCard.setStudentAchievement( ModifyReportCardAdapter.textValues );
                    ArrayList<ReportCard> sumReportCard = calculateReportCard();
                    ReportCardAdapter reportCardAdapter = new ReportCardAdapter( ShowReportCardActivity.this, sumReportCard );
                    reportCardListView.setAdapter( reportCardAdapter );
                    setReportCardButton.setText( "修改成绩" );
                    setReportCardButton.setTag( "showState" );
                } else if (setReportCardButton.getTag().equals( "showState" )) {
                    //1.进入修改成绩状态 2.初始化ModifyReportAdapter并传入学生成绩
                    ArrayList<ReportCard> sumReportCard = calculateReportCard();
                    ModifyReportCardAdapter modifyReportCardAdapter = new ModifyReportCardAdapter( ShowReportCardActivity.this, sumReportCard );
                    reportCardListView.setAdapter( modifyReportCardAdapter );
                    setReportCardButton.setText( "确认保存" );
                    setReportCardButton.setTag( "setState" );
                }
            }
        } );
    }

    //动态计算学生在每学期的总分
    private ArrayList<ReportCard> calculateReportCard() {
        String name = null;//学生姓名
        int sumFreshmanScore = 0; //第一学期总分
        int sumSophomoreScore = 0; //第二学期总分
        int sumJuniorScore = 0; //第三学期纵缝
        ArrayList<ReportCard> storeReportCard = MainActivity.mStoreReportCard.getStudentAchievement( mStudentName );//从保存成绩的StoreReportCard类中取出需要的学生成绩

        for (int index = 0; index < storeReportCard.size(); index++) {
            ReportCard reportCard = storeReportCard.get( index );//从学生成绩中取出行数据
            name = reportCard.getName();//取出学生姓名
            sumFreshmanScore += Integer.parseInt( reportCard.getFreshmanScore() );
            sumSophomoreScore += Integer.parseInt( reportCard.getSophomoreScore() );
            sumJuniorScore += Integer.parseInt( reportCard.getJuniorScore() );
        }
        ReportCard sumReportCard = new ReportCard( name, "总分", sumFreshmanScore, sumSophomoreScore, sumJuniorScore );
        storeReportCard.add( sumReportCard );
        return storeReportCard;
    }
}

