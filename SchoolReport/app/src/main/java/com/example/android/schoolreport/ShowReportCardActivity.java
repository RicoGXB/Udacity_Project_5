package com.example.android.schoolreport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowReportCardActivity extends AppCompatActivity {
    static int mPosition; //记录需显示成绩的学生在数组的位置
    static String mStudentName; //记录需显示成绩学生的姓名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_show_report_card );

        //修改成绩单上学生姓名
        TextView studentName = (TextView) findViewById( R.id.student_name );
        String sn = getString( R.string.student_name, mStudentName );
        studentName.setText( sn );

        //从保存成绩的StroeReportCard类中取出需要的学生成绩
        StoreReportCard storeReportCard = new StoreReportCard( mPosition );
        ArrayList<ReportCard> reportCards = storeReportCard.getStudentAchievement();

        //初始化Adapter并与ListView绑定
        ReportCardAdapter reportCardAdapter = new ReportCardAdapter( this, reportCards );
        ListView reportCardListView = (ListView) findViewById( R.id.show_report_card_list_view );
        reportCardListView.setAdapter( reportCardAdapter );
    }
}

