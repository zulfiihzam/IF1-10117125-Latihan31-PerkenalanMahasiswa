/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan31.perkenalanmahasiswa;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Zulfi Ihzam Rahmat
 * Kelas    : IF-1
 * NIM      :10117125
 * Deskripsi Program    : Program ini berisi program yang menampilkan data 
 * untuk mengenalkan beberapa siswa
 */
public class IF110117125Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nim = "10117125";
        mahasiswa1.nama= "Zulfi Ihzam Rahmat" + "\n";
        mahasiswa1.PerkenalanDiri(mahasiswa1.nim, mahasiswa1.nama);
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nim = "10117122";
        mahasiswa2.nama= "Adam" + "\n";
        mahasiswa2.PerkenalanDiri(mahasiswa2.nim, mahasiswa2.nama);
        
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.nim = "10117123";
        mahasiswa3.nama= "Indahkus" + "\n";
        mahasiswa3.PerkenalanDiri(mahasiswa3.nim, mahasiswa3.nama);
        
        mahasiswa mahasiswa4 = new mahasiswa();
        mahasiswa4.nim = "10117124";
        mahasiswa4.nama="Lanang" + "\n";
        mahasiswa4.PerkenalanDiri(mahasiswa4.nim, mahasiswa4.nama);
    }
    
}
