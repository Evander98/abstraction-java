package service;

public class Lingkaran implements BangunDatar{

  @Override
  public void hitungKeliling(int r) {
    double hasil = 2 * Math.PI * r;
    System.out.println("Keliling Lingkaran : " + hasil);
  }

  @Override
  public void hitungLuas(int r) {
    double hasil = Math.PI * Math.pow(r, 2);
    System.out.println("Luas Lingkaran : " + hasil);
  }

  @Override
  public void karakteristik() {
    System.out.println("Karakteristik :\n - Memiliki diameter yang membagi lingkaran menjadi 2 sisi seimbang.\n - Memiliki jari-jari yang menghubungkan titik pusat dengan tiitk busur lingkaran.\n - Diameternya konstan.");
  }

  @Override
  public void menggambar() {
    System.out.println("Menggambar : Lingkaran");
  }
  
}
