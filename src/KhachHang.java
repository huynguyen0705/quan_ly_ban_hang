public class KhachHang {
    private String MaKH;
    private String TenKH;
    private int TuoiKH;
    private double SoDuTrongVi;
    public KhachHang(){

    }

    public KhachHang(String maKH, String tenKH, int tuoiKH, double soDuTrongVi) {
        MaKH = maKH;
        TenKH = tenKH;
        TuoiKH = tuoiKH;
        SoDuTrongVi = soDuTrongVi;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public int getTuoiKH() {
        return TuoiKH;
    }

    public void setTuoiKH(int tuoiKH) {
        TuoiKH = tuoiKH;
    }

    public double getSoDuTrongVi() {
        return SoDuTrongVi;
    }

    public void setSoDuTrongVi(double soDuTrongVi) {
        SoDuTrongVi = soDuTrongVi;
    }
    public String HienThiKhachHang(){
        System.out.println("Mã khách hàng: " + getMaKH());
        System.out.println("Tên Khách hàng: " + getTenKH());
        System.out.println("Tuổi: " + getTuoiKH());
        System.out.println("Số dư: " + getSoDuTrongVi());
        return "-----------";
    }
}
