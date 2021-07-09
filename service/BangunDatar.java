package service;

public interface BangunDatar {
  public void menggambar();

  public void karakteristik();

  public void hitungLuas(int param);

  default void hitungLuas(int param1, int param2){};

  public void hitungKeliling(int param);

  default void hitungKeliling(int param1, int param2, int param3){};
  
}
