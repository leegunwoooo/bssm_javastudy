import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        //배열 c와 같이 같은타입의 자료형을 여러개 저장하기 위해 존재한다
        //선언 방법은 아래와 같다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<a; i++){
            System.out.println(arr[i]);
        }
        //for each 문
        for(int i: arr){
            System.out.println(i);
        }
    }
}
