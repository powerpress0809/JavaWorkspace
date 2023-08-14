package Chapter4;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 직삼각형 그리기
        /* 예시

        *
        **
        ***
        ****
        *****

        */
        for (int i = 1; i <= 5; i++){    // 간단하게 작업을 5번 수행 (i가 1부터 시작하여 5까지 반복)
            for (int j = 1; j <= i; j++){   // 별표를 출력하는 역할 (j가 1부터 시작하여 i 값까지 반복)
                System.out.print("*");      //i = 1 , j = 1
                                            //i = 2 , j = 2
                                            //i = 3 , j = 3
                                            //i = 4 , j = 4
                                            //i = 5 , j = 5
            }
            System.out.println();
        }

        System.out.println("==============================절취선=================================");

        // 별 오른쪽으로 치우친 삼각형 그리기
        /* 예시

             *
            **
           ***
          ****
         *****

         */
        for (int i = 1; i <= 5; i++){    // 간단하게 작업을 5번 수행 (i가 1부터 시작하여 5까지 반복)
            for (int j = 1; j <= 5 - i; j++){   // 별표를 출력하는 역할 (j가 1부터 시작하여 i 값까지 반복)
                System.out.print(" ");
                //i = 5 , j = 1
                //i = 4 , j = 2
                //i = 3 , j = 3
                //i = 2 , j = 4
                //i = 1 , j = 5
            }
            for (int k = 1; k <= i; k++){   // 별표를 출력하는 역할 (j가 1부터 시작하여 i 값까지 반복)
                System.out.print("*");      //i = 1 , j = 1
                //i = 2 , j = 2
                //i = 3 , j = 3
                //i = 4 , j = 4
                //i = 5 , j = 5
            }
            System.out.println();
        }


        System.out.println("==============================절취선=================================");

        // 역직삼각형 그리기
        /* 예시

         *****
         ****
         ***
         **
         *

         */
        for (int i = 5; i >= 1; i--){    // 간단하게 작업을 5번 수행 (i가 1부터 시작하여 5까지 반복)
            for (int j = 1; j <= i; j++){   // 별표를 출력하는 역할 (j가 1부터 시작하여 i 값까지 반복)
                System.out.print("*");
                //i = 5 , j = 1
                //i = 4 , j = 2
                //i = 3 , j = 3
                //i = 2 , j = 4
                //i = 1 , j = 5
            }
            System.out.println();
        }


    }
}