public class Bilet {
    private int id;
    private int seansId;
    private String filmAdi;
    private String salonAdi;
    private int satir;
    private int sutun;
    private double fiyat;
    private String musteriAdi;

    public Bilet (int id,int seansId, String filmAdi,String salonAdi,
                  int satir,int sutun,double fiyat, String musteriAdi){
        this.id=id;
        this.seansId=seansId;
        this.filmAdi=filmAdi;
        this.salonAdi=salonAdi;
        this.satir=satir;
        this.sutun=sutun;
        this.fiyat=fiyat;
        this.musteriAdi=musteriAdi;
    }
    public int getId() { return id; }
    public int getSeansId() { return seansId; }
    public String getFilmAdi() { return filmAdi; }
    public String getSalonAdi() { return salonAdi; }
    public int getSatir() { return satir; }
    public int getSutun() { return sutun; }
    public double getFiyat() { return fiyat; }
    public String getMusteriAdi() { return musteriAdi; }

    @Override
    public String toString(){
        return "Bilet #" + id + " | Seans: " + seansId + " | " + filmAdi
                + " | Salon: " + salonAdi + " | Koltuk: " + satir + "-" + sutun
                + " | Fiyat: " + fiyat + " TL | Müşteri: " + musteriAdi;

    }
    public void setKoltuk (int satir, int sutun){
        this.satir = satir;
        this.sutun = sutun;
    }
}

