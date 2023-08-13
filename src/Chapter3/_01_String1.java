package Chapter3;

public class _01_String1 {
    public static void main(String[] args) {
       String s = "I like New Jeans and Ive, StayC and Idle.";
       System.out.println(s);

       // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("Ive")); // contains(포함 확인) 포함되면 true 포함 안되면 false
        System.out.println(s.contains("Aespa")); // contains(포함 확인) 포함되면 true 포함 안되면 false
        System.out.println(s.indexOf("New Jeans")); // 위치 정보
        System.out.println(s.indexOf("Aespa")); // indexOf(위치 정보) 문자열 위치 확인 없으면 -1
        System.out.println(s.indexOf("and")); // 위치 정보
        System.out.println(s.lastIndexOf("and")); //lastindexOf(마지막 위치 정보) 마지막 문자역 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true


    }
}
