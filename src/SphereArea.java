public class SphereArea implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        double r=Double.parseDouble(input);
        System.out.println("Area of sphere = "+ 4*3.14*r*r);
    }
}
