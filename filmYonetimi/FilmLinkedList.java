package filmYonetimi;


    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilmLinkedList {
    private FilmNode head;
    private final String dosyaAdi = "filmler.sinema";

    public FilmLinkedList() {
        this.head = null;
    }

    // 1. Film Ekleme (Listenin sonuna ekler)
    public void ekle(Film film) {
        FilmNode newNode = new FilmNode(film);
        if (head == null) {
            head = newNode;
        } else {
            FilmNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        System.out.println("Film başarıyla eklendi: " + film.getAd());
    }

