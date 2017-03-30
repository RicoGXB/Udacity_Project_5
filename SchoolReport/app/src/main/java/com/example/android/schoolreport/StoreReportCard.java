package com.example.android.schoolreport;

import java.util.ArrayList;


/**
 * Created by Rico_company on 17/3/29.
 * {@link StoreReportCard} 保存学生成绩.
 */

public class StoreReportCard {

    private int mPosition;

    /**
     * 初始化StoreReportCard.
     *
     * @param position 学生在数组中的位置
     */
    public StoreReportCard(int position) {
        mPosition = position;
    }

    public ArrayList<ReportCard> getStudentAchievement() {
        //初始化ArrayList<ReportCard>
        ArrayList<ReportCard> studentAchievement = new ArrayList<ReportCard>();
        // 向ArrayList<ReportCard>添加对应的学生成绩
        switch (mPosition) {
            case 0:
                studentAchievement.add( new ReportCard( "语文", "114", "117", "113" ) );
                studentAchievement.add( new ReportCard( "数学", "112", "111", "145" ) );
                studentAchievement.add( new ReportCard( "英语", "117", "141", "110" ) );
                studentAchievement.add( new ReportCard( "物理", "150", "107", "130" ) );
                studentAchievement.add( new ReportCard( "化学", "147", "148", "104" ) );
                studentAchievement.add( new ReportCard( "生物", "117", "116", "134" ) );
                studentAchievement.add( new ReportCard( "总分", "757", "740", "736" ) );
                break;
            case 1:
                studentAchievement.add( new ReportCard( "语文", "111", "123", "117" ) );
                studentAchievement.add( new ReportCard( "数学", "126", "102", "124" ) );
                studentAchievement.add( new ReportCard( "英语", "142", "103", "107" ) );
                studentAchievement.add( new ReportCard( "物理", "141", "103", "128" ) );
                studentAchievement.add( new ReportCard( "化学", "134", "145", "129" ) );
                studentAchievement.add( new ReportCard( "生物", "128", "113", "109" ) );
                studentAchievement.add( new ReportCard( "总分", "782", "689", "714" ) );
                break;
            case 2:
                studentAchievement.add( new ReportCard( "语文", "130", "142", "116" ) );
                studentAchievement.add( new ReportCard( "数学", "108", "117", "100" ) );
                studentAchievement.add( new ReportCard( "英语", "125", "125", "145" ) );
                studentAchievement.add( new ReportCard( "物理", "134", "110", "124" ) );
                studentAchievement.add( new ReportCard( "化学", "143", "106", "132" ) );
                studentAchievement.add( new ReportCard( "生物", "106", "124", "146" ) );
                studentAchievement.add( new ReportCard( "总分", "746", "724", "763" ) );
                break;
            case 3:
                studentAchievement.add( new ReportCard( "语文", "127", "107", "120" ) );
                studentAchievement.add( new ReportCard( "数学", "148", "111", "124" ) );
                studentAchievement.add( new ReportCard( "英语", "102", "137", "111" ) );
                studentAchievement.add( new ReportCard( "物理", "136", "134", "109" ) );
                studentAchievement.add( new ReportCard( "化学", "127", "147", "107" ) );
                studentAchievement.add( new ReportCard( "生物", "140", "101", "103" ) );
                studentAchievement.add( new ReportCard( "总分", "780", "737", "674" ) );
                break;
            case 4:
                studentAchievement.add( new ReportCard( "语文", "100", "145", "128" ) );
                studentAchievement.add( new ReportCard( "数学", "147", "132", "121" ) );
                studentAchievement.add( new ReportCard( "英语", "123", "144", "105" ) );
                studentAchievement.add( new ReportCard( "物理", "150", "129", "102" ) );
                studentAchievement.add( new ReportCard( "化学", "110", "149", "127" ) );
                studentAchievement.add( new ReportCard( "生物", "125", "113", "141" ) );
                studentAchievement.add( new ReportCard( "总分", "755", "812", "724" ) );
                break;
            case 5:
                studentAchievement.add( new ReportCard( "语文", "139", "138", "108" ) );
                studentAchievement.add( new ReportCard( "数学", "123", "146", "133" ) );
                studentAchievement.add( new ReportCard( "英语", "130", "108", "111" ) );
                studentAchievement.add( new ReportCard( "物理", "106", "104", "115" ) );
                studentAchievement.add( new ReportCard( "化学", "140", "140", "103" ) );
                studentAchievement.add( new ReportCard( "生物", "100", "118", "137" ) );
                studentAchievement.add( new ReportCard( "总分", "738", "754", "707" ) );
                break;
            case 6:
                studentAchievement.add( new ReportCard( "语文", "124", "105", "117" ) );
                studentAchievement.add( new ReportCard( "数学", "132", "134", "111" ) );
                studentAchievement.add( new ReportCard( "英语", "119", "117", "139" ) );
                studentAchievement.add( new ReportCard( "物理", "142", "131", "126" ) );
                studentAchievement.add( new ReportCard( "化学", "114", "128", "150" ) );
                studentAchievement.add( new ReportCard( "生物", "122", "112", "141" ) );
                studentAchievement.add( new ReportCard( "总分", "753", "727", "784" ) );
                break;
            case 7:
                studentAchievement.add( new ReportCard( "语文", "105", "106", "150" ) );
                studentAchievement.add( new ReportCard( "数学", "125", "107", "141" ) );
                studentAchievement.add( new ReportCard( "英语", "110", "141", "110" ) );
                studentAchievement.add( new ReportCard( "物理", "147", "149", "109" ) );
                studentAchievement.add( new ReportCard( "化学", "130", "104", "136" ) );
                studentAchievement.add( new ReportCard( "生物", "107", "129", "139" ) );
                studentAchievement.add( new ReportCard( "总分", "724", "736", "785" ) );
                break;
            case 8:
                studentAchievement.add( new ReportCard( "语文", "123", "105", "150" ) );
                studentAchievement.add( new ReportCard( "数学", "126", "107", "111" ) );
                studentAchievement.add( new ReportCard( "英语", "141", "133", "138" ) );
                studentAchievement.add( new ReportCard( "物理", "115", "119", "117" ) );
                studentAchievement.add( new ReportCard( "化学", "130", "150", "129" ) );
                studentAchievement.add( new ReportCard( "生物", "119", "132", "107" ) );
                studentAchievement.add( new ReportCard( "总分", "754", "746", "752" ) );
                break;
            case 9:
                studentAchievement.add( new ReportCard( "语文", "150", "136", "104" ) );
                studentAchievement.add( new ReportCard( "数学", "139", "128", "122" ) );
                studentAchievement.add( new ReportCard( "英语", "119", "122", "126" ) );
                studentAchievement.add( new ReportCard( "物理", "102", "117", "139" ) );
                studentAchievement.add( new ReportCard( "化学", "129", "133", "133" ) );
                studentAchievement.add( new ReportCard( "生物", "123", "116", "101" ) );
                studentAchievement.add( new ReportCard( "总分", "762", "752", "725" ) );
                break;
            case 10:
                studentAchievement.add( new ReportCard( "语文", "130", "112", "132" ) );
                studentAchievement.add( new ReportCard( "数学", "123", "111", "113" ) );
                studentAchievement.add( new ReportCard( "英语", "114", "130", "117" ) );
                studentAchievement.add( new ReportCard( "物理", "105", "126", "147" ) );
                studentAchievement.add( new ReportCard( "化学", "136", "120", "113" ) );
                studentAchievement.add( new ReportCard( "生物", "119", "115", "125" ) );
                studentAchievement.add( new ReportCard( "总分", "727", "714", "747" ) );
                break;
            case 11:
                studentAchievement.add( new ReportCard( "语文", "115", "121", "143" ) );
                studentAchievement.add( new ReportCard( "数学", "148", "144", "150" ) );
                studentAchievement.add( new ReportCard( "英语", "114", "140", "119" ) );
                studentAchievement.add( new ReportCard( "物理", "139", "105", "122" ) );
                studentAchievement.add( new ReportCard( "化学", "113", "122", "150" ) );
                studentAchievement.add( new ReportCard( "生物", "104", "106", "118" ) );
                studentAchievement.add( new ReportCard( "总分", "733", "738", "802" ) );
                break;
            case 12:
                studentAchievement.add( new ReportCard( "语文", "105", "104", "105" ) );
                studentAchievement.add( new ReportCard( "数学", "148", "105", "134" ) );
                studentAchievement.add( new ReportCard( "英语", "100", "123", "109" ) );
                studentAchievement.add( new ReportCard( "物理", "141", "124", "144" ) );
                studentAchievement.add( new ReportCard( "化学", "117", "134", "148" ) );
                studentAchievement.add( new ReportCard( "生物", "150", "116", "113" ) );
                studentAchievement.add( new ReportCard( "总分", "761", "706", "753" ) );
                break;
            case 13:
                studentAchievement.add( new ReportCard( "语文", "150", "146", "107" ) );
                studentAchievement.add( new ReportCard( "数学", "135", "130", "133" ) );
                studentAchievement.add( new ReportCard( "英语", "123", "123", "110" ) );
                studentAchievement.add( new ReportCard( "物理", "100", "129", "117" ) );
                studentAchievement.add( new ReportCard( "化学", "116", "137", "148" ) );
                studentAchievement.add( new ReportCard( "生物", "103", "125", "110" ) );
                studentAchievement.add( new ReportCard( "总分", "727", "790", "725" ) );
                break;
            case 14:
                studentAchievement.add( new ReportCard( "语文", "105", "101", "121" ) );
                studentAchievement.add( new ReportCard( "数学", "146", "146", "123" ) );
                studentAchievement.add( new ReportCard( "英语", "118", "119", "118" ) );
                studentAchievement.add( new ReportCard( "物理", "146", "104", "111" ) );
                studentAchievement.add( new ReportCard( "化学", "119", "146", "131" ) );
                studentAchievement.add( new ReportCard( "生物", "103", "148", "106" ) );
                studentAchievement.add( new ReportCard( "总分", "737", "764", "710" ) );
                break;
            case 15:
                studentAchievement.add( new ReportCard( "语文", "140", "146", "105" ) );
                studentAchievement.add( new ReportCard( "数学", "116", "104", "134" ) );
                studentAchievement.add( new ReportCard( "英语", "141", "131", "109" ) );
                studentAchievement.add( new ReportCard( "物理", "144", "118", "103" ) );
                studentAchievement.add( new ReportCard( "化学", "103", "129", "137" ) );
                studentAchievement.add( new ReportCard( "生物", "147", "114", "122" ) );
                studentAchievement.add( new ReportCard( "总分", "791", "742", "710" ) );
                break;
            case 16:
                studentAchievement.add( new ReportCard( "语文", "104", "125", "134" ) );
                studentAchievement.add( new ReportCard( "数学", "130", "114", "100" ) );
                studentAchievement.add( new ReportCard( "英语", "126", "126", "144" ) );
                studentAchievement.add( new ReportCard( "物理", "122", "133", "116" ) );
                studentAchievement.add( new ReportCard( "化学", "140", "138", "105" ) );
                studentAchievement.add( new ReportCard( "生物", "129", "111", "125" ) );
                studentAchievement.add( new ReportCard( "总分", "751", "747", "724" ) );
                break;
            case 17:
                studentAchievement.add( new ReportCard( "语文", "100", "143", "136" ) );
                studentAchievement.add( new ReportCard( "数学", "150", "115", "144" ) );
                studentAchievement.add( new ReportCard( "英语", "135", "106", "108" ) );
                studentAchievement.add( new ReportCard( "物理", "105", "127", "113" ) );
                studentAchievement.add( new ReportCard( "化学", "125", "102", "101" ) );
                studentAchievement.add( new ReportCard( "生物", "128", "102", "114" ) );
                studentAchievement.add( new ReportCard( "总分", "743", "695", "716" ) );
                break;
            case 18:
                studentAchievement.add( new ReportCard( "语文", "134", "118", "141" ) );
                studentAchievement.add( new ReportCard( "数学", "137", "135", "104" ) );
                studentAchievement.add( new ReportCard( "英语", "131", "117", "135" ) );
                studentAchievement.add( new ReportCard( "物理", "100", "128", "100" ) );
                studentAchievement.add( new ReportCard( "化学", "109", "142", "150" ) );
                studentAchievement.add( new ReportCard( "生物", "132", "102", "109" ) );
                studentAchievement.add( new ReportCard( "总分", "743", "742", "739" ) );
                break;
            case 19:
                studentAchievement.add( new ReportCard( "语文", "109", "116", "108" ) );
                studentAchievement.add( new ReportCard( "数学", "145", "125", "108" ) );
                studentAchievement.add( new ReportCard( "英语", "108", "112", "145" ) );
                studentAchievement.add( new ReportCard( "物理", "144", "129", "102" ) );
                studentAchievement.add( new ReportCard( "化学", "145", "131", "138" ) );
                studentAchievement.add( new ReportCard( "生物", "133", "142", "106" ) );
                studentAchievement.add( new ReportCard( "总分", "784", "755", "707" ) );
                break;
        }

        return studentAchievement;
    }

}
