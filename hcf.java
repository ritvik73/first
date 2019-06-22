import java.util.Scanner;
 class hcf {
public static void main(String []args)
{
    int a,b,min,hcf=0,i,lcm=0;
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the numbers:- ");
    a= s1.nextInt();
    b= s1.nextInt();
    min = (a<b)?a:b;
    for(i=1;i<=min;i++)
    {
        if(a%i==0 && b%i==0)
        {
            hcf= i;
        }
    }
    System.out.println("HCF is - "+hcf);
     lcm = (a*b)/hcf;
    System.out.println("LCM is - "+lcm);
}
}
