package studyexten;

interface Sum {
    int apply(int a, int b);
}

public class lamda {
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b; // 람다식으로 구현
        int result = sum.apply(5, 10);
        System.out.println("Sum: " + result); // 출력: Sum: 15
    }
}
