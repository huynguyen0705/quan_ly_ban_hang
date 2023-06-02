public class MayTinh extends DoDienTu implements IGiamGia{
    public MayTinh(String maHang, String tenHang, double giaHang, int soLuong, String doiTuongMua) {
        super(maHang, tenHang, giaHang, soLuong, doiTuongMua);

    }


    @Override
    public double GiamGia() {
        int soluong = getSoLuong();
        double giadagiam = 0;
        if (soluong > 100){
            giadagiam = getGiaHang() * 95 / 100;
        }
        return giadagiam;
    }
    public String HienThiSPMayTinh(){
        System.out.println("Mã hàng: " + getMaHang());
        System.out.println("Tên hàng: " + getTenHang());
        System.out.println("Giá: " + getGiaHang());
        System.out.println("Số lương: " + getSoLuong());
        System.out.println("Đối tượng mua: " + getDoiTuongMua());
        return "------------";
    }
}
