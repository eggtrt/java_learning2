package sec03.chap03;

public class Ex01 {
    public static void main(String[] args) {
        // 문자는 2byte
        char ch1 = 'A'; // JS와 다르게 ''의경우 char, ""의 경우 string이 됨
        // char의 경우 각 문자에 해당하는 ASCII code 번호가 있음
        char ch4 = 'a' + 1; // ASCII code가 더해진 b가 나오게 됨. string의 +와는 다름
        int ch1Int = ch1; // 이렇게 하면 65라는 int값으로 변경되어 들어감
    }
}
