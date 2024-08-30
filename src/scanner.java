import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        //scanner 사용 뒤엔 무조건 닫아주자 계속 메모리 소모
        System.out.println(num);
    }
}
