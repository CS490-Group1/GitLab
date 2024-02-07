import java.util.Random;
class names
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        System.out.println(randomInt);
    }