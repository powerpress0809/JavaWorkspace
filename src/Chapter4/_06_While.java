package Chapter4;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        // 수영장에서 수영하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        //move가 0부터 distance인 25까지 도달할때까지 반복 수행...
        // 0은 모든 수의 배수ㅇ

        while (move < distance){
            // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3; // 3미터씩 이동
        }
        System.out.println("도착하였습니다.");

       /* // 무한 루프
        move = 0;
        while (move < distance){
            // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
        }
        System.out.println("도착하였습니다.");*/
    }
}
