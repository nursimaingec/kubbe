package SinemaProjesi;
public class KullaniciDugumu {
    Kullanici kullanici;
    KullaniciDugumu sonraki;
    //bağlı liste oluşturuyoruz

    public KullaniciDugumu(Kullanici kullanici){
        this.kullanici=kullanici;
        this.sonraki= null;
    }
}
