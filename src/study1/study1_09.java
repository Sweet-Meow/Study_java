package study1;
// 메소드_return

public class study1_09 {
    public  static String num(int i) {
        if (i == 0) {
            return "Zero";
        } else if (i == 1) {
            return "one";
        } else if (i == 2) {
            return "two";
        } else if (i == 3) {
            return "three";
        }
        return "none";
    }
    public static void main(String[] args) {
        System.out.println(num(1));
        System.out.println(num(0));
        System.out.println(num(3));
        System.out.println(num(2));
    }
}
