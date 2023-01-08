package Spor;

import java.util.Scanner;

public class OgrenciKayit {
   static Scanner scanner = new Scanner(System.in);
    public static Student kayit() {
        System.out.println("Kaydetmek isdediginiz ogrencinin id sini yazin");
        int id=scanner.nextInt();
        System.out.println("Kaydetmek isdediginiz ogrencinin adini yazin");
        String name=scanner.next();
        System.out.println("Kaydetmek isdediginiz ogrencinin bölümünü yazin");
        String bolum=scanner.next();
        System.out.println("Kaydetmek isdediginiz ogrencinin notunu yazin");
        int not=scanner.nextInt();
        Student student=new Student(id,name,bolum,not);
        return student;
    }
}
