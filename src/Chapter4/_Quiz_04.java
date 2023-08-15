package Chapter4;
import java.util.Scanner;

public class _Quiz_04 {
// 퀴즈 4
// 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오

// 조건
// 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 주차 요금 예시 및 실행 결과
// 1. 일반 차량 5시간 주차시 20000원
// 주차 요금은 20000원 입니다.
// 2. 경차 5시간 주차시 10000원
// 주차 요금은 10000원 입니다.
// 3. 장애인 차량 10시간 주차시 15000원
// 주차 요금은 15000원 입니다.

// int feeHour = 4000; (일반 차량 요금)
// int feeMax = 30000; (하루 최대 요금)
// Scanner  segCarsc   (차종, segmentCar 스캐너 변수)
// String	segCar     (스캐너에서 받아들일 변수, 입력 값)
// Scanner  parkHoursc (주차 시간, parkHour 스캐너 변수)
// String	parkHour   (스캐너에서 받아들일 변수, 입력 값)

    public static void main(String[] args) {

        int feeHour = 4000;
        int feeMax = 30000;

        System.out.println("차량 번호를 선택하세요 Ex) 1. 일반 차량 / 2. 경차 및 장애인 차량 ");
        Scanner segCarsc = new Scanner(System.in);
        int segCar = segCarsc.nextInt();

        if (segCar == 1){
            System.out.println("주차 시간을 입력하세요");
            Scanner parkHoursc = new Scanner(System.in);
            int parkHour = parkHoursc.nextInt();

             if (feeHour * parkHour >= feeMax){
                 System.out.println("요금은 "+ feeMax + "원입니다");
             }else
                 System.out.println("요금은 " + feeHour * parkHour + "원입니다");

        }
        else if (segCar == 2){
            System.out.println("주차 시간을 입력하세요");
            Scanner parkHoursc = new Scanner(System.in);
            int parkHour = parkHoursc.nextInt();

            if (feeHour * parkHour >= feeMax){
                feeMax= feeMax / 2;
                System.out.println("요금은 "+ feeMax + "원입니다");
            }else
                System.out.println("요금은 " + (feeHour * parkHour) / 2 + "원입니다");
        }

    }

}
