abstract public class Bayar {

    int biaya;

    Bayar(int biaya){
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    abstract int pembayaran();
}