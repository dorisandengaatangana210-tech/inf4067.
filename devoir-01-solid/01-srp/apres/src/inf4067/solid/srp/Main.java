package inf4067.solid.srp;

public class Main {

    public static void main(String[] args) {

        // Création du livre.
        BookSRP book = new BookSRP(
            "Apprendre les principes SOLID",
            "Doris Andenga",
            "Un exemple de separation des responsabilites."
        );

        // Présentation du livre.
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(book);
        printer.printToHTML(book);

        // Simulation de la sauvegarde du livre.
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(book);
        saver.saveToFile(book, "livre.txt");

        // Exécution des opérations métier.
        BookBusinessLogic businessLogic = new BookBusinessLogic();
        businessLogic.emprunter(book, "Doris");
        businessLogic.autreService(book);
    }
}
