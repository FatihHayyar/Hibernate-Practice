package Spor;

import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner scan=new Scanner(System.in);
    public static void mainMenu() {
        System.out.println("1: Yeni ogrenci kayit\n2:Listeyi görüntule\n3: Cikis");
        String secim= scan.next();
        while (!(secim.equals("1")||secim.equals("2")||secim.equals("3"))){
            System.out.println("gecerli bir secim yapin");
            secim=scan.next();
        }
        if(secim.equals("1")){
           Student student= OgrenciKayit.kayit();
           OgrenciYollama.ogrencileriYolla(student);
           mainMenu();
        }else if(secim.equals("2")){
           List<Student> list= OgrenciAlma.ogrenciAl();
           for(Student student:list){
               System.out.println(student);
           }
            mainMenu();
        }else System.out.println("gule gule");
    }
}
