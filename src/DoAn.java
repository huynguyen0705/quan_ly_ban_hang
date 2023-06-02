public class DoAn extends HangHoa implements IGiamGia{
    private int NgayHetHan;
    public DoAn(){

    }

    public DoAn(String maHang, String tenHang, double giaHang, int soLuong, String doiTuongMua, int ngayHetHan) {
        super(maHang, tenHang, giaHang, soLuong, doiTuongMua);
        NgayHetHan = ngayHetHan;
    }

    public int getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(int ngayHetHan) {
        NgayHetHan = ngayHetHan;
    }

    @Override
    public double GiamGia() {
        double giadagiam = 0;
        if (getNgayHetHan() <= 5){
            giadagiam = getGiaHang() * 70 / 100;
        }
        return giadagiam;
    }
    public void HienThiDoAn(){
        System.out.println("Mã hàng: " + getMaHang());
        System.out.println("Tên hàng: " + getTenHang());
        System.out.println("Giá: " + getGiaHang());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("Đối tượng mua: " + getDoiTuongMua());
        System.out.println("Ngày hết hạn: " + getNgayHetHan());
    }
}
