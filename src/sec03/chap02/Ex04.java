package sec03.chap02;

public class Ex04 {
    public static void main(String[] args) {
        float flt1 = 3.14f;
        float flt2 = 3.15f;
        float flt3 = flt1 + flt2;
        double dbl1 = flt1 + flt2;

        // double + float은 double로 간주됨
        float flt4 = (float) (dbl1 + flt1);
    }
}
