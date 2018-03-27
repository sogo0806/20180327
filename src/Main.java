import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Shop sh = new Shop();
        sh.lisp();
        ArrayList<Book> book1 = new ArrayList<>();
        String title;
        String author;
        String publisher;
        String ibsn;
        int price;
        boolean flag =true;
        while (flag){
            int n = sca.nextInt();
            switch (n){
                case 1:
                    System.out.println("書名:");
                    title=sca.next();
                    System.out.println("作者:");
                    author=sca.next();
                    System.out.println("出版:");
                    publisher = sca.next();
                    System.out.println("ISBN:");
                    ibsn = sca.next();
                    System.out.println("價錢:");
                    price= sca.nextInt();
                    book1.add(new Book(title,author,publisher,ibsn,price));
                    break;
                case 2:
                    
            }
        }
    }
}
