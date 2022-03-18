/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author Ian
 */
interface daftar{
    public void daftar();
}

public class daftarharga implements daftar{
 
    @Override
    public void daftar() {
        System.out.println("--------------------------------- Daftar Tarif ----------------------------------");
        System.out.println("1. Dapur + Kamar Mandi Dalam             \t Rp.650.000,-    \t perbulan");
        System.out.println("2. Dapur + Kamar Mandi Di luar           \t Rp.550.000,-    \t perbulan");
        System.out.println("3. Kamar Ukuran Besar + Kamar Mandi Dalam\t Rp.500.000,-    \t perbulan");
        System.out.println("4. Kamar Ukuran Kecil + Kamar Mandi Dalam\t Rp.250.000,-    \t perbulan");
    }

}
