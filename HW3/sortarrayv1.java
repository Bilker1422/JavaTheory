public class sortarrayv1
{
    public static void main(String[] x)
    {
        int[] args = {3,6,1,7,0,2,12,43,73,83,5,3,5,2,6,7,2,6,3,7,9,3,4,5,245,6467,135,8457,3532,7,13431,6326,437,3,58,458,48};
        int count = 0 , item =0;
        do{
            for (int i = 0 ; i < args.length ; i++)
            {
                if (args[i] > args[count])
                {
                    item = args[i];
                    args[i] = args[count];
                    args[count]= item;
                }
                for (int a:args)
                {
                    System.out.print(a+" ");
                }
                System.out.println();
            }
            count++;
        }while (count < args.length);
        for (int a:args)
        {
            System.out.print(a+" ");
        }
    }
}