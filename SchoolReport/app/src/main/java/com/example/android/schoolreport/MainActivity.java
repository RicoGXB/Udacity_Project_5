package com.example.android.schoolreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static StoreReportCard mStoreReportCard;//保存获取的学生成绩，启动应用即初始化

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //保存学生名字，可以学生姓名为搜索条件查询学生成绩
        final ArrayList<String> names = new ArrayList<>();
        names.add( "门钰程" );
        names.add( "张帆" );
        names.add( "王绍宇" );
        names.add( "吕晓虹" );
        names.add( "张文赫" );
        names.add( "崔子佩" );
        names.add( "李炜康" );
        names.add( "程弈超" );
        names.add( "周晓文" );
        names.add( "梁人之" );
        names.add( "全彦青" );
        names.add( "张喜帜" );
        names.add( "赵羽菲" );
        names.add( "王媛媛" );
        names.add( "李宗霖" );
        names.add( "王择源" );
        names.add( "宋云婷" );
        names.add( "王艺霖" );
        names.add( "赵海霞" );
        names.add( "丛鸣" );

        //从保存成绩的StroeReportCard类中取出需要的学生成绩
        mStoreReportCard = new StoreReportCard();


        //创建ArrayAdapter<String>,管理学生姓名的显示
        ArrayAdapter<String> nameAdapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, names );
        ListView listView = (ListView) findViewById( R.id.main_list_view );
        listView.setAdapter( nameAdapter );

        //判断被点击的学生名字
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //传入被点击的学生在ArrayList中的位置
                ShowReportCardActivity.mStudentName = names.get( position );

                Intent intent = new Intent( MainActivity.this, ShowReportCardActivity.class );
                startActivity( intent );
            }
        } );
    }

}
