package sec03.chap01;

public class Ex08 {
    public static void main(String[] args) {
        int int1 = 3;
        int int2 = int1++;
        int int3 = ++int1; // JS랑 동일하게 동작함

        int int4 = -(int1-- * int2--);

        int int5 = 3++; // 이렇게는 사용이 안됨
    }
}
