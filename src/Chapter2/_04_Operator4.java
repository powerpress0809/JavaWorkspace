package Chapter2;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리연산자 (뉴진스)
        boolean 하니 = true;
        boolean 민지 = true;
        boolean 해린 = true;
        boolean 혜인 = true;
        boolean 다니엘 = true;

        System.out.println(하니 || 민지 || 해린 || 혜인 || 다니엘); // 하나라도 true이면 true (뉴진스 멤버)
        System.out.println(하니 && 민지 && 해린 && 혜인 && 다니엘); // 모두 true 이면 true (뉴진스 멤버)

//      And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다 (false)

//      Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나, 3은 1보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나, 3은 1보다 작다 (false)

//      System.out.println(1 < 3 < 5); 2중 연산은 불가
        System.out.println((1 < 3) && (3 < 5)); // and로 수정
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
