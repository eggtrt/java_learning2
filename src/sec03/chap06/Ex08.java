package sec03.chap06;

public class Ex08 {
    public static void main(String[] args) {
        String str_a1 = "덜컹";
        String str_a2 = str_a1.repeat(2);

        String str_a3 = str_a1
                .concat(" ")
                .repeat(3)
                .trim();

        String str_b1 = "모두가 날 바라봐";
        String str_b2 = str_b1.substring(4);
        String str_b3 = str_b1.substring(4, 6);

        String piece1 = "날";
        String piece2 = "모두가";

        String str_b5 = str_b1.substring(
                str_b1.indexOf(piece2),
                str_b1.indexOf(piece1) + piece1.length()
        );

        String str_c1 = "점심에 보쌈집에 가서 수육을 먹었다";
        String str_c2 = str_c1.replace("보쌈", "중국");

        String str_c3 = "밥 먹자 밥 밥 밥";
        String str_c4 = str_c3.replace("밥", "빵");
    }
}
