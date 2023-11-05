package com.ziio.backend.constants;

public class CrawlingArray {
    // 메인 웹사이트 정보 (category_id, category_name, 변수, 페이지 제한)
    public static final String[][] MAIN_ALL_INFOS = new String[][]{{"100100000","일반공지","GENERALNOTICES","5"}, {"100101000","학사공지","HAKSANOTICE","5"}, {"100102000","장학공지","JANGHAKNOTICE","5"}};

    // 단과대 & 학과 웹사이트 정보 (category_id, category_name, 변수, notice 번호, 페이지 제한)
    public static final String[][] COLLEGE_AND_DEPARTMENT_ALL_INFOS = new String[][]{
            {"101100000","불교대학","bs","","3"}, {"101101000","문과대학","liberal","","3"}, {"101102000","이과대학","science","","3"},
            {"101103000","법과대학","law","1","3"}, {"101104000","사회과학대학","social","","3"}, {"101105000","경영대학","sba","","3"},
            {"101106000","경찰사법대학","justice","","3"}, {"101107000","바이오시스템대학","life","","3"}, {"101108000","AI융합대학","ai","","3"},
            {"101109000","공과대학","engineer","1","3"}, {"101110000","사범대학","edu","","3"}, {"101111000","약학대학","pharm","","3"},
            {"101113000","다르마칼리지","dharma","","3"}, {"101114000","예술대학","art","","3"},
            {"101101100","국어국문문예창작학부","kor-cre","2","3"}, {"101101101","영어영문학부","english","1","3"},
            {"101101102","일본학과","dj","","3"}, {"101101103","중어중문학과","china","","3"}, {"101101104","철학과","sophia","","3"},
            {"101101105","사학과","history","","3"}, {"101102100","수학과","math","","3"}, {"101102101","화학과","chem","","3"},
            {"101102103","물리반도체과학부","physics","1","3"}, {"101104100","정치외교학전공","politics","2","3"}, {"101104101","행정학전공","pa","1","3"},
            {"101104102","북한학전공","nk","","3"}, {"101104103","경제학과","econ","","3"}, {"101104104","국제통상학과","itrade","","3"},
            {"101104105","사회학전공","sociology","","3"}, {"101104106","미디어커뮤니케이션전공","comm","1","3"}, {"101104107","식품산업관리학과","poodindus","1","3"},
            {"101104109","사회복지학과","welfare","","3"}
            // 추후 추가 예정
    };
    // 기타 웹사이트 정보
}