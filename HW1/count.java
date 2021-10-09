import java.util.Scanner;

public class count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleasa insert a Text to count: ");
        String text = sc.nextLine();
        text += '\0';
        int counter = 0 ;

        do 
        {
            counter++;
        }
        while(text.charAt(counter) != '\0');
        System.out.println("Manual count equal to "+counter);
        text = text.replace('a', 'A').replace('A','*');
        System.out.println(text);
    }
}