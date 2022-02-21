
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Long Bui
 */
public class SanPham {

    Scanner sc = new Scanner(System.in);
    private String maSp;
    private String tenSp;
    private int donGia;
    private String ngaySanXuat;
    private int soLuong = 1;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, int donGia, String ngaySanXuat) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setSoLuong() {
        this.soLuong += 1;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void themSp(String maSp) {
        this.setMaSp(maSp);
        System.out.printf("Nhap ten sp muon them: ");
        this.setTenSp(sc.nextLine());
        System.out.printf("Nhap don gia: ");
        this.setDonGia(sc.nextInt());
        sc.nextLine();
        System.out.printf("Nhap ngay san xuat: ");
        this.setNgaySanXuat(sc.nextLine());
    }

    public void showInfo() {
        System.out.println("================================");
        System.out.println("MaSP: " + getMaSp());
        System.out.println("TenSP: " + getTenSp());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Ngay san xuat: " + getNgaySanXuat());
        System.out.println("So luong: " + getSoLuong());
    }
}
