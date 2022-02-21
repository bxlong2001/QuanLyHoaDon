
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Long Bui
 */
public class HoaDon {

    private int soLuongMua;
    private String maSpMuonMua;
    private String maKhMuonMua;

    public HoaDon() {
    }

    public HoaDon(int soLuongMua, String maSpMuonMua, String maKhMuonMua) {
        this.soLuongMua = soLuongMua;
        this.maSpMuonMua = maSpMuonMua;
        this.maKhMuonMua = maKhMuonMua;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public String getMaSpMuonMua() {
        return maSpMuonMua;
    }

    public void setMaSpMuonMua(String maSpMuonMua) {
        this.maSpMuonMua = maSpMuonMua;
    }

    public String getMaKhMuonMua() {
        return maKhMuonMua;
    }

    public void setMaKhMuonMua(String maKhMuonMua) {
        this.maKhMuonMua = maKhMuonMua;
    }

    public int showBill(List<SanPham> listSP) {
        int sum = 0;
        System.out.println("San pham: " + this.getMaSpMuonMua());
        System.out.println("So luong: " + this.getSoLuongMua());
        for (SanPham x : listSP) {
            if (x.getMaSp().equalsIgnoreCase(this.getMaSpMuonMua())) {
                sum += this.getSoLuongMua()*x.getDonGia();
            }
        }
        return sum;
    }
}
