public class Seans {
  public String filmAdi;
  public String saat;
  public String salon;
  public KoltukPlani koltukPlani;

  public Seans(String filmAdi, String saat, String salon,int satir,nt sutun){
    this.filmAdi = filmAdi;
    this.saat = saat;
    this.salon = salon;
    this.koltukPlani = new KoltukPlani(satir,sutun);
  }
}
