package study4;
// 다양한 종류의 상속 예시

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}


public class study4_04 {
    public static void main(String [] args) {
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(30,50);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }
}
