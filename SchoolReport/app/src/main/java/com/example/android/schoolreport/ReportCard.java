package com.example.android.schoolreport;

/**
 * Created by Rico_company on 17/3/28.
 * {@link ReportCard} represents a report card for students that the user wants to query.
 *
 */

public class ReportCard {
    private String mSubject;//学科
    private String mFreshmanScore;//第一学期分数
    private String mSophomoreScore;//第二学期分数
    private String mJuniorScore;//第三学期分数

    public ReportCard(String subject, String freshmanScore, String sophomoreScore, String juniorScore) {
        mSubject = subject;
        mFreshmanScore = freshmanScore;
        mSophomoreScore = sophomoreScore;
        mJuniorScore = juniorScore;
    }

    public String getSubject() {
        return mSubject;
    }

    public String getFreshmanScore() {
        return mFreshmanScore;
    }

    public String getSophomoreScore() {
        return mSophomoreScore;
    }

    public String getJuniorScore() {
        return mJuniorScore;
    }

}
