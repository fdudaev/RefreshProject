import java.sql.Wrapper;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var name = "avacado";
        System.out.println(Arrays.toString(name.split("a")));

        Random random = new Random();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.compare(9, 9));
        System.out.println(Byte.MAX_VALUE);

        int ranNum = random.nextInt(5);
        System.out.println("-->" + ranNum);

    }
}