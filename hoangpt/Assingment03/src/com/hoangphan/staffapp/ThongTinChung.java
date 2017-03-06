package com.hoangphan.staffapp;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class ThongTinChung {
	private String hoTen ;
	private int phuCap;
	private float heSoLuong;
	public static int hsl=730;
	public static int std=45;
	public static int snc=30;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	// constructor
	public ThongTinChung(){
		
	}
	public ThongTinChung(String hoTen, int phuCap, float heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
	}
	
	public void NhapTT(){
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("Moi ban nhap ten :");
		this.hoTen = input.nextLine();
		System.out.println("Moi ban nhap phu cap : ");
		this.phuCap = input.nextInt();
		System.out.println("moi ban nhap he so luong : ");
		this.heSoLuong = input.nextFloat();
	}
	
	public void HienThiTT(){
		System.out.printf("\n%-10s %-10d %-10f ", this.hoTen, this.phuCap, this.heSoLuong);	
	}
}
