import java.util.Scanner;
public class countchar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a Text: ");
        String text = sc.nextLine();
        System.out.print("Please insert a letter to count: ");
        char find = sc.next().charAt(0);
        int counter = 0;

        for(int i = 0 ; i < text.length(); i++)
        {
            if (text.charAt(i) == find)
            {
                counter++;
            }
        }
        System.out.println(counter);
        text = text.replace('y', 'Y').replace('Y','*');
        System.out.println(text);
    }
}