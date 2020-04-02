package study4;
// 상속&생성자

class Calculator3{
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
        class SubCalculator extends Calculator3{
    public SubCalculator (int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void subStract() {
        System.out.println(this.left - this.right);
    }
        }

public class study4_05 {
    public static void main(String[] args) {
        SubCalculator c1 = new SubCalculator(10,30);
        c1.sum();
        c1.avg();
        c1.subStract();
    }
}
