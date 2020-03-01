import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci implements ISubscriber {
    static ArrayList<Long>fibonacci = new ArrayList<Long>(Arrays.asList(0L,1L,1L));

    @Override
    public void notifySubscriber(String input) {
        int num = Integer.parseInt(input);
        System.out.println("fibonacci of "+num+" is "+getFibonacci(num));
    }

    Long getFibonacci(int n){
        if(fibonacci.size()>n){
            return fibonacci.get(n);
        }
//        System.out.println(n);

        Long result = getFibonacci(n-1)+getFibonacci(n-2);
        fibonacci.add(result);
        return result;
    }

}
