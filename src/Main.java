
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        double x1, x2, y1, y2;
        double ans;
        System.out.print("x1, y1 좌표 입력 : ");
        x1 = n.nextDouble();
        y1 = n.nextDouble();
        System.out.print("x2, y2 좌표 입력 : ");
        x2 = n.nextDouble();
        y2 = n.nextDouble();

        ans = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("거리 : %f\n", ans);
    }
}
