package Chapter4;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf

        //한라봉 에이드가 있으면 +1
        //망고 주스가 있으면 +1
        //아이스 아메리카노 +1

        boolean hallabongAde = true;
        boolean mangoJuice = true;


        if (hallabongAde){
            System.out.println("한라봉 에이드 + 1");
        }else if(mangoJuice){
            System.out.println("망고 주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");


        // else if 는 여러번 사용 가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = false;

        if (hallabongAde){
            System.out.println("한라봉 에이드 + 1");
        }else if(mangoJuice){
            System.out.println("망고 주스 +1");
        }else if(orangeJuice){
            System.out.println("오렌지 쥬스 +1");
        }else { //else는 없어도 가능은 하다
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");



    }
}
