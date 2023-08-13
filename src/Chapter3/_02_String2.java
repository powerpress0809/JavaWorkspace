package Chapter3;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like New Jeans and Ive, StayC and Idle.";

        // 문자열 변환
        System.out.println(s.replace("and", ",")); // " and"를 ","로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작(이전 내용 삭제)
        System.out.println(s.substring(s.indexOf("Jeans")));

        // "New"가 시작하는 위치부터, "."이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("New"),s.indexOf("."))); // 시작 위치부터 끝 위치 "직전"

        // 공백 제거
        s = "                I like Aespa.             ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결합
        String h1 = "BTS";
        String h2 = "New Jeans";
        System.out.println(h1 + h2); // BTSNew Jeans
        System.out.println(h1 +" "+h2); // BTS New Jeans
        System.out.println(h1.concat(", ".concat(h2))); // BTS, New Jeans



    }


}
