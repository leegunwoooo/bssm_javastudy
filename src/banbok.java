public class banbok {
    public static void main(String[] args) {
        int a= 1;
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            System.out.println(arr[i]);
        }
        //for each 문
        for(int i: arr){
            System.out.println(i);
        }
    }
}
