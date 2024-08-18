//import java.util.Scanner;
public class Bt6 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n;
        System.out.println("20 số nguyên tố đầu tiên: ");
        //n = new Scanner(System.in).nextInt();
        int n = 20;
        int dem = 0;
        int a = 2;
        while(true){
            if(soNguyento(a)){
                System.out.println(a + " ");
                dem++;
            }
            if(dem == n){
                break;
            }
            if(a == 2){
                a++;
            }else{
                a+=2;
            }
        }
    }

    public static boolean soNguyento(int n){
        for (int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
