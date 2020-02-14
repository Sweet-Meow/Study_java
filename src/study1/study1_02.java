package study1;
// 배열_for

public class study1_02 {
    public static void main(String[] args) {

        String[] members = {"윤현아", "늦잠쟁이", "지각쟁이", "갈마동공주","갈마동가필드"};
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + " 현아별명입니다.");
        }
    }
}
