package Chapter4;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 15;

        if (hour < 14) {
            System.out.println("오후 두시 이전입니다");
        }
        else{ // 그 외의 경우
            System.out.println("오후 두시 이후입니다");
        }
        System.out.println("좋은 하루 되십시오");

        // 오후 두시 이후이거나 모닝 커피를 마신 경우
        hour = 13;
        boolean morningCoffee = true;

        if (hour > 14 || !morningCoffee){
            System.out.println("디카페인 아이스 아메리카노를 마십니다");
        }else{
            System.out.println("아이스 아메리카노를 마십니다");
        }
        System.out.println("커피 주문을 완료했습니다");
    }
}
