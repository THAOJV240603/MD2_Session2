import java.util.Scanner;
public class Bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int choice;

        do{
            System.out.println("Nhập độ dài cạnh thứ nhất: ");
            a = sc.nextInt();
            System.out.println("Nhập độ dài cạnh thứ hai: ");
            b = sc.nextInt();
            System.out.println("Nhập độ dài cạnh thứ ba: ");
            c = sc.nextInt();
            if(a + b > c && a + c > b && b + c > a){
                break;
            }else{
                System.out.println("Độ dài 3 cạnh không hợp lệ, vui lòng nhập lại!");
            }
        }while(true);

        do{
            System.out.println("========Menu========");
            System.out.println("1. Tính chu vi tam giác");
            System.out.println("2. Tính diện tích tam giác");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chon 1 --> 3");
            choice = sc.nextInt();
            double p = (a + b + c);
            switch(choice){
                case 1:
                    System.out.println("Chu vi của tam giác là: " + p);
                    break;
                case 2:
                    double s = Math.sqrt(p/2*(p/2-a) * (p/2-b) * (p/2-c));
                    System.out.println("Diện tích của tam giác là: " + s);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn vui lòng nhập lại!");
            }
        }while(true);
    }
}
