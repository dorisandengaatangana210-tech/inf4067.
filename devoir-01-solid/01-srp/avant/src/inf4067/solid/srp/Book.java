package inf4067.solid.srp;

public class Book {

    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Responsabilité 1 : gérer les données du livre.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    // Responsabilité 2 : afficher le livre.
    public void printToScreen() {
        System.out.println("Titre : " + title);
        System.out.println("Auteur : " + author);
        System.out.println("Contenu : " + content);
    }

    // Responsabilité 3 : simuler la sauvegarde du livre.
    public void saveToDatabase() {
        System.out.println(
            "Sauvegarde du livre '" + title
            + "' en base de données..."
        );
    }

    // Responsabilité 4 : gérer l'emprunt du livre.
    public void emprunter(String lecteur) {
        System.out.println(
            "Emprunt du livre '" + title + "' par " + lecteur
        );
    }
}
