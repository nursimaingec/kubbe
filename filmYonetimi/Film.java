package filmYonetimi;

public class Film {
    private int id;
    private String ad;
    private String tur;
    private String yonetmen;
    private int yayinYili;
    private double puan;

    public Film(int id, String ad, String tur, String yonetmen, int yayinYili, double puan) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.yonetmen = yonetmen;
        this.yayinYili = yayinYili;
        this.puan = puan;
    }

    // Getter ve Setter metodları
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }

    public String getTur() { return tur; }
    public void setTur(String tur) { this.tur = tur; }

    public String getYonetmen() { return yonetmen; }
    public void setYonetmen(String yonetmen) { this.yonetmen = yonetmen; }

    public int getYayinYili() { return yayinYili; }
    public void setYayinYili(int yayinYili) { this.yayinYili = yayinYili; }

    public double getPuan() { return puan; }
    public void setPuan(double puan) { this.puan = puan; }

    // Dosyaya yazılacak format (CSV)
    public String toFileString() {
        return id + "," + ad + "," + tur + "," + yonetmen + "," + yayinYili + "," + puan;
    }

    // Dosyadan okunan satırı Film nesnesine dönüştürür
    public static Film fromFileString(String line) {
        String[] parcalar = line.split(",");
        if (parcalar.length == 6) {
            int id = Integer.parseInt(parcalar[0].trim());
            String ad = parcalar[1].trim();
            String tur = parcalar[2].trim();
            String yonetmen = parcalar[3].trim();
            int yayinYili = Integer.parseInt(parcalar[4].trim());
            double puan = Double.parseDouble(parcalar[5].trim());
            return new Film(id, ad, tur, yonetmen, yayinYili, puan);
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("ID: %-4d | Film: %-20s | Tür: %-10s | Yönetmen: %-15s | Yıl: %d | Puan: %.1f", 
                id, ad, tur, yonetmen, yayinYili, puan);
    }
}
