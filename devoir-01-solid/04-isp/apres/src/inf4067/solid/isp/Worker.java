package inf4067.solid.isp;

interface Workable {
    void work();
}

interface Eatable extends Workable {
    void eat();
}

class HumanWorker implements Eatable {

    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }
}
