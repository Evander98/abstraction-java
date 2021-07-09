package service;

public class Main {
  public static void main(String[] args){
    Persegi persegi = new Persegi();
    Segitiga segitiga = new Segitiga();
    Lingkaran lingkaran = new Lingkaran();

    persegi.menggambar();
    persegi.karakteristik();
    persegi.hitungLuas(5);
    persegi.hitungKeliling(5);

    System.out.println();

    segitiga.menggambar();
    segitiga.karakteristik();
    segitiga.hitungLuas(5, 5);
    segitiga.hitungKeliling(5, 5, 5);

    System.out.println();

    lingkaran.menggambar();
    lingkaran.karakteristik();
    lingkaran.hitungLuas(5);
    lingkaran.hitungKeliling(5);
  }
}
