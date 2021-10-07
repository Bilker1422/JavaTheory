public class counter
{
    public static void main(String[] args)
    {
        int[] array = {87,68,94,100,83,78,85,78,85,91,76,87};
        for (int i = 0; i <array.length; i++)
        {
            if (i == 4)
            {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }
}