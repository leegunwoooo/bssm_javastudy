package homework;

public class Exercise6_6 {
    public static void main(String[] args) {
        Mypoint p = new Mypoint(1, 1);
        System.out.println(p.getDistance(2,2));
    }
}
class Mypoint {
    int x, y;

    public Mypoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(int a, int b){
        return Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
    }
}
