package Chapter3;

import java.sql.SQLOutput;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Social Character)
        // \n \t \\ \"\'
        System.out.println("뉴진스가");
        System.out.println("너무");
        System.out.println("귀여워요");
        // \n
        System.out.println("뉴진스가\n너무\n귀여워요");

        // \t : 탭
        //뉴진스 앨범 9000원
        //아이브 앨범 10000원
        //에스파 앨범 8000원
        System.out.println("뉴진스 앨범\t\t9000원");
        System.out.println("아이브 앨범\t\t10000원");
        System.out.println("에스파 앨범\t\t8000원");

        // \\ : 역슬래시
        System.out.println("D:\\신한 DS\\Workspace\\JavaWorkspace\\src\\Chapter3");

        // \": 큰 따옴표
        //단비가 "냐용" 이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \': 작은 따옴표
        //단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\'라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?'라는 표정을 지었어요");

        char c = 'A';
        c = '\'';

        System.out.println(c);

    }
}
