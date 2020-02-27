public class SphereCircumference implements ISubscriber{


    @Override
    public void notifySubscriber(String input) {
        double r=Double.parseDouble(input);
        System.out.println("Circumference of a Sphere IS " + (2*(3.14)* r));


    }
}
