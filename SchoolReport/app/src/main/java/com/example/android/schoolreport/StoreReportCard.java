package com.example.android.schoolreport;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Rico_company on 17/3/29.
 * {@link StoreReportCard} 保存学生成绩.
 */

public class StoreReportCard {

    private ArrayList<ReportCard> mStoreReportCard; //保存学生成绩

    /**
     * 初始化StoreReportCard.
     */
    public StoreReportCard() {
        mStoreReportCard = new ArrayList<ReportCard>();

        mStoreReportCard.add( new ReportCard( "门钰程", "语文", 113, 117, 113 ) );
        mStoreReportCard.add( new ReportCard( "门钰程", "数学", 112, 111, 145 ) );
        mStoreReportCard.add( new ReportCard( "门钰程", "英语", 117, 141, 110 ) );
        mStoreReportCard.add( new ReportCard( "门钰程", "物理", 150, 107, 130 ) );
        mStoreReportCard.add( new ReportCard( "门钰程", "化学", 147, 148, 104 ) );
        mStoreReportCard.add( new ReportCard( "门钰程", "生物", 117, 116, 134 ) );

        mStoreReportCard.add( new ReportCard( "张帆", "语文", 111, 123, 117 ) );
        mStoreReportCard.add( new ReportCard( "张帆", "数学", 126, 102, 124 ) );
        mStoreReportCard.add( new ReportCard( "张帆", "英语", 142, 103, 107 ) );
        mStoreReportCard.add( new ReportCard( "张帆", "物理", 141, 103, 128 ) );
        mStoreReportCard.add( new ReportCard( "张帆", "化学", 134, 145, 129 ) );
        mStoreReportCard.add( new ReportCard( "张帆", "生物", 128, 113, 109 ) );

        mStoreReportCard.add( new ReportCard( "王绍宇", "语文", 130, 142, 116 ) );
        mStoreReportCard.add( new ReportCard( "王绍宇", "数学", 108, 117, 100 ) );
        mStoreReportCard.add( new ReportCard( "王绍宇", "英语", 125, 125, 145 ) );
        mStoreReportCard.add( new ReportCard( "王绍宇", "物理", 134, 110, 124 ) );
        mStoreReportCard.add( new ReportCard( "王绍宇", "化学", 143, 106, 132 ) );
        mStoreReportCard.add( new ReportCard( "王绍宇", "生物", 106, 124, 146 ) );

        mStoreReportCard.add( new ReportCard( "吕晓虹", "语文", 127, 107, 120 ) );
        mStoreReportCard.add( new ReportCard( "吕晓虹", "数学", 148, 111, 124 ) );
        mStoreReportCard.add( new ReportCard( "吕晓虹", "英语", 102, 137, 111 ) );
        mStoreReportCard.add( new ReportCard( "吕晓虹", "物理", 136, 134, 109 ) );
        mStoreReportCard.add( new ReportCard( "吕晓虹", "化学", 127, 147, 107 ) );
        mStoreReportCard.add( new ReportCard( "吕晓虹", "生物", 140, 101, 103 ) );

        mStoreReportCard.add( new ReportCard( "张文赫", "语文", 100, 145, 128 ) );
        mStoreReportCard.add( new ReportCard( "张文赫", "数学", 147, 132, 121 ) );
        mStoreReportCard.add( new ReportCard( "张文赫", "英语", 123, 144, 105 ) );
        mStoreReportCard.add( new ReportCard( "张文赫", "物理", 150, 129, 102 ) );
        mStoreReportCard.add( new ReportCard( "张文赫", "化学", 110, 149, 127 ) );
        mStoreReportCard.add( new ReportCard( "张文赫", "生物", 125, 113, 141 ) );

        mStoreReportCard.add( new ReportCard( "崔子佩", "语文", 139, 138, 108 ) );
        mStoreReportCard.add( new ReportCard( "崔子佩", "数学", 123, 146, 133 ) );
        mStoreReportCard.add( new ReportCard( "崔子佩", "英语", 130, 108, 111 ) );
        mStoreReportCard.add( new ReportCard( "崔子佩", "物理", 106, 104, 115 ) );
        mStoreReportCard.add( new ReportCard( "崔子佩", "化学", 140, 140, 103 ) );
        mStoreReportCard.add( new ReportCard( "崔子佩", "生物", 100, 118, 137 ) );

        mStoreReportCard.add( new ReportCard( "李炜康", "语文", 124, 105, 117 ) );
        mStoreReportCard.add( new ReportCard( "李炜康", "数学", 132, 134, 111 ) );
        mStoreReportCard.add( new ReportCard( "李炜康", "英语", 119, 117, 139 ) );
        mStoreReportCard.add( new ReportCard( "李炜康", "物理", 142, 131, 126 ) );
        mStoreReportCard.add( new ReportCard( "李炜康", "化学", 114, 128, 150 ) );
        mStoreReportCard.add( new ReportCard( "李炜康", "生物", 122, 112, 141 ) );

        mStoreReportCard.add( new ReportCard( "程弈超", "语文", 105, 106, 150 ) );
        mStoreReportCard.add( new ReportCard( "程弈超", "数学", 125, 107, 141 ) );
        mStoreReportCard.add( new ReportCard( "程弈超", "英语", 110, 141, 110 ) );
        mStoreReportCard.add( new ReportCard( "程弈超", "物理", 147, 149, 109 ) );
        mStoreReportCard.add( new ReportCard( "程弈超", "化学", 130, 104, 136 ) );
        mStoreReportCard.add( new ReportCard( "程弈超", "生物", 107, 129, 139 ) );

        mStoreReportCard.add( new ReportCard( "周晓文", "语文", 123, 105, 150 ) );
        mStoreReportCard.add( new ReportCard( "周晓文", "数学", 126, 107, 111 ) );
        mStoreReportCard.add( new ReportCard( "周晓文", "英语", 141, 133, 138 ) );
        mStoreReportCard.add( new ReportCard( "周晓文", "物理", 115, 119, 117 ) );
        mStoreReportCard.add( new ReportCard( "周晓文", "化学", 130, 150, 129 ) );
        mStoreReportCard.add( new ReportCard( "周晓文", "生物", 119, 132, 107 ) );

        mStoreReportCard.add( new ReportCard( "梁人之", "语文", 150, 136, 104 ) );
        mStoreReportCard.add( new ReportCard( "梁人之", "数学", 139, 128, 122 ) );
        mStoreReportCard.add( new ReportCard( "梁人之", "英语", 119, 122, 126 ) );
        mStoreReportCard.add( new ReportCard( "梁人之", "物理", 102, 117, 139 ) );
        mStoreReportCard.add( new ReportCard( "梁人之", "化学", 129, 133, 133 ) );
        mStoreReportCard.add( new ReportCard( "梁人之", "生物", 123, 116, 101 ) );

        mStoreReportCard.add( new ReportCard( "全彦青", "语文", 130, 112, 132 ) );
        mStoreReportCard.add( new ReportCard( "全彦青", "数学", 123, 111, 113 ) );
        mStoreReportCard.add( new ReportCard( "全彦青", "英语", 114, 130, 117 ) );
        mStoreReportCard.add( new ReportCard( "全彦青", "物理", 105, 126, 147 ) );
        mStoreReportCard.add( new ReportCard( "全彦青", "化学", 136, 120, 113 ) );
        mStoreReportCard.add( new ReportCard( "全彦青", "生物", 119, 115, 125 ) );

        mStoreReportCard.add( new ReportCard( "张喜帜", "语文", 115, 121, 143 ) );
        mStoreReportCard.add( new ReportCard( "张喜帜", "数学", 148, 144, 150 ) );
        mStoreReportCard.add( new ReportCard( "张喜帜", "英语", 114, 140, 119 ) );
        mStoreReportCard.add( new ReportCard( "张喜帜", "物理", 139, 105, 122 ) );
        mStoreReportCard.add( new ReportCard( "张喜帜", "化学", 113, 122, 150 ) );
        mStoreReportCard.add( new ReportCard( "张喜帜", "生物", 104, 106, 118 ) );

        mStoreReportCard.add( new ReportCard( "赵羽菲", "语文", 105, 104, 105 ) );
        mStoreReportCard.add( new ReportCard( "赵羽菲", "数学", 148, 105, 134 ) );
        mStoreReportCard.add( new ReportCard( "赵羽菲", "英语", 100, 123, 109 ) );
        mStoreReportCard.add( new ReportCard( "赵羽菲", "物理", 141, 124, 144 ) );
        mStoreReportCard.add( new ReportCard( "赵羽菲", "化学", 117, 134, 148 ) );
        mStoreReportCard.add( new ReportCard( "赵羽菲", "生物", 150, 116, 113 ) );

        mStoreReportCard.add( new ReportCard( "王媛媛", "语文", 150, 146, 107 ) );
        mStoreReportCard.add( new ReportCard( "王媛媛", "数学", 135, 130, 133 ) );
        mStoreReportCard.add( new ReportCard( "王媛媛", "英语", 123, 123, 110 ) );
        mStoreReportCard.add( new ReportCard( "王媛媛", "物理", 100, 129, 117 ) );
        mStoreReportCard.add( new ReportCard( "王媛媛", "化学", 116, 137, 148 ) );
        mStoreReportCard.add( new ReportCard( "王媛媛", "生物", 103, 125, 110 ) );

        mStoreReportCard.add( new ReportCard( "李宗霖", "语文", 105, 101, 121 ) );
        mStoreReportCard.add( new ReportCard( "李宗霖", "数学", 146, 146, 123 ) );
        mStoreReportCard.add( new ReportCard( "李宗霖", "英语", 118, 119, 118 ) );
        mStoreReportCard.add( new ReportCard( "李宗霖", "物理", 146, 104, 111 ) );
        mStoreReportCard.add( new ReportCard( "李宗霖", "化学", 119, 146, 131 ) );
        mStoreReportCard.add( new ReportCard( "李宗霖", "生物", 103, 148, 106 ) );

        mStoreReportCard.add( new ReportCard( "王择源", "语文", 140, 146, 105 ) );
        mStoreReportCard.add( new ReportCard( "王择源", "数学", 116, 104, 134 ) );
        mStoreReportCard.add( new ReportCard( "王择源", "英语", 141, 131, 109 ) );
        mStoreReportCard.add( new ReportCard( "王择源", "物理", 144, 118, 103 ) );
        mStoreReportCard.add( new ReportCard( "王择源", "化学", 103, 129, 137 ) );
        mStoreReportCard.add( new ReportCard( "王择源", "生物", 147, 114, 122 ) );

        mStoreReportCard.add( new ReportCard( "宋云婷", "语文", 104, 125, 134 ) );
        mStoreReportCard.add( new ReportCard( "宋云婷", "数学", 130, 114, 100 ) );
        mStoreReportCard.add( new ReportCard( "宋云婷", "英语", 126, 126, 144 ) );
        mStoreReportCard.add( new ReportCard( "宋云婷", "物理", 122, 133, 116 ) );
        mStoreReportCard.add( new ReportCard( "宋云婷", "化学", 140, 138, 105 ) );
        mStoreReportCard.add( new ReportCard( "宋云婷", "生物", 129, 111, 125 ) );

        mStoreReportCard.add( new ReportCard( "王艺霖", "语文", 100, 143, 136 ) );
        mStoreReportCard.add( new ReportCard( "王艺霖", "数学", 150, 115, 144 ) );
        mStoreReportCard.add( new ReportCard( "王艺霖", "英语", 135, 106, 108 ) );
        mStoreReportCard.add( new ReportCard( "王艺霖", "物理", 105, 127, 113 ) );
        mStoreReportCard.add( new ReportCard( "王艺霖", "化学", 125, 102, 101 ) );
        mStoreReportCard.add( new ReportCard( "王艺霖", "生物", 128, 102, 114 ) );

        mStoreReportCard.add( new ReportCard( "赵海霞", "语文", 134, 118, 141 ) );
        mStoreReportCard.add( new ReportCard( "赵海霞", "数学", 137, 135, 104 ) );
        mStoreReportCard.add( new ReportCard( "赵海霞", "英语", 131, 117, 135 ) );
        mStoreReportCard.add( new ReportCard( "赵海霞", "物理", 100, 128, 100 ) );
        mStoreReportCard.add( new ReportCard( "赵海霞", "化学", 109, 142, 150 ) );
        mStoreReportCard.add( new ReportCard( "赵海霞", "生物", 132, 102, 109 ) );

        mStoreReportCard.add( new ReportCard( "丛鸣", "语文", 109, 116, 108 ) );
        mStoreReportCard.add( new ReportCard( "丛鸣", "数学", 145, 125, 108 ) );
        mStoreReportCard.add( new ReportCard( "丛鸣", "英语", 108, 112, 145 ) );
        mStoreReportCard.add( new ReportCard( "丛鸣", "物理", 144, 129, 102 ) );
        mStoreReportCard.add( new ReportCard( "丛鸣", "化学", 145, 131, 138 ) );
        mStoreReportCard.add( new ReportCard( "丛鸣", "生物", 133, 142, 106 ) );
    }


