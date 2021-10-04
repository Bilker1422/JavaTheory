import java.util.Scanner;
public class arrays 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0 ; i < 10; i++)
        {
            A[i] = sc.nextInt();
        }
        for (int i = 0 ; i < 10; i++)
        {
            System.out.print(A[i]+ " ");
        }
        System.out.println();
    }
}