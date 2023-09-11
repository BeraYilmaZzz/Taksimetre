import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km , perkm = 2.20 , startprice = + 10, tutar, total ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Mesafeyi giriniz : ") ;
        km = input.nextDouble() ;
        tutar = km*perkm + startprice ;
        tutar = (tutar < 20 ) ? 20 : tutar ;
        System.out.print("Ödenecek tutar : " + tutar ) ;


    }
}