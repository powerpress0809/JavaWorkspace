package Chapter4;

import java.util.Arrays;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 99; // 오전 10시

        if (hour < 14) {
            System.out.println("아이스 아메리카노");
            System.out.println("샷 추가");
        } else if (hour < 18) {
            {
                System.out.println("스트로베리 스무디");
                System.out.println("크림 추가");
            }
        } else {
            System.out.println("스타벅스를 나가셨습니다");
        }

        // 오후 2시 이전 , 모닝 커피를 마시지 않은 경우 (and)
        hour = 10;
        boolean morningCoffee = false;

        //if (hour < 14 && morningCoffee == false){
        if (hour < 14 && !morningCoffee){
            System.out.println("커피를 마십니다.");
        }
        System.out.println("커피를 다 마셨습니다.");



        // 오후 두시이거나 모닝 커피를 마신 경우 (or)
        hour = 15;
        morningCoffee = true;
        //if (hour < 14 && morningCoffee == true){
        if (hour >= 14 || morningCoffee){
            System.out.println("커피를 이미 마셨습니다.");
        }
        System.out.println("커피를 안 마십니다.");
    }
}
