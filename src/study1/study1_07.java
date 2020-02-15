package study1;
// 메소드_출력값(return)

public class study1_07 {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while ( i < limit) {
            output += i;
            i++;
        }
        return output;
        // 함수 내 return은 출력값으로 함수의 결과를 반환
        // 동시에 함수 종료
        // return을 통해 반환할 값의 데이터형식을 명시
        // 반환값이 없을 시 void 명시
    }

    public static void main(String[] args) {
        String result = numbering(1,5);
        System.out.println(result);
    }
}
