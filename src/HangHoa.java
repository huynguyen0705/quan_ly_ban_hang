public class HangHoa {
    private String MaHang;
    private String TenHang;
    private double GiaHang;
    private int SoLuong;
    private String DoiTuongMua;
    public HangHoa(){

    }

    public HangHoa(String maHang, String tenHang, double giaHang, int soLuong, String doiTuongMua) {
        MaHang = maHang;
        TenHang = tenHang;
        GiaHang = giaHang;
        SoLuong = soLuong;
        DoiTuongMua = doiTuongMua;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public double getGiaHang() {
        return GiaHang;
    }

    public void setGiaHang(double giaHang) {
        GiaHang = giaHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getDoiTuongMua() {
        return DoiTuongMua;
    }

    public void setDoiTuongMua(String doiTuongMua) {
        DoiTuongMua = doiTuongMua;
    }
}
