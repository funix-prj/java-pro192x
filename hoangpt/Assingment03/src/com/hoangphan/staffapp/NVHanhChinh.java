package com.hoangphan.staffapp;
import java.util.Scanner;
import java.util.Scanner;

public class NVHanhChinh extends ThongTinChung implements IStaff {
	
	private String phongBan;
	private String chucVu;
	private int soNgayCong;
	private float luong;
	
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	
	public NVHanhChinh() {
	
	}
	public NVHanhChinh(String hoTen, int phuCap, float heSoLuong, String phongBan, String chucVu, int soNgayCong, float luong) {
		super(hoTen, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.chucVu = chucVu;
		this.soNgayCong = soNgayCong;
		this.luong = luong;
	}
	
	@Override
	public void NhapTT (){
		Scanner input = new Scanner(System.in);
		super.NhapTT();
		System.out.println("Nhap phong ban: ");
		this.phongBan=input.nextLine();
		System.out.println("Chuc vu: ");
		this.chucVu=input.nextLine();
		System.out.println("So ngay cong : ");
		this.soNgayCong = input.nextInt();	
		Salary();
	}
	@Override
	public void HienThiTT(){
		//System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s ", "Ho ten", "Phu cap", "He so luong", "Phong ban","Chuc vu","So ngay cong", "Luong");
		super.HienThiTT();
		System.out.printf("%-10s %-10s %-10d %-10f ", this.phongBan, this.chucVu, this.soNgayCong, this.luong);
	}
	@Override
	public float Salary(){
		return this.luong = this.getHeSoLuong()*ThongTinChung.hsl + this.getPhuCap()+ this.soNgayCong*ThongTinChung.std;	
	}
	
}
