package Chapter4;
import java.util.Scanner;

public class _08_Olympic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("종목을 입력하세요: ");
        String sport = sc.nextLine();
        // String sport = "축구"; // 수영, 달리기, 펜싱만 존재 나머진 Else

         //(sport == "수영")
        if (sport.equals("수영")) {
            {
                for(int i=0; i < 100; i++) {
                    System.out.println("수영을 시작합니다.");
                    System.out.println("현재 " + i + "m를 수영했습니다");
            }
                System.out.println("100m 수영을 완주했습니다.");
            }

        } else if (sport.equals("육상")) {
            {
                for(int i=0; i < 100; i++) {
                    System.out.println("달리기를 시작합니다.");
                    System.out.println("현재 "+ i + "m를 달렸습니다");
                }
                System.out.println("100m 달리기를 완주했습니다.");
            }

        } else if (sport.equals("축구")) {

            int time = 0; // 축구 경기시간 0 부터 90까지 할당

            System.out.println("축구 경기가 시작되었습니다.");
            do {
                System.out.println("축구 경기가 " + time + "분 진행되었습니다.");
                time++;
            } while (time <= 90);
            System.out.println("축구 경기가 모두 진행되었습니다.");

        }

        else {
            System.out.println("종목이 없습니다.");
        }

    }
}
