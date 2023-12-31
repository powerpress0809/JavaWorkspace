package Chapter1;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
//     1. 저장할 값에 어울리는 이름
//     2. 밑줄(_), 문자 (abc), 숫자(1,2,3) 사용 가능 (공백 사용 불가)
//     3. 밑줄 또는 문자로 시작 가능
//     4. 한 단어 또는 2개 이상 단어의 연속
//     5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
//     6. 에약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "정훈"; // 이름
        String lastName = "신"; // 성
        String dateOfBirth = "1996-08-09"; //생년월일
        String residentialAddress = "리베라 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "A380"; //항공편명
        String _flightNo = "A380"; //밑줄시작
        String flight_No_2 = "A380"; //항공편명
        // String -flightNo = "A380"; 변수명에 특수문자 먼저 입력 불가

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "노트북";
        String item3 = "가방";
        // String 4item = "시계"; 변수명에 숫자 먼저 입력 불가

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "sssssssssssssssssss";
        String str = "kkkkkkkkkkkkkkkkkk";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE="KR";
//        CODE = "US"; final은 변수 값 변경 불가

        System.out.println(nationality + "(" + CODE + ") " + lastName + firstName + " " + dateOfBirth);
        System.out.println(residentialAddress + " " + purposeOfVisit);
        System.out.println(flightNo + " " + flight_No_2 + " " + _flightNo);
        System.out.println("동반 인원은 " + accompany + "명이며 체류 기간은 총 " + lengthOfStay + "일입니다");
        System.out.println("가져오신 물건은 " + item1 + ", " + item2 + ", " + item3 + "입니다.");
    }
}
