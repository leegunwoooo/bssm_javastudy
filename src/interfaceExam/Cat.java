package interfaceExam;

public class Cat implements Animal {
    public void Bark(){
        System.out.println("Meow");
    }
    public void Eat(){
        System.out.println("Eat fish");
    }
    public void Sleep(){
        System.out.println("dog as cat");
    }}//인터페이스를 상속받은 implements를 사용하면 모든 메서드를 사용해야하지만
        //abstract를 사용하면 메서드를 일부만 사용해도 된다.

