package study6;

class Calculator6 {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubjectCalculator extends Calculator6 {
    public void sum() {
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }
    public int avg() {
        return super.avg();
    }

    public void subcal() {
        System.out.println(this.left - this.right);
    }
}

public class overriding_1 {
    public static void main(String[] args) {
        SubjectCalculator c1 = new SubjectCalculator();
        c1.setOprands(20,50);
        c1.sum();
        System.out.println("실행결과는 " + c1.avg());
        c1.subcal();
    }
}
