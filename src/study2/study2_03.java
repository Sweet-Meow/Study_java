package study2;
// 입력과 출력_Scanner사용

import java.util.Scanner;
// Scanner사용 시 import해야 할 라이브러리

public class study2_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        /** sc.nextInt() : 사용자의 입력이 있을때까지 변수에 값을
                          할당하지않고 대기상태 유지
         **/

        System.out.println(i * 1000);
        sc.close();
        // scanner 사용 중지
    }
}
