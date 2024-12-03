package studyexten;

interface Sum {
    int apply(int a, int b);
}

public class lamda {
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;
        int result = sum.apply(5, 10);
        System.out.println("Sum: " + result);
    }
}
