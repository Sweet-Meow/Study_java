package study1;
// 메소드_복수인자

public class study1_06 {
    public static void numbering(int init, int limit) {
        int i = init;
        while( i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void  main(String[] args) {
        numbering(1, 5);
        // 메소드 호출 시 매개변수 순서대로 인자 배치
    }
}
