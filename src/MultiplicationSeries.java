public class MultiplicationSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);
        int result = 1;
        for(int i=n;i>1;++i)
        {
            result*=i;
        }
        System.out.println(result);
    }
}
