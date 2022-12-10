import java.util.Scanner;
public class Montir {
    int id_montir;
    String nama;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("====MONTIR====");
        System.out.println("Masukan ID Montir   : ");
        id_montir=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
    }
    void update_data(){

    }
}