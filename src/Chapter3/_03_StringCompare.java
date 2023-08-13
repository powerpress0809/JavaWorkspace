package Chapter3;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "New Jeans";
        String s2 = "BTS";

        System.out.println(s1.equals("New Jeans")); // 문자열 내용이 같으면 true, 다르면 false

        //대소문자 구분 없이 문자열 내용일 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("BtS"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 비밀번호
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false s1과 s2의 위치가 서로 다르기 때문에 false가 나옴



    }
}
