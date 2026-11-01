# Sinema Seans ve Bilet Yönetim Sistemi
Seans ve koltuk bilgilerinin yönetilmesini, bilet işlemlerinin gerçekleştirilmesini ve kullanıcı bilgilerinin takip edilmesini sağlayan, **Veri Yapıları** dersi dönem sonu projesidir.

## Projenin Amacı
- Bilet satın alma ve iptal işlemlerini gerçekleştirmek.
- Film ve seans bilgilerini yönetmek.
- Koltukların boş ve dolu olma durumlarını takip etmek.
- Kullanıcı bilgilerini takip etmek.
- Kullanıcının beğenilerine göre film önerisi sunmak.

## Ekip Üyeleri
- Nursima İngeç: Takım Kaptanı -Kullanıcı ve Film Tercihleri Yönetimi
- Nisa Nazlı Kılıç: Film Yönetimi
- Feyza Ece Aslan: Seans ve Koltuk Yönetimi
- Esma Nur Yararlı: Bilet Yönetimi

## Görev Dağılımı

### Film Yönetimi - Nisa Nazlı Kılıç
- Film ekleme, silme ve güncelleme
- Film listeleme, arama ve sorgulama 
- Film yılına ve türüne göre filtreleme
- Film verilerini dosyaya kaydetme ve dosyadan okuma

  **Veri yapısı:**
  - Tek yönlü bağlı liste: Film sayısı zamanla değişebileceği için film ekleme ve silme işlemlerini kolaylaştırır.

### Seans ve Koltuk Yönetimi - Feyza Ece Aslan
- Seans ekleme, silme ve listeleme
- Seansları filmlerle ilişkilendirme
- Saat, salon ve koltuk durumlarını takip etme
- Seans ve koltuk verilerini dosyaya kaydetme
  
  **Veri yapıları:**
  - Bağlı liste: Seansların dinamik olarak eklenmesine, silinmesine ve listelenmesine olanak sağlar.
  - 2 boyutlu dizi: Sinema salonundaki koltuklar satır ve sütun şeklinde düzenlendiği için koltukların durumunu takip etmeyi kolaylaştırır.
 

### Bilet Yönetimi - Esma Nur Yararlı
- Bilet satma ve iptal etme
- Satılan biletleri listeleme
- Aynı koltuğa birden fazla bilet satılmasını önleme
- İptal edilen biletin koltuğunu boş hâle getirme

  **Veri yapısı:**
  - Tek yönlü bağlı liste: Satılan ve iptal edilen biletlerin dinamik olarak yönetilmesini sağlar.


### Kullanıcı ve Film Tercihleri Yönetimi - Nursima İngeç
- Kullanıcı kaydı ve girişi
- Film türlerine göre öneriler sunma
- Beğeni ve izlenme istatistiklerini tutma
- En çok izlenen ve en çok beğenilen filmleri listeleme
- Bilet bekleme kuyruğunu yönetme
- Kullanıcı ve film tercihlerini dosyalarda saklama

  **Veri yapıları:**
  - Bağlı Liste: Kullanıcıların izlediği ve beğendiği filmlerin sayısı değişebileceğinden esnek kayıt tutmayı sağlar.
  - Kuyruk: İlk sırada bekleyen kullanıcının ilk hizmet almasını sağlar
  - Merge Sort algoritması: Filmleri izlenme ve beğeni sayısına göre sıralamak için kullanılır

## Temel Sınıflar
- FilmNode: Film bağlı listesindeki düğüm
- FilmIstatistik: İzlenme ve beğeni sayılarını tutar
- FilmOneri: Kullanıcı tercihlerine göre öneri sunar
- Kullanici: Kullanıcı bilgilerini tutar
- KullaniciNode: Kullanıcı listesindeki düğüm
- KullaniciListesi:	Kullanıcıları bağlı listede yönetir
- KullaniciYonetimi:	Kayıt ve giriş işlemlerini gerçekleştirir

## Kullanılan Teknolojiler
- Dil: Java
- Veri saklama: Dosya (txt/csv)
- Arayüz: JavaFX


