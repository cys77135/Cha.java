import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int n1, n2, sum = 0;
        ArrayList<Integer> intarray = new ArrayList<Integer>();
        while (true)

        {
            System.out.println("[메뉴]");
            System.out.println("1. 숫자 추가");
            System.out.println("2. 숫자 제거");
            System.out.println("3. 합계 구하기");
            System.out.println("4. 끝내기");
            System.out.print("명령 입력 : ");
            n1 = n.nextInt();
            if (n1 == 1)
            {
                System.out.println("숫자 추가 메뉴");
                System.out.print("숫자 입력 : ");
                n2 = n.nextInt();
                intarray.add(n2);
                sum += n2;
            } else if (n1 == 2)
            {
                System.out.println("숫자 제거 메뉴");
                System.out.print("삭제할 숫자 위치 입력 : ");
                n2 = n.nextInt();
                if (intarray.size() > n2)
                {
                    intarray.remove(n2);
                } else
                {
                    System.out.println("Error");
                }
            } else if (n1 == 3)
            {
                System.out.println("합계 구하기 메뉴");
                System.out.printf("합계 : %d\n", sum);
            } else if (n1 == 4)
            {
                break;
            }
        }
    }
}
