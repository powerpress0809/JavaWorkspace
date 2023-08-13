package Chapter2;
public class _05_Operater5 {
    public static void main(String[] args) {
        // 삼항 연산자
//         결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;

        int max = (x > y) ? x : y; // x가 y보다 크면 x 출력, 아니면 y 출력
        System.out.println(max); // 5

        int min = (x < y) ? x : y; // x가 y보다 작으면 x 출력, 크면 y 출력
        System.out.println(min); // 3

        x = 3;
        y = 5;
        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y)? "달라요" : "같아요";
        System.out.println(s);
    }
}
