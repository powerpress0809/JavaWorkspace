package Chapter3;

public class _Quiz_03 {

//  주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

//  주민등록번호는 13자리의 숫자로 구성
//  주민등록번호는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
//  입력 데이터는 -을 포함한 14자리의 문자열 형태

//  960809-1020019인 경우 960809-1까지 출력

    public static void main(String[] args) {
        String citizenNum1 = "960809-1020019";
        String citizenNum2 = "920221-2019017";

        //남자
        String citizenNum1Sex = citizenNum1.substring(7,8).equals("1")? "남자":"여자";

        //여자
        String citizenNum2Sex = citizenNum2.substring(7,8).equals("1")? "남자":"여자";

        //나의 코딩(+ 성별)
        System.out.println(citizenNum1.substring(0,8));
        System.out.println("당신은 " + citizenNum1Sex + "입니다\n");
        System.out.println(citizenNum2.substring(0,8));
        System.out.println("당신은 " + citizenNum2Sex + "입니다\n");

        //나도 코딩
        System.out.println(citizenNum1.substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(citizenNum1.substring(0,citizenNum1.indexOf("-") + 2));

    }
}
