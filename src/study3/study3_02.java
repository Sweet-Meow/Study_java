package study3;
// 클래스ㆍ인스턴스ㆍ객체_객체화
// 변수 : 상태(state)
// 메소드(함수) : 행동(behave)
/** 하나의 클래스를 바탕으로 서로 다른 상태를 가진
    인스터스를 만들면 서로 다른 행동을 하게 된다
 */


class Calculator {
    // Calculator라는 이름으로 그룹핑
    // 클래스 : 연관되어 있는 변수와 메소드(함수)의 집합
    int left, right;
    // 전역변수 설정

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // this : 클래스를 통해 만들어진 인스턴스 자신을 의미
        // left & right -> 매개변수
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class study3_02 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        // c1에 Calculator클래스를 인스턴스화
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        // c2에 Calculator클래스를 인스턴스화
        c2.setOprands(20,40);
        c2.sum();
        c2.avg();

        Calculator c3 = new Calculator();
        c3.setOprands(100,200);
        c3.sum();
        c3.avg();
    }
}