package com.example.android.schoolreport;

/**
 * Created by Rico_company on 17/3/28.
 * {@link ReportCard} represents a report card for students that the user wants to query.
 */

public class ReportCard {
    private String mName;//姓名
    private String mSubject;//学科
    private int mFreshmanScore;//第一学期分数
    private int mSophomoreScore;//第二学期分数
    private int mJuniorScore;//第三学期分数

    public ReportCard(String name, String subject, int freshmanScore, int sophomoreScore, int juniorScore) {
        mName = name;
        mSubject = subject;
        mFreshmanScore = freshmanScore;
        mSophomoreScore = sophomoreScore;
        mJuniorScore = juniorScore;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setFreshmanScore(int freshmanScore) {
        mFreshmanScore = freshmanScore;
    }

    public void setSophomoreScore(int sophomoreScore) {
        mSophomoreScore = sophomoreScore;
    }

    public void setJuniorScore(int juniorScore) {
        mJuniorScore = juniorScore;
    }

    public String getName() {
        return mName;
    }

    public String getSubject() {
        return mSubject;
    }

    public String getFreshmanScore() {
        return String.valueOf( mFreshmanScore );
    }

    public String getSophomoreScore() {
        return String.valueOf( mSophomoreScore );
    }

    public String getJuniorScore() {
        return String.valueOf( mJuniorScore );
    }

}
