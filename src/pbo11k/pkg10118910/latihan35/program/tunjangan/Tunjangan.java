/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan35.program.tunjangan;
import java.util.Scanner;
/**
 *
 * @author syifa
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program tunjangan untuk menghitung tunjangan Gaji Karyawan
 * dengan konsep Objek
 */
public class Tunjangan {

    private double tunjangan,total,gj;
    private String stat;
    
    private void cari_Tunjangan(String Stat,double Gaji){
    tunjangan = ("menikah".equals(Stat))|| "Menikah".equals(Stat)? 0.35*Gaji:0;
    }
    public void outputTotal(double Gaji){
        total = tunjangan + Gaji;
        System.out.println("========= Hasil Tunjangan ==========");
        System.out.println("Gajih\t\t:Rp. " + Gaji);
        System.out.println("Tunjangan\t:Rp. " + tunjangan);
        System.out.println("Total Gaji\t:Rp. " + total);
        
        System.out.println("(Developed by : Muhamad Syifa Amruloh)");
    }
    
    public static void main(String[] args) {
        // LOAD SCANNER
        Scanner scan = new Scanner(System.in);
        // Inisilisasi Objek
        Tunjangan tnj = new Tunjangan();
        //INPUT
        System.out.println("========== Program Tunjangan ==========");
        System.out.print("Berapa gaji poko anda perbulan?\t: ");
        tnj.gj = scan.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        tnj.stat = scan.next();
        //Method
        tnj.cari_Tunjangan(tnj.stat, tnj.gj);
        tnj.outputTotal(tnj.gj);
    }
    
}
