import java.util.ArrayList;

public class QuanLyHangHoa {
    ArrayList<DoAn> dsDoAn;
    ArrayList<MayTinh> dsMayTinh;
    ArrayList<DoTrangTri> dsDoTrangTri;
    ArrayList<KhachHang> dsKhachHangDoAn;
    ArrayList<KhachHang> dsKhachHangMayTinh;
    ArrayList<KhachHang> dsKhachHangDoTrangTri;


    public QuanLyHangHoa() {
        dsDoAn = new ArrayList<>();
        dsMayTinh = new ArrayList<>();
        dsDoTrangTri = new ArrayList<>();
        dsKhachHangDoAn = new ArrayList<>();
        dsKhachHangMayTinh = new ArrayList<>();
        dsKhachHangDoTrangTri = new ArrayList<>();
    }

    public void ThemHangHoaDoAn(String maHang, String tenHang, double giaHang, int soLuong, String doiTuongMua, int ngayHetHan) {
        DoAn doAn = new DoAn(maHang, tenHang, giaHang, soLuong, doiTuongMua, ngayHetHan);
        dsDoAn.add(doAn);
        System.out.println("Thêm mặt hàng thành công");
        for (int i = 0; i < dsDoAn.size(); i++) {
            dsDoAn.get(i).HienThiDoAn();
        }
    }

    public void ThemHangHoaMayTinh(String maHang, String tenHang, double giaHang, int soLuong, String doiTuongMua) {
        MayTinh mayTinh = new MayTinh(maHang, tenHang, giaHang, soLuong, doiTuongMua);
        dsMayTinh.add(mayTinh);
        System.out.println("Thêm mặt hàng thành công");
        for (int i = 0; i < dsMayTinh.size(); i++) {
            System.out.println(dsMayTinh.get(i).HienThiSPMayTinh());
        }
    }

    public void ThemHangHoaDoTrangTri(String maHang, String tenHang, double giaHang, int soLuong, String doiTuongMua) {
        DoTrangTri doTrangTri = new DoTrangTri(maHang, tenHang, giaHang, soLuong, doiTuongMua);
        dsDoTrangTri.add(doTrangTri);
        System.out.println("Thêm mặt hàng thành công");
        for (int i = 0; i < dsDoTrangTri.size(); i++) {
            System.out.println(dsDoTrangTri.get(i).HienThiSPDoTrangTri());
        }
    }

    public void ThemKhachHangDoAn(KhachHang khachHang){
        dsKhachHangDoAn.add(khachHang);
        System.out.println("Thêm khách hàng thành công");
        for (int i = 0; i < dsKhachHangDoAn.size(); i++) {
            System.out.println(dsKhachHangDoAn.get(i).HienThiKhachHang());
        }
    }
    public void ThemKhachHangMayTinh(KhachHang khachHang){
        dsKhachHangMayTinh.add(khachHang);
        System.out.println("Thêm khách hàng thành công");
        for (int i = 0; i < dsKhachHangMayTinh.size(); i++) {
            System.out.println(dsKhachHangMayTinh.get(i).HienThiKhachHang());
        }
    }
    public void ThemKhachHangDoTrangTri(KhachHang khachHang){
        dsKhachHangDoTrangTri.add(khachHang);
        System.out.println("Thêm khách hàng thành công");
        for (int i = 0; i < dsKhachHangDoTrangTri.size(); i++) {
            System.out.println(dsKhachHangDoTrangTri.get(i).HienThiKhachHang());
        }
    }

    public void MuaHangDoAn(String maHang, KhachHang khachHang) {
        DoAn doAn = null;
        for (int i = 0; i < dsDoAn.size(); i++) {
            if (dsDoAn.get(i).getMaHang().equals(maHang)) {
                doAn = dsDoAn.get(i);
                break;
            }
        }
        if (doAn == null) {
            System.out.println("không có sản phẩm có mã là: " + maHang);
            return;
        }

        if (khachHang.getTuoiKH() < 18 && doAn.getDoiTuongMua().equals("nguoilon")) {
            System.out.println("bạn chưa đủ tuổi mua hàng");
            return;
        } else if (khachHang.getTuoiKH() >= 18 && doAn.getDoiTuongMua().equals("thanhthieunien")) {
            System.out.println("sản phẩm dành cho trẻ em");
            return;
        } else if (khachHang.getSoDuTrongVi() < doAn.getGiaHang()) {
            System.out.println("bạn không đủ số dư");
            return;
        } else {
            khachHang.setSoDuTrongVi(khachHang.getSoDuTrongVi() - doAn.getGiaHang());
            doAn.setSoLuong(doAn.getSoLuong() - 1);
            System.out.println("mua hàng thành công");
        }

    }

    public void MuaHangMayTinh(String maHang, KhachHang khachHang) {
        MayTinh mayTinh = null;
        for (int i = 0; i < dsMayTinh.size(); i++) {
            if (dsMayTinh.get(i).getMaHang().equals(maHang)) {
                mayTinh = dsMayTinh.get(i);
                break;
            }
        }
        if (mayTinh == null) {
            System.out.println("không có sản phẩm có mã là: " + maHang);
            return;
        }

        if (khachHang.getTuoiKH() < 18 && mayTinh.getDoiTuongMua().equals("nguoilon")) {
            System.out.println("bạn chưa đủ tuổi mua hàng");
            return;
        } else if (khachHang.getTuoiKH() >= 18 && mayTinh.getDoiTuongMua().equals("thanhthieunien")) {
            System.out.println("sản phẩm dành cho trẻ em");
            return;
        } else if (khachHang.getSoDuTrongVi() < mayTinh.getGiaHang()) {
            System.out.println("bạn không đủ số dư");
            return;
        } else {
            khachHang.setSoDuTrongVi(khachHang.getSoDuTrongVi() - mayTinh.getGiaHang());
            mayTinh.setSoLuong(mayTinh.getSoLuong() - 1);
            System.out.println("mua hàng thành công");
        }

    }

    public void MuaHangDoTrangTri(String maHang, KhachHang khachHang) {
        DoTrangTri doTrangTri = null;
        for (int i = 0; i < dsDoTrangTri.size(); i++) {
            if (dsDoTrangTri.get(i).getMaHang().equals(maHang)) {
                doTrangTri = dsDoTrangTri.get(i);
                break;
            }
        }
        if (doTrangTri == null) {
            System.out.println("không có sản phẩm có mã là: " + maHang);
            return;
        }

        if (khachHang.getTuoiKH() < 18 && doTrangTri.getDoiTuongMua().equals("nguoilon")) {
            System.out.println("bạn chưa đủ tuổi mua hàng");
            return;
        } else if (khachHang.getTuoiKH() >= 18 && doTrangTri.getDoiTuongMua().equals("thanhthieunien")) {
            System.out.println("sản phẩm dành cho trẻ em");
            return;
        } else if (khachHang.getSoDuTrongVi() < doTrangTri.getGiaHang()) {
            System.out.println("bạn không đủ số dư");
            return;
        } else {
            khachHang.setSoDuTrongVi(khachHang.getSoDuTrongVi() - doTrangTri.getGiaHang());
            doTrangTri.setSoLuong(doTrangTri.getSoLuong() - 1);
            System.out.println("mua hàng thành công");
        }

    }

}

