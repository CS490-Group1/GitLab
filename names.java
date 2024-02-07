import java.util.Random;
public class names {
    public static void main(String []args){
        System.out.println("Karan Komal");
        System.out.println("Frank Xu");
        System.out.println("Jose Ventura");
        System.out.println("Moiez Q.");
        System.out.println("Andrew R.");
      
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        System.out.println(randomInt);
        System.out.println("Welcome to CS 490");
    }   
}