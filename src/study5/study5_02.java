package study5;
//추상 메소드 관련 - abstract

abstract class A {
    public abstract int b();
    // 본체가 있는 메소드는 abstract 불가능
    // public abstract int c(){System.out.println("Hello");}
    // 추상 클래스 내에는 추상 메소드가 아닌 메소드는 존재 불가

    public void d() {
        System.out.println("World!");
    }
}

public class study5_02 {
    public static void main(String[] args) {
        // A obj = new A();
        // 추상 클래스인 A를 인스턴스화하면 에러발생!
    }
}
