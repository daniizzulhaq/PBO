public class Lampu {
    
    boolean nyala;

    void nyalakanLampu() {
        nyala = true;
        System.out.println("Apakah lampu menyala? " + nyala);
    }

    void matikanLampu() {
        nyala = false;
        System.out.println("Apakah lampu menyala? " + nyala);
    }

}