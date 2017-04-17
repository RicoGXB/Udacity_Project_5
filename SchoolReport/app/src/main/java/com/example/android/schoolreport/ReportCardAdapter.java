package com.example.android.schoolreport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rico_company on 17/3/30.
 * {@link ReportCardAdapter} 自建Adapter,管理ListView用于显示学生成绩.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Context context, ArrayList<ReportCard> reportCards) {
        super( context, 0, reportCards );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        //如果此位置没有传入已回收视图，则插入一个新的子视图list_item.
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate( R.layout.report_card_list_item, parent, false );
        }

        //通过父类ArrayAdapter<ReportCard>的方法getItem()获取reportCard数组中，当前position位置的对象
        ReportCard reportCard = getItem( position );

        //通过已获取的对应位置Word对象，修改子视图list_item XML内的text view
        TextView subject = (TextView) listItemView.findViewById( R.id.list_item_subject );
        subject.setText( reportCard.getSubject() );

        TextView freshmanScore = (TextView) listItemView.findViewById( R.id.list_item_freshman_score );
        freshmanScore.setText( reportCard.getFreshmanScore() );

        TextView sophomoreScore = (TextView) listItemView.findViewById( R.id.list_item_sophomore_score );
        sophomoreScore.setText( reportCard.getSophomoreScore() );

        TextView juniorScore = (TextView) listItemView.findViewById( R.id.list_item_junior_score );
        juniorScore.setText( reportCard.getJuniorScore() );

        //"总分"行设为红色字体
        if ((reportCard.getSubject()).equals( "总分" )) {
            subject.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Red ) );
            freshmanScore.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Red ) );
            sophomoreScore.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Red ) );
            juniorScore.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Red ) );
        } else {
            subject.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Black ) );
            freshmanScore.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Black ) );
            sophomoreScore.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Black ) );
            juniorScore.setTextColor( ContextCompat.getColor( this.getContext(), R.color.Black ) );
        }

        return listItemView;
    }
}
