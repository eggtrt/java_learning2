package sec03.chap01;

public class Ex05 {
    public static void main(String[] args) {
        int a = 1;
        a = a + 2;
        a += 3;

        int b = a += 4;

        int i1 = 0;
        int i2 = 1;
        int i3 = (i1 = i2); // 결국 i3에도 i2값이 들어가게 됨
    }
}
