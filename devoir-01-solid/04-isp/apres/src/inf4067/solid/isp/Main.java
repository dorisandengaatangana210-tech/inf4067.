package inf4067.solid.isp;

public class Main {

    public static void main(String[] args) {

        // Utilisation d'un travailleur humain.
        Eatable human = new HumanWorker();

        System.out.println("=== Travailleur humain ===");
        human.work();
        human.eat();

        // Utilisation d'un robot.
        Workable robot = new RobotWorker();

        System.out.println("\n=== Travailleur robot ===");
        robot.work();
    }
}
