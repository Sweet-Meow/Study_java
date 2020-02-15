package study1;
// 메소드_정의 & 호출

public class study1_04 {
    public static void numbering() {  // 함수정의
        int i = 0;
        while ( i < 10 ) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(); // 함수호출
    }
}
