import java.util.Scanner;
public class Bt4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập vào số bất kỳ: ");
        int n = num.nextInt();
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);
    }
}
