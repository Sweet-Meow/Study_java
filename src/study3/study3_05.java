package study3;
// 클래스 멤버, 인스턴스 멤버_타입비교

class C1 {
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static() {
        System.out.println(static_variable);
    }

    static void static_instane() {
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
        // System.out.println(instance_variable);
    }

    void instance_static() {
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 없다
        System.out.println(static_variable);
    }

    void instance_instance() {
        System.out.println(instance_variable);
    }
}

public class study3_05 {
    public static void main(String[] args) {
        C1 c = new C1();
        // 인스턴스를 이용해서 정적메소드 접근 -> 성공
        // 인스턴스 메소드가 정적변수 접근 -> 성공
        c.static_static();
        // 인스턴스를 이용해서 정적메소드 접근  -> 성공
        // 정적메소드가 인스턴스 변수 접근 -> 실패
        c.static_instane();
        // 인스턴스를 이용해서 인스턴스 메소드 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수 접근 -> 성공
        c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수 접근 -> 성공
        c.instance_instance();
        // 클래스를 이용해서 클래스 메소드 접근 -> 성공
        // 클래스 메소드가 클래스 변수 접근 -> 성공
        C1.static_static();
        // 클래스를 이용해서 클래스 메소드 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수 접근 -> 실패
        C1.static_instane();
        // 클래스를 이용하여 인스턴스 메소드 접근 -> 실패
        // C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드 접근 -> 실패
        // C1.instance_instance();
        }
    }

