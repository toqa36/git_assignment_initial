
public class lucas implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        int N = Integer.parseInt(input);
                int first = 2;
                int second = 1;
                int temp = 0;
                int []arr = new int[N];

                if(N == 1)
                {
                    System.out.println(2);
                    System.exit(0);
                }

                else if(N == 2)
                {
                    System.out.println("2,1");
                    System.exit(0);
                }
                arr[0] = 2;
                arr[1] = 1;

                for(int i = 2; i < N; i++)
                {
                    temp = first + second;
                    arr[i] = temp;
                    first = second;
                    second = temp;
                }
                System.out.print("The Lucas Series is: ");
                for(int i = 0; i < N; i++)
                {
                    System.out.print(arr[i]+",");
                }
            }



    }

