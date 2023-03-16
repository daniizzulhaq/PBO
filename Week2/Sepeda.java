public class Sepeda {
    
    
    int gear = 5;
    int jumlahRoda;
    String jenis, merk;

    void ngerem() {
        System.out.println("Sepeda direm");
    }


    public Sepeda(int jumlahRoda, String jenis, String merk) {
        System.out.println("Sepeda " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }

}