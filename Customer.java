import java.util.Scanner;
public class Customer {
    int id_cus;
    String no_hp;
    String nama;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("===CUSTOMER===");
        System.out.println("Masukan ID Customer  : ");
        id_cus=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
        System.out.println("No Hp          :");
        no_hp= input.next();
    }
    void lihat_data(){

    }
}