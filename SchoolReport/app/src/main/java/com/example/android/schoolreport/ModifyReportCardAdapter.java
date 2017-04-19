package com.example.android.schoolreport;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rico_company on 17/4/11.
 * {@link ModifyReportCardAdapter} 自建Adapter,修改学生成绩
 */

public class ModifyReportCardAdapter extends ArrayAdapter<ReportCard> {
    private Context mContext;
    static HashMap<String, String> textValues;

    public ModifyReportCardAdapter(Context context, ArrayList<ReportCard> reportCards) {
        super( context, 0, reportCards );
        mContext = context;

        //修改成绩前，先删除总分
        for (int index = 0; index < reportCards.size(); index++) {
            if ((reportCards.get( index ).getSubject()).equals( "总分" )) {
                //移除总分
                reportCards.remove( index );
            }
        }

        //初始化HashMap，记录修改的成绩
        textValues = new HashMap<String, String>();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        boolean convertViewWasNull = false; //判断是新插入的listView还是回收的listView

        if (listView == null) {
            listView = LayoutInflater.from( getContext() ).inflate( R.layout.edit_report_card_list_item, parent, false );
            convertViewWasNull = true;
        }

        ReportCard reportCard = getItem( position );

        String name = reportCard.getName();
        String subject = reportCard.getSubject();

        TextView mSubject = (TextView) listView.findViewById( R.id.edit_list_item_subject );
        mSubject.setText( subject );
        EditText mFreshmanScore = (EditText) listView.findViewById( R.id.edit_list_item_freshman_score );
        mFreshmanScore.setTag( "freshmanScore" + name + subject );
        mFreshmanScore.setText( reportCard.getFreshmanScore() );
        EditText mSophomoreScore = (EditText) listView.findViewById( R.id.edit_list_item_sophomore_score );
        mSophomoreScore.setTag( "sophomoreScore" + name + subject );
        mSophomoreScore.setText( reportCard.getSophomoreScore() );
        EditText mJuniorScore = (EditText) listView.findViewById( R.id.edit_list_item_junior_score );
        mJuniorScore.setTag( "juniorScore" + name + subject );
        mJuniorScore.setText( reportCard.getJuniorScore() );

        //为每个新ExitText添加文本监听器
        if (convertViewWasNull) {
            mFreshmanScore.addTextChangedListener( new EditReportCardTextWatcher( mFreshmanScore ) );
            mSophomoreScore.addTextChangedListener( new EditReportCardTextWatcher( mSophomoreScore ) );
            mJuniorScore.addTextChangedListener( new EditReportCardTextWatcher( mJuniorScore ) );
        }

        return listView;
    }


    private class EditReportCardTextWatcher implements TextWatcher {
        private View view;
        private CharSequence temp;

        private EditReportCardTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            temp = charSequence;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            String text = editable.toString();
            if (temp.length() < 1) {
                text = "0";
                ((EditText) view).setText( text );
            } else if (Integer.parseInt( text ) > 150) {
                text = "150";
                ((EditText) view).setText( text );
                Toast.makeText( mContext, "您输入的最高分不能超过了150！", Toast.LENGTH_SHORT ).show();
            }
            //将修改过的学生成绩保存到HashMap
            ModifyReportCardAdapter.this.textValues.put( (String) view.getTag(), text );
        }
    }
}