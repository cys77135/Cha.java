
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int ran = (int) (Math.random() * 100), num;
        System.out.println(ran);
        while (true)
        {
            num = n.nextInt();
            if (num > ran)
            {
                System.out.println("높습니다.");
            } else if (num < ran)
            {
                System.out.println("낮습니다.");
            } else
            {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
