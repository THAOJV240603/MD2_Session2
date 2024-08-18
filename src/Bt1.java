import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ: ");
        int a = num.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(a + " chia hết cho 3 và 5");
        } else {
            System.out.println(a + " không chia hết cho 3 và 5");
        }
    }
}