package Chapter4;

public class _09_MulipleTable {
    public static void main(String[] args) {
        // 구구단 2단
        // 2 * 1 = 2
        // 2 * 2 = 4

        System.out.println("구구단 2단을 출력합니다");
        for (int i = 1; i <= 9; i++){ // 2단
            System.out.println("2 X " + i + " = " + 2 * i);
        }

        System.out.println();
        System.out.println("================================절취선=====================================");
        System.out.println();
        // 이중 For 문을 이용하여 1단부터 9단까지 한번에 출력 시킬 수 있다.

        System.out.println("구구단을 1단부터 9단까지 출력합니다.");
        System.out.println();
        for (int i = 1; i <= 9; i++){ // 단
            System.out.println("구구단 " + i +"단을 출력합니다.");
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println("구구단 " + i + "단 출력이 완료되었습니다.");
            System.out.println();
        }

    }
}
