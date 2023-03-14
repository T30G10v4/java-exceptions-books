import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfBooks = 0;

        String title = "";
        int pages = 0;
        String author = "";
        String publisher = "";

        Scanner scan = new Scanner(System.in);



        try {
            System.out.println("Inserisci il numero di libri");
            numberOfBooks = Integer.parseInt(scan.nextLine());
            if(numberOfBooks<=0) throw new NumberFormatException("Il numero di libri è minore o uguale a 0");

            Book[] books = new Book[numberOfBooks];

            for (int i=0;i<numberOfBooks;i++) {
                System.out.print("Titolo: ");
                title = scan.nextLine();
                if(title=="") throw new RuntimeException("title vuoto");

                System.out.print("Pagine: ");
                pages = Integer.parseInt(scan.nextLine());
                if(pages<=0) throw new NumberFormatException("Il numero di pagine è minore o uguale a 0");

                System.out.print("Autore: ");
                author = scan.nextLine();
                if(author=="") throw new RuntimeException("author vuoto");

                System.out.print("Editore: ");
                publisher = scan.nextLine();
                if(publisher=="") throw new RuntimeException("publisher vuoto");

                books[i] = new Book(title, pages, author, publisher);

                System.out.println(books[i]);

                File path = new File("./mio-file.txt");
                FileWriter writer = new FileWriter("mio-file.txt");
                if(!path.exists()) path.createNewFile();
                writer.write(books[i].toString());
                writer.close();

            }

            File path = new File("./mio-file.txt");
            Scanner reader = new Scanner(path);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}