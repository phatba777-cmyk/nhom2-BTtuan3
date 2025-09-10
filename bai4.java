/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author Lê Hoàng Hải
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        double sotiengoc = sc.nextDouble();
        System.out.print("Nhap lai xuat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int sothang = sc.nextInt();
        double r = laiSuatNam / 100;
        double tongtien = sotiengoc * Math.pow((1 + r / 12), sothang);
        double tienlai = tongtien - sotiengoc;
        System.out.println("Tien lai = " + tienlai + " VND");
        System.out.println("So tien cuoi ky = " + tongtien + " VND");
    }
}
