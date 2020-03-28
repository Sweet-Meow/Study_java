package study4;
// 상속(Ingeritance)

/** 어떤 객체가 있을 때 그 객체의 필드(변수)와 메소드를
 *  다른 객체가 물려 받을 수 있는 기능
 */

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
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

// extends를 통해 Calculator라는 클래스를 상속
class SubStractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class study4_03 {

    public static void main(String[] args) {
        SubStractionableCalculator c1 = new SubStractionableCalculator();
        c1.setOprands(20,30);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
