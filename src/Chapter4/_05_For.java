package Chapter4;

public class _05_For {
    public static void main(String[] args) {
        //반복문 for
        //나코 매장
        System.out.println("어서오세요. 나코입니다.");
        //또다른 손님이 들어오면
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");

        //만약 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");

        //매장의 이름이 바뀌면?
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        //반복문 사용 For (선언; 조건; 증감;)
        for (int i = 1; i<=10; i++){
        System.out.println("환영합니다. 코나입니다.");
        System.out.println(i+"번째 인사입니다.");
        }

    // 짝수만 출력
      for (int i = 0; i<=10; i+=2){
        System.out.println("환영합니다. 코나입니다.");
        System.out.println(i+"번째 인사입니다.");
        }

      // 홀수만 출력
        for (int i = 1; i<=10; i+=2){
          System.out.println("환영합니다. 코나입니다.");
          System.out.println(i+"번째 인사입니다.");
        }

      // 거꾸로 출력
        for (int i = 10; i > 0; i--){
            System.out.println("환영합니다. 코나입니다.");
            System.out.println(i+"번째 인사입니다.");
        }

      // 1부터 10까지 더하기
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
            System.out.println("현재까지 총합:"+ sum);
        }
        System.out.println("최종합 : "+ sum);
    }
}
