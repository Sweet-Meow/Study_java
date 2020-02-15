package study2;
// 입력과 출력_Scanenr 사용 2

import java.util.Scanner;

public class study2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            // sc.hasNextInt() : 입력값이 생기기 전까지 실행 유보
            System.out.println(sc.nextInt() * 1000);
        }
        sc.close();
    }
}
