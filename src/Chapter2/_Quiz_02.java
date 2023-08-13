package Chapter2;

public class _Quiz_02 {
// 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.

// 키가 120cm 이상인 경우에만 탑승 가능
// 삼항 연산자 이용
   public static void main(String[] args) {

    int kid1_Height = 115;
    int kid2_Height = 121;

//    내가 푼 방식
    System.out.println((kid1_Height >= 120) ? "키가 "+ kid1_Height + "cm 이므로 탑승이 가능합니다."
            : "키가 "+ kid1_Height + "cm 이므로 탑승이 불가능합니다.");

    System.out.println((kid2_Height >= 120) ? "키가 "+ kid2_Height + "cm 이므로 탑승이 가능합니다."
            : "키가 "+ kid2_Height + "cm 이므로 탑승이 불가능합니다.");

//  나도 코딩 방식

    String result1 = (kid1_Height >= 120) ? "탑승이 가능합니다." : "탑승이 불가능합니다.";
    System.out.println("키가 "+ kid1_Height + "cm 이므로 " + result1);

    String result2 = (kid2_Height >= 120) ? "탑승이 가능합니다." : "탑승이 불가능합니다.";
    System.out.println("키가 "+ kid2_Height + "cm 이므로 " + result2);

    }
}
