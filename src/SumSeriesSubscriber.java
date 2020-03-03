public class SumSeriesSubscriber implements ISubscriber{
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        int output=0;
        for(int i = 1 ; i <= Integer.parseInt(input) ; i++)
        {
            output+= (i*i);
        }
        System.out.println("The Sum Series is " + output);
    }
}
