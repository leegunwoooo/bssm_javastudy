public class overs {
    public static void main(String[] args) {
        class Shape {
            void draw() {
                System.out.println("Drawing Shape");
            }
            void draw(String color) {//오버로딩 매개변수가 달라짐
                System.out.println("Drawing " + color + " Shape");
            }
        }
        class Circle extends Shape {
            @Override
            void draw() {//매개변수가 같고 메서드를 재정의함
                System.out.println("Drawing Circle");
            }
        }
        Shape shape = new Shape();
        shape.draw("blue");
        Circle circle = new Circle();
        circle.draw();
        circle.draw("red");
    }
}
