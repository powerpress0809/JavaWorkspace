package Chapter5;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {

        // 다차원 배열 순회
        String[][] IDOL = new String[][] {
                {"민지","하니","해린","혜인","다니엘"},     // 0행
                {"소연","미연","민니","우기","슈화"},       // 1행
                {"채원","윤진","사쿠라","카즈하","은채"},   //  2행
                {"수민","시은","아이사","세은","윤","제이"}  // 3행
        };

        for (int i = 0; i < IDOL.length; i++){
            for (int j = 0; j < IDOL[i].length; j++) {
                System.out.print(IDOL[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=================================");

        // 아이돌 오디션 참가자 명단
        String [][] Audition = new String[3][10];
        String [] pos = {" Vocal" ,"Visual" ," Dance"};
        for (int i = 0; i < Audition.length; i++){
            for (int j = 0; j < Audition[i].length; j++) {
                System.out.print(Audition[i][j] = pos[i] + (j + 1) + " ");
            }
            System.out.println();
        }

        System.out.println("=================================");

        for (int i = 0; i < Audition.length; i++){
            for (int j = 0; j < Audition[i].length; j++) {
                System.out.print(Audition[i][j] + " ");
            }
            System.out.println();
        }

    }
}
