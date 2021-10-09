public class sortarray
{
    public static void main(String[] x)
    {
        int[] args = {3,6,1,7,0,2,12,43,73,83};
        int item = 0;
        for(int b = 0 ; b< args.length;b++)
        {   
            for (int i = 0; i < args.length; i++)
            {
                if (args[i] > args[b])
                {
                    item = args[i];
                    args[i] = args[b];

                    args[b] = item;
                }
            }
            
        }
        for (int a:args)
        {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}