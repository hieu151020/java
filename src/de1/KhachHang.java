package de1;
import java.util.Scanner;

public abstract class KhachHang {
	 public static void main(String[] args) {
		 Khachhang khachhang = new Khachhang();
		 khachhang.NhapTTKH();
		 System.out.println("MaKH:"+khachhang.MaKH+);
		 System.out.println("TenKH:"+khachhang.TenKH+);
		 System.out.println("SDT:"+khachhang.SDT+);
		 khachhang.HienThiTTKH();
	 }
class Khachhang
{
	 public int MaKH;
	 public String TenKH;
	 public int SDT;
     
	 public void NhapTTKH() {
		 System.out.println("Nhập mã Khách Hàng");
		 Scanner nhap=new Scanner(System.in);
		 MaKH=nhap.nextInt();
		 System.out.println("Nhập tên Khách Hàng:");
		 TenKH = nhap.nextLine();
		 System.out.println("Nhập SDT Khách Hàng");
		 SDT=nhap.nextInt();
	 }
	 public void HienThiTTKH() {
		 System.out.println("Mã Khách Hàng: " + MaKH + "");
	     System.out.println("Tên Khách Hàng: " + TenKH +"");
	     System.out.println("SDT: " + SDT +""); 
	 }
	}
}

