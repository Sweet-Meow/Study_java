package study4;
// 상속&생성자_super사용

class Calculator4{
    int left,right;

    public Calculator4() {}

    public Calculator4(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void setOprands4(int left, int right) {
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

class SubCalculator4 extends Calculator4 {
    public SubCalculator4(int left, int right) {
        super(left,right);
    }
    public void substract4() {
        System.out.println(this.left - this.right);
    }
}

public class study4_06 {
    public static void main(String[] args) {
        SubCalculator4 c = new SubCalculator4(10,30);
        c.sum();
        c.avg();
        c.substract4();
    }
}
