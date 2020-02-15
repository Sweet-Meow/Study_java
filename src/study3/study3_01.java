package study3;
// 클래스ㆍ인스턴스ㆍ객체_메소드화(=함수화)

public class study3_01 {

    public static void  avg(int left, int right) {
        System.out.println(left + right / 2);
        // 입력값인 left, right -> 변수화
    }

    public static void sum(int left, int right) {
        System.out.println(left + right);
        // 입력값인 left, right -> 변수화
    }

    public static void main(String[] args) {
        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);
        // sum()함수 & avg함수 -> 메소드화

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);
        // sum()함수 & avg함수 -> 메소드화
    }
}
