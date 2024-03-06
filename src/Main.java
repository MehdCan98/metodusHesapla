import java.util.Scanner;

public class Main {

    public static int usHesaplama(int num1, int num2){
        int sonuc=1;
        for (int i=1; i<=num2;i++){
            sonuc *=num1;
        }return sonuc;
    }



    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Sayı: ");
        int number1 = input.nextInt();

        System.out.println("Üs: ");
        int number2 = input.nextInt();


        int cevap =usHesaplama(number1,number2);
        System.out.println(cevap);



    }
}