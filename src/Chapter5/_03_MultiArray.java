package Chapter5;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열

        // 여자 아이돌

        // 뉴진스
        String[] NewJeans = {"민지","하니","해린","혜인","다니엘"};

        // 아이들
        String[] G_IDLE = {"소연","미연","민니","우기","슈화"};

        // 르세라핌
        String[] Lesserafim = {"채원","윤진","사쿠라","카즈하","은채"};

        // 스테이씨
        String[] STAYC = {"수민","시은","아이사","세은","윤","제이"};

        // 3 * 5 크기의 2차원 배열
        String[][] IDOL = new String[][] {
                {"민지","하니","해린","혜인","다니엘"},     // 0행
                {"소연","미연","민니","우기","슈화"},       // 1행
                {"채원","윤진","사쿠라","카즈하","은채"},   //  2행
                {"수민","시은","아이사","세은","윤","제이"}  // 3행
        };

        // 아이들의 우기를 조회하려면
        System.out.println("아이돌 " + IDOL[1][3]);

        // 스테이씨의 제이를 조회하려면
        System.out.println("아이돌 " + IDOL[3][5]);

        // 3차원 배열 만들기
        String [][][] Array = new String[3][3][3];

    }
}
