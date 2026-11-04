package inf4067.solid.isp;

public class Main {

    public static void main(String[] args) {

        // Utilisation d'un travailleur humain.
        Worker human = new HumanWorker();

        System.out.println("=== Travailleur humain ===");
        human.work();
        human.eat();

        // Utilisation d'un robot.
        Worker robot = new RobotWorker();

        System.out.println("\n=== Travailleur robot ===");
        robot.work();

        // Illustration du problème de l'interface Worker.
        try {
            robot.eat();
        } catch (UnsupportedOperationException exception) {
            System.out.println(
                "Erreur : " + exception.getMessage()
            );
        }
    }
}
