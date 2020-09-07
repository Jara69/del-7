import java.util.*;

public class delitelnost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cislo = sc.nextDouble();
        if (cislo % 7 == 0) {
            System.out.println("cislo je delitelne 7");
        } else {
            System.out.println("cislo neni delitelne 7");

        }
    }

}