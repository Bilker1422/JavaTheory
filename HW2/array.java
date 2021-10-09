public class array
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        int a = 1, b = 0 , total;
        for (int i = 0 ; i < 10; i++)
        {
            total = a + b;
            a = b;
            b = total;
            numbers[i] = total;
            System.out.printf("%d,", numbers[i]);

        }
        for(int i = 0; i < 10 ; i++)
        {
        }
    }
}