// Book.java
public class Book {
    //ATRIBUTOS
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    //CONSTRUCTOR
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    
    //GETTERS AND SETTERS
    public String getTitle() { return title; }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getIsbn() {   return isbn;    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public boolean isAvailable() {  return available;   }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    //MÉTODOS DE LA CLASE
    public void borrow() {
        if(available == true){
            System.out.println("El libro está disponible: El prestamo ha sido realizado.");
            available = false;
        }
        else{
            System.out.println("El libro no se encuentra disponible: El prestamo no se ha realizado");
            available = false;
        }
    }
    
    public void returnBook() {
        if(available == false){
            System.out.println("El libro: " + getTitle() + " ha sido devuelto a la librería correctamente.");
            available = true;
        }
        else{
            System.out.println("El libro: " + getTitle() + " ya ha sido devuelto.");
            available = true;
        }

    }




}
