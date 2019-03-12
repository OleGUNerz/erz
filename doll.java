import java.util.Scanner;

public class doll {

    public static void main(String[] args) {
        int rur=76;
        System.out.println("введите количество долларов, программа выдаст сколько это в рублях");
        Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                System.out.println(number + "$ - это будет " + rur*number + " рубасов");
        if (rur*number >=67000) {
            System.out.println("За эти деньги можно купить айфон 10");
        }
            else {
            System.out.println("Зв эти деньги даже айфон 10 не купишь");
            System.out.println("Иди дальше копи");
        }
    }
}
