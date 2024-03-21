package sec03.chap06;

public class Ex07 {
    public static void main(String[] args) {
        String str_a1 = "슉-";
        String str_a2 = "슈슉-";
        String str_a3 = "슈슈슉-";

        String str_a4 = str_a1 + str_a2 + str_a3;

        String str_a5 = str_a1.concat(str_a2);

        // 체이닝 가능
        String str_a6 = str_a1
                .concat(str_a2)
                .concat(str_a3)
                .concat(str_a4)
                .concat(str_a5);

        // Concat은 String만 가능함

        // concat은 필요시에만 새 인스턴스 생성
        String str_b1 = str_a1 + "";
        String str_b2 = str_a1.concat("");

        // 성능적으로는 concat보다 +가 더 좋음
        String str_c1 = "a"
                .concat("b")
                .concat("c")
                .concat("d");
        // "a", "ab", "abc", "abcd" 등이 모두 생김
    }
}
