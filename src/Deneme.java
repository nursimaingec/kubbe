public class Deneme {
    public static void main(String[] args) {
        Bilet b = new Bilet(1, 1, "Film A", "Salon 1", 3, 4, 150.0, "Ali");
        System.out.println(b);

        b.setKoltuk(5, 6);
        System.out.println(b);
    }
}

