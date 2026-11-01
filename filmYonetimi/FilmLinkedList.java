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

    // 2. Film Silme (ID'ye göre)
    public boolean sil(int id) {
        if (head == null) {
            System.out.println("Liste boş, silme işlemi yapılamaz!");
            return false;
        }

        // Baş düğüm silinecekse
        if (head.getData().getId() == id) {
            System.out.println("Film silindi: " + head.getData().getAd());
            head = head.getNext();
            return true;
        }

        // Aradaki veya sondaki düğüm silinecekse
        FilmNode prev = null;
        FilmNode curr = head;

        while (curr != null && curr.getData().getId() != id) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            prev.setNext(curr.getNext());
            System.out.println("Film silindi: " + curr.getData().getAd());
            return true;
        }

        System.out.println("ID: " + id + " olan film bulunamadı.");
        return false;
    }

    // 3. Film Güncelleme
    public boolean guncelle(int id, String yeniAd, String yeniTur, String yeniYonetmen, int yeniYili, double yeniPuan) {
        FilmNode temp = head;
        while (temp != null) {
            if (temp.getData().getId() == id) {
                Film f = temp.getData();
                f.setAd(yeniAd);
                f.setTur(yeniTur);
                f.setYonetmen(yeniYonetmen);
                f.setYayinYili(yeniYili);
                f.setPuan(yeniPuan);
                System.out.println("Film bilgileri güncellendi.");
                return true;
            }
            temp = temp.getNext();
        }
        System.out.println("Güncellenecek film bulunamadı (ID: " + id + ").");
        return false;
    }

    // 4. Filmleri Listeleme
    public void listele() {
        if (head == null) {
            System.out.println("Sistemde kayıtlı film bulunmamaktadır.");
            return;
        }
        System.out.println("\n--- TÜM FİLMLER ---");
        FilmNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    // 5. Film Adına Göre Arama (İçeren kelimelere göre - Case Insensitive)
    public void araAdaGore(String filmAdi) {
        if (head == null) {
            System.out.println("Liste boş.");
            return;
        }
        boolean bulundu = false;
        System.out.println("\n--- Arama Sonuçları ('" + filmAdi + "') ---");
        FilmNode temp = head;
        while (temp != null) {
            if (temp.getData().getAd().toLowerCase().contains(filmAdi.toLowerCase())) {
                System.out.println(temp.getData());
                bulundu = true;
            }
            temp = temp.getNext();
        }
        if (!bulundu) {
            System.out.println("Aramanızla eşleşen film bulunamadı.");
        }
    }

    // 6. Film Türüne Göre Filtreleme
    public void filtreleTureGore(String tur) {
        if (head == null) {
            System.out.println("Liste boş.");
            return;
        }
        boolean bulundu = false;
        System.out.println("\n--- Tür Filtresi ('" + tur + "') ---");
        FilmNode temp = head;
        while (temp != null) {
            if (temp.getData().getTur().equalsIgnoreCase(tur)) {
                System.out.println(temp.getData());
                bulundu = true;
            }
            temp = temp.getNext();
        }
        if (!bulundu) {
            System.out.println("Bu türe ait film bulunamadı.");
        }
    }

    // 7. Dosyadan Okuma (filmler.sinema)
    public void dosyadanOku() {
        // Mevcut listeyi temizle (çift yüklemeyi önlemek için)
        head = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi))) {
            String line;
            int sayac = 0;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    Film film = Film.fromFileString(line);
                    if (film != null) {
                        ekleSessiz(film);
                        sayac++;
                    }
                }
            }
            System.out.println(sayac + " adet film dosyadan yüklendi.");
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası veya dosya henüz yok: " + e.getMessage());
        }
    }

    // 8. Dosyaya Kaydetme (filmler.sinema)
    public void dosyayaKaydet() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
            FilmNode temp = head;
            while (temp != null) {
                writer.write(temp.getData().toFileString());
                writer.newLine();
                temp = temp.getNext();
            }
            System.out.println("Film verileri '" + dosyaAdi + "' dosyasına başarıyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
    }

    // Dosyadan okurken ekrana mesaj basmaması için yardımcı metot
    private void ekleSessiz(Film film) {
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
    }
}
    

