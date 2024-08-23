import studyexten.Phone;
import studyexten.Samsung;

public class extenexample {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Samsung samsung1 = new Samsung("samsung", "galaxy", 95);
        phone1.showInfo();
        samsung1.showInfo();
    }
}
