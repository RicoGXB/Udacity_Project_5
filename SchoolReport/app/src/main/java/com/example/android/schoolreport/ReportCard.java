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

    //set方法，修改学生姓名
    public void setName(String name) {
        mName = name;
    }

    //set方法，修改第一学期分数
    public void setFreshmanScore(int freshmanScore) {
        mFreshmanScore = freshmanScore;
    }

    //set方法，修改第二续期分数
    public void setSophomoreScore(int sophomoreScore) {
        mSophomoreScore = sophomoreScore;
    }

    //set方法，修改第三学期分数
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
        return Integer.toString( mFreshmanScore );
    }

    public String getSophomoreScore() {
        return Integer.toString( mSophomoreScore );
    }

    public String getJuniorScore() {
        return Integer.toString( mJuniorScore );
    }

    /**
     * Returns the string representation of the {@link ReportCard} object.
     * 将 ReportCard 类中的所有变量都输出为字符串。
     */
    @Override
    public String toString() {
        return "ReportCard{" +
                "mName='" + mName + '\'' +
                ", mSubject='" + mSubject + '\'' +
                ", mFreshmanScore=" + mFreshmanScore +
                ", mSophomoreScore=" + mSophomoreScore +
                ", mJuniorScore=" + mJuniorScore +
                '}';
    }
}
