import java.util.Scanner; 
public class App  {
    public static void main(String[] args) throws Exception {
        
        //Data Member
        int total_belanja = 0;

        //membuat scanner menerima input dari keyboard
        Scanner scan = new Scanner(System.in);

        //mengambil input dari keyboard
        System.out.print("Masukan Total Belanja: ");

        //total belanja
        if (total_belanja >= 50000) {
            System.out.println("anda mendapatkan mouse");
        } else {
            System.out.println("belanja anda kurang dari Rp. 50000");

        }

        System.out.println("terima kasih telah belanja di toko kami");
    }

}
        