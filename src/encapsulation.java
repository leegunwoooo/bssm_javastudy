import encapsulationExam.User;

public class encapsulation {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("이건우");
        user1.setPassword(1234);
        user1.getName();
        user1.getPassword();
    }
}
