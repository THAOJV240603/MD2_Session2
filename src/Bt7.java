import java.util.Scanner;
public class Bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("Mời bạn nhập số nguyên bất kỳ: ");
        int num = sc.nextInt();
        do{
            System.out.println("=========Menu========");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn 1 --> 4");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    if(num % 2 == 0){
                        System.out.println(num + " là số chẵn");
                    }else{
                        System.out.println(num + " là số lẻ");
                    }
                    break;
                case 2:
                    if(num <= 1){
                        System.out.println(num + " không phải số nguyên tố");
                        break;
                    }
                    boolean flag = true;
                    for (int i = 2; i < num; i++) {
                        if(num % i == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println(num + " là số nguyên tố");
                    } else {
                        System.out.println(num + " không phải số nguyên tố");
                    }
                    break;
                case 3:
                    if(num % 3 == 0){
                        System.out.println(num + " chia hết cho 3");
                    }else{
                        System.out.println(num + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.exit(0); // câu lệnh thoát chương trình
                default:
                    System.out.println("Sai lựa chọn vui lòng chọn lại!");
            }
        }
        while (true);
    }
}
