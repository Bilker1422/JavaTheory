public class array
{
    public static void main(String[] args)
    {
        int[] numbers = new int[12];
        int a = 1, b = 0 , total;
        for (int i = 0 ; i < 12; i++)
        {
            total = a + b;
            b = a;
            a = total;
            numbers[i] = total;
        }
        for(int i = 0; i < 12 ; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
    }
}