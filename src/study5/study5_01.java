package study5;
// 오버라이딩(overriding)

class Caltest {
    int left, right;

    public void setTest(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubTest extends Caltest {
    public void sum() {
        System.out.println("실행 결과는 " + (this.left +this.right) + "입니다");
    }
    public void mintest() {
        System.out.println(this.left - this.right);
    }
}

public class study5_01 {
    public static void main(String [] args) {
        SubTest c1 = new SubTest();
        c1.setTest(10,20);
        c1.sum();
        c1.avg();
        c1.mintest();
    }
}
