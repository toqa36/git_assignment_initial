public class Circle implements ISubscriber {


    public void calculateArea(double radiuas){
        double Area = Math.PI * radiuas * radiuas;
    }

    @Override
    public void notifySubscriber(String input) {
        calculateArea(double[input])
    }
}
