package Chapter4;

public class _08_StarField {
    public static void main(String[] args) {
        //하나의 문자 출력을 for문으로 반복해서 해당 모양을 출력
        //예시
        //*SSSSS
        //**SSSS
        //***SSS
        //****SS
        //*****S

        for (int i = 1; i <= 5; i++) { // 마지막 전체 구동
            for (int j = 1; j <= i; j++) {  // * 찍기
                System.out.print("*");
            }
            for (int k = 5; k >= i; k--) {  // S찍기
                System.out.print("S");
            }
            System.out.println();
        }

        System.out.println("===============절취선==================");
        // 정삼각형 만들기
        // 피라미드
        //    *
        //   ***
        //  *****
        // *******
        //*********

        for (int i = 1; i <= 5; i++) { // 마지막 전체 구동
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
             for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
             }
             System.out.println();
        }

        System.out.println("===============절취선==================");
        //역정삼각형 만들기
        //역피라미드
        //*********
        // *******
        //  *****
        //   ***
        //    *

        for (int i = 5; i >= 1; i--) { // 마지막 전체 구동
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("S");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
