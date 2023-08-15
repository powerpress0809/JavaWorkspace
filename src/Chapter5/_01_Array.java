package Chapter5;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값의 여러 개를 저장하는 연속된 공간
        String NewJeans1 = "민지";
        String NewJeans2 = "하니";
        String NewJeans3 = "해린";
        String NewJeans4 = "혜인";
        String NewJeans5 = "다니엘";


        System.out.println(NewJeans1 + " 뉴진스");
        System.out.println(NewJeans2 + " 뉴진스");
        System.out.println(NewJeans3 + " 뉴진스");
        System.out.println(NewJeans4 + " 뉴진스");
        System.out.println(NewJeans5 + " 뉴진스");

        // 배열 선언 첫 번째 방법
        //String [] NewJeans = new String[5];

        // 배열 선언 두 번째 방법
        // String NewJeans[] = new String[5];
//        NewJeans[0] = "민지"; // 항상 0부터 시작
//        NewJeans[1] = "하니";
//        NewJeans[2] = "해린";
//        NewJeans[3] = "혜인";
//        NewJeans[4] = "다니엘";
//
        // 세번째 방법
        //  String[] NewJeans = new String[] {"민지","하니","해린","혜인","다니엘"};

        // 네번째 방법
        String[] NewJeans = {"민지","하니","해린","혜인","다니엘"};

        // 뉴진스 멤버
        System.out.println(NewJeans[0]); // 민지
        System.out.println(NewJeans[1]); // 하니
        System.out.println(NewJeans[2]); // 해린
        System.out.println(NewJeans[3]); // 혜인
        System.out.println(NewJeans[4]); // 다니엘

        NewJeans[2] = "혜린";
        System.out.println(NewJeans[2]);

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, false, true};
    }
}
