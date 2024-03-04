package latihan_ifelse;
import java.util.Scanner;

public class Latihan_ifelse {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String menu = null;
        int pilihan, harga=0, porsi;
        System.out.println("---- Menu Sajian ----");
        System.out.println("1. Rendang\n2. Nasi goreng\n3. Bebek bakar\n4. Ayam Goreng");
        System.out.print("Pilih \t: ");
        pilihan = masuk.nextInt();
        if(pilihan == 1){
            menu = "Rendang";
            harga = 25000;
        } else if (pilihan == 2) {
            menu = "Nasi Goreng";
            harga = 20000;
        } else if (pilihan == 3) {
            menu = "Bebek Bakar";
            harga = 15000;
        } else if (pilihan == 4) {
            menu = "Ayam Goreng";
            harga = 15000;
        }
        if (menu == null){
            System.out.println("Masukan Angka!");
        } else {
            System.out.print("Jml Porsi \t: ");
            porsi = masuk.nextInt();
            System.out.println("========================");
            System.out.println("Menu Dipesan : " +menu);
            System.out.println(menu+" Rp "+harga+"/porsi");
            harga = harga * porsi;
            System.out.println("Total belian \t: Rp."+harga);
        }
        
    }
    
}
