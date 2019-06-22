import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int i;
        System.out.println("Enter number- ");
        i= obj.nextInt();
        for(int j=1;j<=i;j++)
        {
            for(int k=1;k<=j;k++)
            {
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
