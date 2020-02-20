package study3;
// 클래스 멤버, 인스턴스 멤버_클래스 메소드

class Calculator3 {
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    // static으로 인해 클래스 소속 메소드가 된다

    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
    // static으로 인해 클래스 소속 메소드가 된다.
}

public class study3_04 {
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        // static으로 생성된 sum함수를 직접적으로 접근
        Calculator3.avg(10,20);
        // static으로 생성된 avg함수를 직접적으로 접근

        Calculator3.sum(20,40);
        Calculator3.avg(20,40);
    }
}
