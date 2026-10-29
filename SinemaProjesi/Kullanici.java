package SinemaProjesi;
public class Kullanici {
    String kullaniciAdi;
    String sifre;
    FilmDugumu begenilenFilmler;
    FilmDugumu izlenenFilmler;
    //kullanıcı bilgilerini tutar

    public Kullanici(String kullaniciAdi, String sifre){
        this.kullaniciAdi=kullaniciAdi;
        this.sifre=sifre;
        this.begenilenFilmler=null;
        this.izlenenFilmler=null;
    }
    
}
