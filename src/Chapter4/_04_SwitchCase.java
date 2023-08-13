package Chapter4;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 전액 장학금 , 2등,3등 반액 장학금, 나머지 없음

        // If Else 문을 이용
        int rank = 5; // 등수

        if (rank == 1) { // 범위
            System.out.println("전액 장학금");
        } else if (rank == 2 || rank == 3)  {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 완료 #1");

        // Switch Case 문을 이용
        rank = 2;
        switch (rank) {
            case 1:
                System.out.println("전액 장학금");
                System.out.println("축하드립니다");
                break;

            case 2 , 3:
                System.out.println("반액 장학금");
                System.out.println("축하드립니다");
                break;

            default:
                System.out.println("장학금 대상 아님");
                System.out.println("수고하셨습니다");
        }System.out.println("장학금 조회 완료 #2");

        // 중고 상품의 등급에 따른 가격을 책정 (1급: 최상 , 4급 : 최하)
        int grade = 3;
        int price = 7000;

        switch (grade){ // (명확한 케이스가 있는 경우)
            case 1:
                price += 3000; // price + 1000;
                break;
            case 2:
                price += 2000;
                break;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price +"원");

        int score = 100;
        if (score >= 90){
            System.out.println('A'+"학점");
        } else if (score >= 80) {
            System.out.println('B'+"학점");
        } else if (score >= 70){
            System.out.println('C'+"학점");
        } else{
            System.out.println("재수강");
        }

    }
}
