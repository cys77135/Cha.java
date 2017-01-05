import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int i, j, num = n.nextInt();
        for (i = 1; i <= num; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}