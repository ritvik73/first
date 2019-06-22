import java.util.Scanner;

public class fibonacci {
    public static void main(String [] args)
    {
        int a=0,b=0,c=1,n;
        System.out.println("Enter the number- ");
        Scanner obj= new Scanner(System.in);
       n= obj.nextInt();
        for(int j=1;j<n;j++)
        {
            a=b;
            b=c;
            c=a+b;
        System.out.print(" "+a);
        }
    }
}
