package inf4067.solid.isp;

public interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        System.out.println("On ne doit pas faire manger un robot");

        throw new UnsupportedOperationException(
            "Les robots ne mangent pas"
        );
    }
}
