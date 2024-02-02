package main2;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainRepeat {

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        String dosya = "C:\\Users\\ihsan\\OneDrive\\Masaüstü\\caca.txt";
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("1- ekle");
            System.out.println("2- bastir");
            System.out.print("-- :");
            int option = scn.nextInt();
            switch (option) {
                case 1:
                    System.out.print("veri: ");
                    String veri = scn.next();
                    ekle(dosya, veri);
                    break;
                case 2:
                    bastir(dosya);
                    break;
            }
            System.out.println("--------------------------------");
        }
    }

    public static void ekle(String dosya, String veri) {
        try (BufferedWriter use = new BufferedWriter(new FileWriter(dosya, true))) {
            use.write(veri);
            use.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bastir(String dosya) {
        try (BufferedReader use = new BufferedReader(new FileReader(dosya))) {
            String satir;
            while ((satir = use.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
