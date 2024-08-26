package interfaceExam;

public class Dog implements Animal {
    public void Eat() {
        System.out.println("eat everything");
    }
    public void Bark() {
        System.out.println("씨발! 씨발!");
    }
    public void Sleep() {
        System.out.println("sleep long time");
    }//인터페이스를 상속받은 implements를 사용하면 모든 메서드를 사용해야하지만
    //abstract를 사용하면 메서드를 일부만 사용해도 된다.
}
