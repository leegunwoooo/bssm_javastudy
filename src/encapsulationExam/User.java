package encapsulationExam;

public class User {
    private String name;//private로 외부에서 접근 못하게 차단
    private int password;

    public void setName(String name){
        this.name = name;//캡슐화
        //멤버변수에 직접 접근을 안해도 되니 보안 강화
    }
    public void getName(){
        System.out.println("ID : " + this.name);
    }
    public void setPassword(int password){
        this.password = password;
    }
    public void getPassword(){
        System.out.println("Password : " + this.password);
    }
}
