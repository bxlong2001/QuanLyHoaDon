/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Bui
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Long Bui
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<KhachHang> listKH = new ArrayList<>();
        List<SanPham> listSP = new ArrayList<>();
        List<HoaDon> listHD = new ArrayList<>();
        int n,m,k,h = 0;
        
        do{
            System.out.println("======================");
            System.out.println("1. Quan ly san pham");
            System.out.println("2. Quan ly khach hang");
            System.out.println("3. Quan ly don hang");
            System.out.println("0. Thoat");
            System.out.println("======================");
            System.out.printf("Vui long chon: ");
            n = sc.nextInt();
            sc.nextLine();
            
            switch(n){
                case 1:
                    do {
                        System.out.println("======================");
                        System.out.println("1. Them san pham");
                        System.out.println("2. Danh sach san pham");
                        System.out.println("0. Thoat");
                        System.out.println("======================");
                        System.out.printf("Vui long chon: ");
                        m = sc.nextInt();
                        sc.nextLine();
                        
                        switch(m) {
                            case 1:
                                SanPham sanPham = new SanPham();
                                System.out.printf("Nhap ma sp muon them: ");
                                String maSp = sc.nextLine();
                                int flag = 0;
                                for (SanPham x : listSP) {
                                    if (x.getMaSp().equalsIgnoreCase(maSp)) {
                                        x.setSoLuong();
                                        flag = 1;
                                    }
                                }
                                if(flag==0){
                                    sanPham.themSp(maSp);
                                    listSP.add(sanPham);
                                }
                                break;
                            case 2:
                                for(SanPham x: listSP) {
                                    x.showInfo();
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Loi!");
                                break;
                        } 
                    }while(m!=0);        
                    break;
                case 2:
                    do {
                        System.out.println("======================");
                        System.out.println("1. Them khach hang");
                        System.out.println("2. Sua khach hang");
                        System.out.println("3. Danh sach KH");
                        System.out.println("0. Thoat");
                        System.out.println("======================");
                        System.out.printf("Vui long chon: ");
                        k = sc.nextInt();
                        sc.nextLine();
                        
                        switch(k) {
                            case 1: 
                                KhachHang khachHang = new KhachHang();
                                System.out.printf("Nhap ma KH muon them: ");
                                String maKh = sc.nextLine();
                                int flag = 0;
                                for (KhachHang x : listKH) {
                                    if (x.getMaKhachHang().equalsIgnoreCase(maKh)) {
                                        System.out.println("Ma KH da ton tai!");
                                        flag=1;
                                    }
                                }
                                if(flag==0){
                                    khachHang.themKH(maKh);
                                    listKH.add(khachHang);
                                }
                                break;
                            case 2:
                                System.out.printf("Nhap ma KH muon sua: ");
                                String maKH = sc.nextLine();
                                for(KhachHang x: listKH) {
                                    if(x.getMaKhachHang().equalsIgnoreCase(maKH)){
                                        x.suaThongTin();
                                    }
                                }
                                break;
                            case 3:
                                for(KhachHang x: listKH) {
                                    x.showInfo();
                                }
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        } 
                    }while(k!=0);
                    break;
                case 3:
                    do {
                        System.out.println("======================");
                        System.out.println("1. Mua hang");
                        System.out.println("2. Xem don hang");
                        System.out.println("0. Thoat");
                        System.out.println("======================");
                        System.out.printf("Vui long chon: ");
                        h = sc.nextInt();
                        sc.nextLine();
                        
                        switch(h) {
                            case 1: 
                                System.out.printf("Nhap ma KH muon mua: ");
                                String maKhMuonMua = sc.nextLine();
                                for(KhachHang x: listKH) {
                                    if(x.getMaKhachHang().equalsIgnoreCase(maKhMuonMua)){
                                        int var;
                                        do{
                                            HoaDon hoaDon = new HoaDon();
                                            System.out.printf("Nhap ma SP muon mua: ");
                                            String maSpMuonMua = sc.nextLine();
                                            x.muaHang(hoaDon, maSpMuonMua);
                                            System.out.printf("Ban co muon mua tiep khong? (1/0): ");
                                            var = sc.nextInt();
                                            sc.nextLine();
                                            listHD.add(hoaDon);
                                        }while(var!=0);
                                    }
                                }
                                break;
                            case 2:
                                for(KhachHang x: listKH){
                                    x.showBill(listHD,listSP);
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Loi!");
                                break;
                        } 
                    }while(h!=0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Loi!");
                    break;
            }
        }while(n!=0);
    }
}
