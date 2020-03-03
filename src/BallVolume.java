public class BallVolume implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        double r = Float.parseFloat(input);
        double v = (4/3.0) * (3.14) * (Math.pow(r, 3));
        System.out.println("The volume of ball of radius " + input + " is " + v);
    }
}
