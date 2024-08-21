import hello.Book;

public class objectarr {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        for(int i=0; i<books.length; i++){
            books[i] = new Book();
        }

        books[0].price = 3000;
        books[0].title = "Java의 정석";
        books[1].price = 5000;
        books[1].title = "객체지향의 오해와 사실";

        for(int i=0; i<2; i++){
            books[i].showInfo();
        }
    }
}
