package com.hoangphan.staffapp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyCanBo {
	Scanner input =new Scanner(System.in);
	public static ArrayList<ThongTinChung> listNV = new ArrayList<ThongTinChung>();
	public static ArrayList<GiangVien> listGV = new ArrayList<GiangVien>();
	public static ArrayList<NVHanhChinh> listNVHC = new ArrayList<NVHanhChinh>();

/*	public void menu(){
		boolean exit = true;
		do{
			Scanner input =new Scanner(System.in);
			System.out.println("\t Chon loai can bo: ");
			System.out.println("1. Giang Vien: ");
			System.out.println("2. Nhan vien hanh chinh: ");
			System.out.println("3. Thoat! ");
			System.out.print("Lua chon:");
			int chon =0;
			chon= input.nextInt();
			if(chon == 3) {
				exit = false;
				System.out.println("Da thoat chuong trinh!");
			}
			switch (chon){
			case 1 : 
				GiangVien GV = new GiangVien();
				GV.NhapTT();
				listNV.add(GV);
				break;
			case 2:
				NVHanhChinh HC = new NVHanhChinh();
				HC.NhapTT();
				listNV.add(HC);
				break;
			case 4:
				
				default:	
					System.out.println("ban phai nhap vao 1 lua chon : 1-3");
			}
		}
		while( exit);
	}
	*/
	
	// sap xep 
	
	 
	public void sapXepNV(ArrayList<GiangVien> listGV){
			//Collections.sort(listGV);		
	}
	
	// search thong tin	
	public void searchNameNV(ArrayList<NVHanhChinh> arr, String Name, String room){
		int i=0;
		System.out.printf("\nKet qua tim kiem :");
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s ", "Ho ten", "Phu cap", "He so luong", "Khoa","Trinh do", "So tiet day", "Luong");		
		for(int j=0;j<arr.size();j++){
			if ((arr.get(i).getHoTen().lastIndexOf(Name) >= 0) && (arr.get(i).getPhongBan().lastIndexOf(room) >= 0)) {				
				arr.get(i).HienThiTT();
				i++;
			}
			if(i==0){
				System.out.println("Khong tim thong tin nhan vien trong danh sach");
			}			
		}		
	}
	
	// import list Nhan vien	
	public void inputListNV(){		
		System.out.print("Nhap so luong can bo : ");
		int n = input.nextInt();
		for (int i=1; i<= n; i++){
			System.out.println("Chon loai can bo: 1.GiangVien, 2.NhanVienHC ");
			System.out.println("1. Giang Vien: ");
			System.out.println("2. Nhan vien hanh chinh: ");
			System.out.println("3. Thoat! ");
			System.out.println("Lua chon:");
			int chon =0;
			chon= input.nextInt();
			if(chon == 3) {
				System.out.println("Da thoat chuong trinh!");
			}
			switch (chon){
			case 1 : 
				System.out.println("Moi ban nhap thong tin Giang Vien");
				GiangVien GV = new GiangVien();
				GV.NhapTT();
				listNV.add(GV);
				listGV.add(GV);
				break;
			case 2:
				System.out.println("Moi ban nhap thong tin Nhan Vien hanh chinh ");
				NVHanhChinh HC = new NVHanhChinh();
				HC.NhapTT();
				listNV.add(HC);
				listNVHC.add(HC);
				break;
			case 4:
				default:	
				System.out.println("ban phai nhap vao 1 lua chon : 1-3");
			}
		}
	}
	// show list can bo
	public void showListNV(ArrayList<ThongTinChung> listNV){
		System.out.println("Danh sach can bo:");
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s ", "Ten", "Phu cap", "He so luong", "Phong/Khoa","Trinh do/Chuc vu", "Sotietday/Giolam", "Luong");
		for (int i=0; i< listNV.size();i++){
			listNV.get(i).HienThiTT();
		}
	}
	// show list Giang vien
	public void showListGV(ArrayList<GiangVien> listGV){
		System.out.printf("\nDanh sach Giang vien:");
		System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s ", "Ten", "Phu cap", "He so luong", "Khoa","Trinh do", "So tiet day", "Luong");
		for (int i=0; i< listNV.size();i++){
			listGV.get(i).HienThiTT();
		}
	}
	
	public static void main(String[] args) {	
		Scanner input =new Scanner(System.in);
		QuanLyCanBo QL = new QuanLyCanBo();
		QL.inputListNV();
		//QL.showListNV(listNV);
		//QL.showListGV(listGV);
		//System.out.printf("\nMoi ban nhap ten nhan vien can tim:");		
		//String Name = input.nextLine();
		//System.out.printf("\nMoi ban nhap ten phong ban:");
		//String room = input.nextLine();
		//QL.searchNameNV(listNVHC, Name, room);
		
		 Collections.sort(listGV, GiangVien.compare); //quick -sort
		 System.out.println("Sau khi sap xep");
		 for(GiangVien item: listGV){
		   System.out.println(item);
		 }
	}
}

