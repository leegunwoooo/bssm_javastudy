package hello;

public class human {
    int age;
    String name;
    String job;
    //필드

    public human(int age, String name, String job){
        this.age = age;
        this.name = name;
        this.job = job;
    }//생성자

    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("직업: " + job);
    }
    //메서드
}
