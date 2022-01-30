/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Scanner;

/**
 *
 * @author Ian
 */
public class Data extends awaldata{
    private String nama;
    private String alamat;
    private int nohp;
    private int pil;
    private int harga;
    private int tgl;
    
    Scanner input = new Scanner (System.in);

    @Override
    public void data() {
        System.out.println("------------------------------- Masukkan Data Diri ------------------------------");
        System.out.println("Masukkan Nama     :");
        nama = input.nextLine();
        System.out.println("Masukkan Alamat   :");
        alamat = input.nextLine();
        System.out.println("Masukkan No. Hp   :");
        nohp = input.nextInt();
        System.out.println("Tanggsl Masuk     :");
        tgl = input.nextInt();
        System.out.println("Pilihan Tarif     :");
        pil = input.nextInt();
    }

    @Override
    public void harga() {
        switch (pil){
            case 1:
                harga = 650000;
                System.out.println("Fasilitas Kamar   :Dapur + Kamar Mandi Dalam");
                System.out.println("Harga Bayar       :" +harga);
                System.out.println("Tanggal Masuk     :" +tgl);
                break;
            case 2:
                harga = 550000;
                System.out.println("Fasilitas Kamar   :Dapur + Kamar Mandi Luar");
                System.out.println("Harga Bayar       :" +harga);
                System.out.println("Tanggal Masuk     :" +tgl);
                break;
            case 3:
                harga = 500000;
                System.out.println("Fasilitas Kamar   :Kamar Ukuran Besar + Kamar Mandi Dalam");
                System.out.println("Harga Bayar       :" +harga);
                System.out.println("Tanggal Masuk     :" +tgl);
                break;
            case 4:
                harga = 250000;
                System.out.println("Fasilitas Kamar   :Kamar Ukuran Kecil + Kamar Mandi Dalam");
                System.out.println("Harga Bayar       :" +harga);
                System.out.println("Tanggal Masuk     :" +tgl);
                break;
            default:
                System.out.println("Tidak Ada Dalam Pilihan");
        }
    }

    @Override
    public void output() {
        System.out.println("-------------------------------- Bukti Transaksi --------------------------------");
        System.out.println("Nama              :" +nama);
        System.out.println("Alamat            :" +alamat);
        System.out.println("No. HP            :" +nohp);
        harga();
    }
    
}
