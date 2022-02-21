
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Long Bui
 */
public class KhachHang {

    Scanner sc = new Scanner(System.in);
    private String maKhachHang;
    private String tenKhachHang;
    private int namSinh;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, int namSinh, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void themKH(String maKh) {
        this.setMaKhachHang(maKh);
        System.out.printf("Nhap ten khach hang: ");
        this.setTenKhachHang(sc.nextLine());
        System.out.printf("Nhap nam sinh: ");
        this.setNamSinh(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.setDiaChi(sc.nextLine());
    }

    public void muaHang(HoaDon hoaDon, String maSpMuonMua) {
        hoaDon.setMaKhMuonMua(this.getMaKhachHang());
        hoaDon.setMaSpMuonMua(maSpMuonMua);
        System.out.printf("Nhap so luong mua: ");
        hoaDon.setSoLuongMua(sc.nextInt());
    }

    public void suaThongTin() {
        System.out.printf("Nhap ten moi cho KH: ");
        this.setTenKhachHang(sc.nextLine());
        System.out.printf("Nhap nam sinh moi cho KH: ");
        this.setNamSinh(sc.nextInt());
        sc.nextLine();
    }

    public void showInfo() {
        System.out.println("==============================");
        System.out.println("Ma KH: " + this.getMaKhachHang());
        System.out.println("Ten KH: " + this.getTenKhachHang());
        System.out.println("Nam sinh: " + this.getNamSinh());
        System.out.println("Dia chi: " + this.getDiaChi());
    }
    
    public void showBill(List<HoaDon> listHD, List<SanPham> listSP) {
        int sum = 0;
        System.out.println("========================================");
        System.out.println("Hoa Don Cua Quy Khach "+this.getTenKhachHang()+":");
        System.out.println("Ma Khach Hang: "+this.getMaKhachHang());
        for(HoaDon x: listHD){
            if(x.getMaKhMuonMua().equalsIgnoreCase(this.getMaKhachHang())){
                sum += x.showBill(listSP);
            }
        }
        System.out.println("Tong tien: "+sum);
    }
}
