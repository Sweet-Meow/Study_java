package study3;
// 클래스 멤버, 인스턴스 멤버_클래스 변수

class Calculator2 {
    static double PI = 3.14;
    // static : 멤버(변수, 메소드)앞에 붙이면 클래스의 멤버
    // 생성된 인스턴스에 기본적으로 생성되는 값
    static int base = 119;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }

}

public class study3_03 {
    public static void main(String[] args){
        Calculator2 c1 = new Calculator2();
        System.out.println(c1.PI);
        c1.sum();
        c1.avg();

        Calculator2 c2 = new Calculator2();
        System.out.println(c2.PI);
        c2.sum();
        c2.avg();

        System.out.println(Calculator2.PI);
    }
}
