
import interfaceExam.Cat;
import interfaceExam.Dog;

public class InterfaceCode{
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.Eat();
        dog.Bark();
        dog.Sleep();
        cat.Eat();
        cat.Bark();
        cat.Sleep();//인터페이스 구현
    }
}
