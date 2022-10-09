import java.util.Scanner;

public class manav {

    public static void main(String[] args) {
        double toplamtutar;
        int armutkg , elmakg, domateskg, muzkg ,patlicankg;


        Scanner bilgi =new Scanner(System.in);

        System.out.print("Armut kaç kilo :");
        armutkg= bilgi.nextInt();

        System.out.print("Elma kaç kilo :");
        elmakg= bilgi.nextInt();

        System.out.print("Domates kaç kilo :");
        domateskg= bilgi.nextInt();

        System.out.print("Muz kaç kilo :");
        muzkg= bilgi.nextInt();

        System.out.print("Patlican kaç kilo :");
        patlicankg= bilgi.nextInt();

        toplamtutar =armutkg*2.14+elmakg*3.67+domateskg*1.11+muzkg*0.95+patlicankg*5;
        System.out.print("Toplam tutar :"+toplamtutar+ " TL dir ");




    }
}
