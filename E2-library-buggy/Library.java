// Library.java
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        boolean repetido = false;
        // BUG 4: Permite libros duplicados (mismo ISBN)
        for (Book b : books) {
            if (book.getIsbn().equals(b.getIsbn())) {
                //NO Se guarda
                repetido = true;
            }
            if(!book.getIsbn().equals(b.getIsbn())){
                repetido = false;
                //Se guarda
            } 
        }
        if (repetido = false) {
            books.add(book);    
        } else {
            System.out.println("El libro con ISBN: [" + book.getIsbn() + "] ya se encuentra en la biblioteca");
        }
        
    }
    
    public Book findBookByTitle(String title) {
        // BUG 5: Sensible a mayúsculas/minúsculas
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    
    public List<Book> findAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        // BUG 6: ConcurrentModificationException potencial
        for (Book book : books) {
            if (book.isAvailable() == true) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
    // BUG 8: Falta método para quitar libros
}
