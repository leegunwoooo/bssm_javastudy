public class Parent {
    int a;
    public Parent(int n){
        a = n++;
    }
}
class Child extends Parent {
    int b;
    public Child(int n){
        super(1);
        b = 3;
    }
}
