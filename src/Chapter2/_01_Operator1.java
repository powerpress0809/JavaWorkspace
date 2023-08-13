package Chapter2;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자


        // 일반 연산자
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = 30;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++ , --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 1을 더한 후 출력
        System.out.println(val);

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 11을 출력 후 1 더 함
        System.out.println(val);

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val);

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기표
        int wait = 0;
        System.out.println("대기 인원 : " + wait++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + wait++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + wait++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + wait); // 총 대기 인원 : 3

    }
}
