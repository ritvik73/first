import java.util.Scanner;

class A {
   public static void main(String []args){
       char a;
       Scanner obj= new Scanner(System.in);
       System.out.println("Enter the character- ");
       a=obj.next().charAt(0);
       if(a>='A'&&a<='Z')
       {
           System.out.println("Uppercase");
       }
       else
       {
           System.out.println("Lowercase");
       }
}
}
