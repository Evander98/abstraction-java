package service;

public class Segitiga implements BangunDatar{
  @Override
  public void hitungLuas(int param) {
    
  }

  @Override
  public void hitungKeliling(int param) {

  }
  
  @Override
  public void hitungLuas(int alas, int tinggi) {
    double hasil = 0.5 * alas * tinggi;
    System.out.println("Luas Segitiga : " + hasil);
  }

  @Override
  public void hitungKeliling(int alas, int sisiKiri, int sisiKanan) {
    int hasil = alas + sisiKiri + sisiKanan;
    System.out.println("Keliling Segitiga : " + hasil);
  }

  @Override
  public void karakteristik() {
    System.out.println("Karakteristik :\n - Mempunyai 3 sisi dengan jumlah panjang dua sisinya lebih panjang dari panjang sisi yang lain.\n - Mempunyai 3 sudut yang jumlah besarnya 180 derajat.");
  }

  @Override
  public void menggambar() {
    System.out.println("Menggambar : Segitiga");
  }
  
}