    public ArrayList<ReportCard> getStudentAchievement(String studentName) {

        //初始化ArrayList<ReportCard>,临时保存取出的学生成绩
        ArrayList<ReportCard> studentAchievement = new ArrayList<ReportCard>();

        // 向ArrayList<ReportCard>添加对应的学生成绩
        for (int index = 0; index < mStoreReportCard.size(); index++) {
            ReportCard achievement = mStoreReportCard.get( index );
            String name = achievement.getName();
            if (name.equals( studentName )) {
                studentAchievement.add( achievement );
            }
        }
        return studentAchievement;
    }

    //修改学生成绩，并保存
    public void setStudentAchievement(HashMap<String, String> textValues) {

        for (int index = 0; index < mStoreReportCard.size(); index++) {
            ReportCard achievement = mStoreReportCard.get( index );
            String key = achievement.getName();
            key += achievement.getSubject();
            if (textValues.containsKey( "freshmanScore" + key )) {
                achievement.setFreshmanScore( Integer.parseInt( textValues.get( "freshmanScore" + key ) ) );
            }
            if (textValues.containsKey( "sophomoreScore" + key )) {
                achievement.setSophomoreScore( Integer.parseInt( textValues.get( "sophomoreScore" + key ) ) );
            }
            if (textValues.containsKey( "juniorScore" + key )) {
                achievement.setJuniorScore( Integer.parseInt( textValues.get( "juniorScore" + key ) ) );
            }
        }
    }

}
