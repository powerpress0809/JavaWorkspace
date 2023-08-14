package Chapter4;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue문

        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; //최대 치킨 개수
        int sold = 0; // 판매 개수
        int noShow = 17; // 노쇼 손님

        for (int i = 1; i <= 50; i++){
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noSHow)
            if (i == noShow){
                System.out.println(i +"번 손님, 안 오시면 다음으로 넘어갑니다");
                System.out.println();
                continue;
            }
            sold++; // 판매 처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다");


        System.out.println();
        System.out.println("===============절취선==================");
        System.out.println();

        // While

        sold = 0; // 판매 개수
        int customer = 0; // 손님 번호

        while (customer <= 50){
            customer++;
            System.out.println(customer + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (customer == noShow){
                System.out.println(customer +"번 손님, 안 오시면 다음으로 넘어갑니다");
                System.out.println();
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }

        }
        System.out.println("영업을 종료합니다");

    }
}
