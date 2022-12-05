import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int n;
    int tempNumber =0;
    Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        n = inp.nextInt();

        for(int i=1;i<n;i++){
            if(n % i == 0){
                tempNumber += i;
            }
        }
        if(n == tempNumber){
            System.out.println(n+ " Mükemmel sayıdır.");
        }else{
            System.out.println(n+ " Mükemmel sayı değildir.");

        }
    }
}
