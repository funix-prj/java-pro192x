package com.hoangphan.staffapp;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Comparator;

public class GiangVien extends ThongTinChung implements IStaff {
	
	private String khoa;
	private String trinhDo;
	private int soTietDay;
	private float luong;
	
	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	
	public float getLuong() {
		return luong;
	}
	
	public void setLuong(float luong) {
		this.luong = luong;
	}

	public GiangVien(){
		
	}

	public GiangVien(String hoTen, int phuCap, float heSoLuong, String khoa, String trinhDo, int soTietDay, float luong) {
		super(hoTen, phuCap, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
		this.luong = luong;
	}

	@Override
	public void NhapTT (){
		Scanner input = new Scanner(System.in);
		super.NhapTT();
		System.out.println("Nhap khoa ");
		this.khoa=input.nextLine();
		System.out.println("Trinh do Giang Vien ");
		this.trinhDo=input.nextLine();
		System.out.println("Moi ban nhap so tiet day: ");
		this.soTietDay = input.nextInt();
		Salary();
	}
	@Override
	public void HienThiTT(){
		super.HienThiTT();
		System.out.printf("%-10s %-10s %-10d %-10f ", this.khoa, this.trinhDo, this.soTietDay, this.luong);
	}
	@Override
	public float Salary(){
		return this.luong = this.getHeSoLuong()*ThongTinChung.hsl + this.getPhuCap()+ this.soTietDay*ThongTinChung.std;	
	}
	
	public static Comparator<GiangVien> compare = new Comparator<GiangVien>() {	 
	@Override
	public int compare(GiangVien o1, GiangVien o2) {
      if(o1.getLuong() == o2.getLuong()){
        return o1.getHoTen().compareTo(o2.getHoTen());
      }
      
      //return Float.compare(o1.getLuong(), o2.getLuong());
      if(o1.getLuong() > o2.getLuong()) return 1;
      
      return -1;
      }
	 };

  @Override
  public String toString() {
    return "GiangVien{  name: "+ getHoTen() + "| salary=" + getLuong();
  }
}
