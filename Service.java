import java.util.Scanner;

public class Service {
    int kode_service;
    String jenis_motor;
    String tgl_service;
    int id_cus;
    int id_montir;
    int id_motor;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("===DATA Service===");
        System.out.println("Masukan Kode Service      :");
        kode_service=input.nextInt();
        System.out.println("Jenis Motor               :");
        jenis_motor= input.next();
        System.out.println("Tanggal Service Motor     :");
        tgl_service= input.next();
        System.out.println("Masukan ID Customer       :");
        id_cus= input.nextInt();
        System.out.println("Masukan ID Montir         :");
        id_montir= input.nextInt();
        System.out.println("Masukan ID Motor          :");
        id_motor= input.nextInt();
    }

    void jenis_service(){

    }
    void update_data(){

    }

}