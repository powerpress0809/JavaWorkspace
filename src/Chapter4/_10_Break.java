package Chapter4;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        // 손님이 50명 대기

        //For 문
        int chicken = 20;

        for (int i = 1; i <= 50; i++) {
            System.out.println("치킨이 " + i + "마리 팔렸습니다");

            if (i == chicken){
                System.out.println("치킨이 다 팔렸습니다");
                break;
            }
        }
        System.out.println("영업을 종료합니다");

        System.out.println();
        System.out.println("===============절취선==================");
        System.out.println();


        //While 문
        //while 문은 변수를 따로 선언을 해줘야함.
        int customer = 50; // 손님 50명


        while (customer >= 1){

            System.out.println("치킨이 " + chicken + "개 남았습니다.");
            chicken--;


            System.out.println("손님이 " + customer + "명 남았습니다.");
            customer--;

            System.out.println();

            if(chicken == 0){ // chicken이 0마리에 도달할 때 if 문 break
                System.out.println("치킨이 다팔렸습니다.");
                System.out.println("손님은 아직 " + customer + "명 남았습니다.");
                break;
            }
        }
        System.out.println();
        System.out.println("영업을 종료합니다");

    }
}
