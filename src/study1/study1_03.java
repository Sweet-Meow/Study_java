package study1;
// 배열_for - each

public class study1_03 {

    public static void main(String[] args) {
        String[] Group = { "김인철", "윤현아", "쪼리", "혀니"};
        for (String e : Group) {  // Group배열의 값을 변수e에 대입
            System.out.println(e + " 출력완료");
        }
    }
}
