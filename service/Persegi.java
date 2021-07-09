package service;

public class Persegi implements BangunDatar{
  @Override
  public void menggambar(){
    System.out.println("Menggambar : Persegi");
  }

  @Override
  public void karakteristik(){
    System.out.println("Karakteristik :\n Persegi adalah bangun datar dua dimensi yang dibentuk \n oleh empat buah rusuk yang sama panjang dan memiliki \n empat buah sudut yang kesemuanya adalah sudut siku-siku.");
  }

  @Override
  public void hitungLuas(int panjang){
    int hasil = panjang*panjang;
    System.out.println("Luas Persegi : " + hasil);
  }

  @Override
  public void hitungKeliling(int panjang){
    int hasil = panjang*4;
    System.out.println("Keliling Persegi : " + hasil);
  }


  
}
