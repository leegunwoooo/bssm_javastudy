    package homework;

    public class Exercise6_6 {
        public static void main(String[] args) {
            MyPoint p = new MyPoint(1, 1);
            System.out.println(p.getDistance(2,2));
        }
    }
    class MyPoint {
        int x, y;

        public MyPoint(int x, int y){
            this.x = x;
            this.y = y;
        }

        public double getDistance(int a, int b){
            return Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
        }
    }
