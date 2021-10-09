public class sortarray
{
    public static void main(String[] x)
    {
        int[] args = {3,6,1,7,0,2,12,43,73,83,5,3,5,2,6,7,2};
        int item = 0;
        for(int b = 0 ; b< args.length;b++)
        {   
            for (int i = 0; i < args.length; i++)
            {
                for (int a:args)
                {
                    System.out.print(a+" ");
                }
                System.out.println("Before");
                System.out.println((args[b] < args[i]) + " "+args[b] + " "+ args[i]);
                if (args[b] < args[i])
                {
                    item = args[b];
                    args[b] = args[i];

                    args[i] = item;
                }
                for (int a:args)
                {
                    System.out.print(a+" ");
                }
                System.out.println("checkd");
            }
            
        }
        for (int a:args)
        {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}