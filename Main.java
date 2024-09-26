package Selsa;

public class Main {
    public static void main(String[] args) {
        Handphone[] daftarPerangkat = new Handphone[1]; // Misalnya satu perangkat
        daftarPerangkat[0] = new Smartphone("Samsung", "Samsung A15");

        for (Handphone perangkat : daftarPerangkat) {
            perangkat.nyalakan();
            perangkat.matikan();
            perangkat.kirimPesan("08826425708", "Selsa, Hello");
        }
    }
}
