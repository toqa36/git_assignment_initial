public class PowerN implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int N = Integer.parseInt(input);
        int base = 2;
        long result = 1;
        while (N != 0) {
            result *= base;
            --N;
        }
        System.out.println("2 power " + input + " is : " + result);
    }
}
