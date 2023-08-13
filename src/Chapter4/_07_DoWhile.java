package Chapter4;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키
        while (move + height < distance) {
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("=======반복문 1============");

        //키가 업청나게 큰 사람?
        move = 0;
        height = 25;  // 키가 25
        while (move + height < distance){
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("=======반복문 2============");

        //Do while 반복문
        do{
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        } while(move + height < distance);
        System.out.println("도착했습니다.");


        // 나머지 공부
        // 출처: https://nirsa.tistory.com/160
        int num = 0; // num에 6할당

        do {
            System.out.println(num);
            num++;
        }while (num<=999);
        System.out.println("while 조건문인 num 값이 " + num +" 같아졌습니다.");

        /* 순서
        1. num 변수에 6을 할당.
        2. do안에 있는 코드로 인해 num 변수 6이 출력되고 값이 1증가.
        3. while 조건식에 false 되므로 do while 반복문이 종료되어 "program and..."가 출력

        결론, switch 문의 break가 while 문의 do while문
        */



    }
}
