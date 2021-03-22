package Robot;

public class Start {
    public static void main (String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        RobotDancer robotDancer = new RobotDancer();

        Robot[] robots = {robot,coffeRobot,robotCoocker,robotDancer};

        for (int i = 0; i < robots.length ; i++) {
            robots[i].work();
        }

    }
}
