package sec03.chap02;

public class Ex02 {
    public static void main(String[] args) {
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;

        double dMin = -Double.MAX_VALUE;
        double dMax = -Double.MAX_VALUE;

        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;

        // double이 float보다 범위도 넓고 정밀도도 높음
        double dblNum = 0.123456789123456789;
        float fltNMum = 0.123456789123456789f;
    }
}
