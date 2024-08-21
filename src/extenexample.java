import studyexten.phone;
import studyexten.samsung;

public class extenexample {
    public static void main(String[] args) {
        phone phone1 = new phone();
        samsung samsung1 = new samsung("samsung", "galaxy", 95);
        phone1.showInfo();
        samsung1.showInfo();
    }
}
