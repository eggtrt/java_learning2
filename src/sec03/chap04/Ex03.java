package sec03.chap04;

public class Ex03 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0, d= 0;
        boolean bool1 =  a < b && c++ <((d+=3)); // 뒤가 실행됨

        //단축 평가로 인해 뒤에 복잡한 로직을 두는것이 자원을 효율적으로 쓰게 됨
    }
}
