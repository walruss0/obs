public class Ogrenci {
    //Encapsulation( Bilgi gizleme - İnformation Miding)
    //Değişkenleri private yaparak  gizlenir. get- setler ile işlem yapılır.
    private int no;
    private String ad;
    private  String soyad;
    private String dogumYeri;
    private double harc;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public double getHarc() {
        return harc;
    }

    public void setHarc(double harc) {
        if(harc>0) {
            this.harc = harc;
        }
    }
}
