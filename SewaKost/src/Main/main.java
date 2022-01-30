/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import List.*;
import Data.*;

/**
 *
 * @author Ian
 */
public class main {
    public static void main(String[] args){
        daftarharga l = new daftarharga();
        Data d = new Data();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|                                  SEWA KOST                                    |");
        System.out.println("---------------------------------------------------------------------------------");
        
        l.daftar();
        d.data();
        d.output();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                                  TERIMA KASIH                                   ");
    }
}
