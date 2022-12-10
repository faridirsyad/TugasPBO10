import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        int pilih1;
        System.out.println("==================");
        System.out.println("   Bengkel Asoy   ");
        System.out.println("==================");
        System.out.println("1. Service        ");
        System.out.println("2. Exit           ");
        System.out.println("Masukkan Pilihan :");
        pilih = in.nextInt();

        switch (pilih){
            case 1 :
                Customer cs = new Customer();
                cs.input_data();
                cs.lihat_data();
                Motor mt = new Motor();
                mt.input_data();
                mt.update_data();
                Montir mon = new Montir();
                mon.input_data();
                mon.update_data();
                Service ser = new Service();
                ser.input_data();
                ser.jenis_service();
                ser.update_data();
            case 2 :
                System.out.println("Exitt...");
                System.exit(0);
                break;
        }

        System.out.println("===============================================");
        System.out.println("          MENU PEMBAYARAN       |     HARGA    ");
        System.out.println("1. Service + Ganti Oli          |   Rp 120000  ");
        System.out.println("2. Sercvie                      |   Rp 70000   ");
        System.out.println("3. Ganti Oli                    |   Rp 50000   ");
        System.out.println("===============================================");
        System.out.println("Masukan Pilihan Anda = ");
        pilih1 = in.nextInt();
        System.out.println();
        if (pilih1 == 1) {
            Pembayaran by = new Pembayaran(120000);
            System.out.println("Total Bayar : " + by.biaya);
        }
        else if (pilih1 == 2) {
            Pembayaran by = new Pembayaran(70000);
            System.out.println("Total Bayar : " + by.biaya);
        }
        else if (pilih1 == 3) {
            Pembayaran by = new Pembayaran(50000);
            System.out.println("Total Bayar : " + by.biaya);
        }

    }


}