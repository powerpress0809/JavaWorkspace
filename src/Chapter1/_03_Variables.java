package Chapter1;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "신정훈";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 " + hour + "시에 완료되었습니다");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass  = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.141234456789;
        float f = 3.1412345689f; //float 자료형은 f/F를 붙여줘야함 소숫점 여섯자리까지만 출력되고 나머지는 반올림

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l; // long은 l/L을 붙여줘야함
        l = 1_000_000_000_000l;
        System.out.println(l);

        // int, long, float, double, char, String , boolean
    }
}
