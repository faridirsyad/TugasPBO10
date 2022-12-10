public class Pembayaran extends Bayar{
    Pembayaran(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return 0;
    }


}
