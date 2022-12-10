import java.util.Scanner;
public class Motor {
    int id_motor;
    String merk;
    String keluhan;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("===DATA MOTOR===");
        System.out.println("Masukan ID Motor  : ");
        id_motor=input.nextInt();
        System.out.println("Masukkan Merk     :");
        merk= input.next();
        System.out.println("Masukan Keluhan   :");
        keluhan= input.next();
    }
    void update_data(){

    }
}