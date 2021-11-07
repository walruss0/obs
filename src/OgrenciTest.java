public class OgrenciTest {
    public static void main(String[] args) {
        //Java'da obje oluşturma bu şekilde
        Ogrenci ogr = new Ogrenci();
        ogr.setNo(1);
        ogr.setAd("Aziz");
        ogr.setSoyad("Sancar");
        ogr.setDogumYeri("Mardin");
        ogr.setHarc(1500);

        System.out.println(ogr.getAd()+ogr.getSoyad()+ogr.getNo()+ogr.getDogumYeri()+ogr.getHarc());
    }
}
