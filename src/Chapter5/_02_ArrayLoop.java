package Chapter5;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] G_IDLE = {"소연" , "미연" , "민니" , "우기" , "슈화"};

        //For 반복문 순회
        for (int i = 1; i < 5; i++) {
            System.out.println(G_IDLE[i] + " 퀸카");
        }
        System.out.println("노래 불러주세요");

        System.out.println("============절취선============");

        //배열의 길이를 이용한 순회
        for (int i = 1; i < G_IDLE.length; i++) {
            System.out.println(G_IDLE[i] + " 퀸카");
        }
        System.out.println("노래 불러주세요");

        System.out.println("============절취선============");

        // enhanced for (for-each) 반복문
         for (String IDLE : G_IDLE){
            System.out.println(IDLE + " 노래 불러주세요");
         }
         System.out.println("퀸카 앵콜해주세요");
    }

}
