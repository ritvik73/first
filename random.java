import java.util.Random;
class random {
    public static void main(String []args)
    {
        Random obj= new Random();
        int rand = obj.nextInt(100);
        System.out.println(rand);

    }
}
