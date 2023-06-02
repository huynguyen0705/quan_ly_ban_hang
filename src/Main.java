import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            QuanLyHangHoa quanLyHangHoa = new QuanLyHangHoa();
            boolean isRunning = true;
            Scanner scanner = new Scanner(System.in);
            while (isRunning) {
                System.out.println("1. Người bán hàng");
                System.out.println("2. Người mua hàng");
                System.out.println("3. Thoát");
                System.out.println("Nhập lựa chọn: ");
                int input = scanner.nextInt();
                if (input < 1 || input > 3) {
                    System.out.println("Nhập sai");
                }
                switch (input) {
                    case 1:
                        System.out.println("Nhập hàng hoá vào kho");
                        System.out.println("1. Thêm hàng hoá đồ ăn");
                        System.out.println("2. Thêm hàng hoá máy tính");
                        System.out.println("3. Thêm hàng hoá đồ trang trí");
                        int input1 = scanner.nextInt();
                        if (input1 < 1 || input1 > 3) {
                            System.out.println("Nhập sai");
                        }
                        switch (input1) {
                            case 1:
                                System.out.println("Đồ ăn");
                                System.out.println("Nhập mã hàng: ");
                                Scanner scanner1 = new Scanner(System.in);
                                String maHang = scanner1.next();
                                System.out.println("Nhập tên hàng: ");
                                Scanner scanner2 = new Scanner(System.in);
                                String tenHang = scanner2.next();
                                System.out.println("Nhập giá hàng: ");
                                Scanner scanner3 = new Scanner(System.in);
                                double giaHang = scanner3.nextDouble();
                                System.out.println("Nhập số lượng hàng: ");
                                Scanner scanner4 = new Scanner(System.in);
                                int soLuong = scanner4.nextInt();
                                System.out.println("Nhập đối tượng mua hàng (thanhthieunien/ nguoilon): ");
                                Scanner scanner5 = new Scanner(System.in);
                                String doiTuong = scanner5.next();
                                System.out.println("Nhập ngày hết hạn: ");
                                Scanner scanner6 = new Scanner(System.in);
                                int ngayHetHan = scanner6.nextInt();
                                quanLyHangHoa.ThemHangHoaDoAn(maHang, tenHang, giaHang, soLuong, doiTuong, ngayHetHan);
                                break;

                            case 2:
                                System.out.println("Máy tính");
                                System.out.println("Nhập mã hàng: ");
                                Scanner scanner7 = new Scanner(System.in);
                                String maHangMT = scanner7.next();
                                System.out.println("Nhập tên hàng: ");
                                Scanner scanner8 = new Scanner(System.in);
                                String tenHangMT = scanner8.next();
                                System.out.println("Nhập giá hàng: ");
                                Scanner scanner9 = new Scanner(System.in);
                                double giaHangMT = scanner9.nextDouble();
                                System.out.println("Nhập số lượng hàng: ");
                                Scanner scanner10 = new Scanner(System.in);
                                int soLuongMT = scanner10.nextInt();
                                System.out.println("Nhập đối tượng mua hàng (thanhthieunien/ nguoilon): ");
                                Scanner scanner11 = new Scanner(System.in);
                                String doiTuongMT = scanner11.next();
                                quanLyHangHoa.ThemHangHoaMayTinh(maHangMT, tenHangMT, giaHangMT, soLuongMT, doiTuongMT);
                                break;

                            case 3:
                                System.out.println("Đồ trang trí");
                                System.out.println("Nhập mã hàng: ");
                                Scanner scanner12 = new Scanner(System.in);
                                String maHangTT = scanner12.next();
                                System.out.println("Nhập tên hàng: ");
                                Scanner scanner13 = new Scanner(System.in);
                                String tenHangTT = scanner13.next();
                                System.out.println("Nhập giá hàng: ");
                                Scanner scanner14 = new Scanner(System.in);
                                double giaHangTT = scanner14.nextDouble();
                                System.out.println("Nhập số lượng hàng: ");
                                Scanner scanner15 = new Scanner(System.in);
                                int soLuongTT = scanner15.nextInt();
                                System.out.println("Nhập đối tượng mua hàng (thanhthieunien/ nguoilon): ");
                                Scanner scanner16 = new Scanner(System.in);
                                String doiTuongTT = scanner16.next();
                                quanLyHangHoa.ThemHangHoaDoTrangTri(maHangTT, tenHangTT, giaHangTT, soLuongTT, doiTuongTT);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Mua Hàng");
                        System.out.println("1. Mua đồ ăn");
                        System.out.println("2. Mua máy tính");
                        System.out.println("3. Mua đồ trang trí");
                        System.out.println("Nhập lựa chọn: ");
                        int input2 = scanner.nextInt();
                        if (input2 < 1 || input2 > 3) {
                            System.out.println("Nhập sai");
                        }
                        switch (input2) {
                            case 1:
                                System.out.println("Mua đồ ăn");
                                System.out.println("Nhập mã khách hàng: ");
                                String maKH = scanner.next();
                                System.out.println("Nhập tên khách hàng: ");
                                String tenKH = scanner.next();
                                System.out.println("Nhập tuổi: ");
                                int tuoiKH = scanner.nextInt();
                                System.out.println("Nhập số dư trong ví: ");
                                double soDuTrongVi = scanner.nextDouble();
                                KhachHang khachHang = new KhachHang(maKH, tenKH, tuoiKH, soDuTrongVi);
                                quanLyHangHoa.ThemKhachHangDoAn(khachHang);
                                System.out.println("Mua Hàng");
                                System.out.println("Nhập mã cần mua: ");
                                String maHang = scanner.next();
                                quanLyHangHoa.MuaHangDoAn(maHang, khachHang);
                                break;

                            case 2:
                                System.out.println("Mua máy tính");
                                System.out.println("Nhập mã khách hàng: ");
                                String maKHMT = scanner.next();
                                System.out.println("Nhập tên khách hàng: ");
                                String tenKHMT = scanner.next();
                                System.out.println("Nhập tuổi: ");
                                int tuoiKHMT = scanner.nextInt();
                                System.out.println("Nhập số dư trong ví: ");
                                double soDuTrongViMT = scanner.nextDouble();
                                KhachHang khachHangMT = new KhachHang(maKHMT, tenKHMT, tuoiKHMT, soDuTrongViMT);
                                quanLyHangHoa.ThemKhachHangMayTinh(khachHangMT);
                                System.out.println("Mua Hàng");
                                System.out.println("Nhập mã cần mua: ");
                                String maHangMT = scanner.next();
                                quanLyHangHoa.MuaHangMayTinh(maHangMT, khachHangMT);
                                break;

                            case 3:
                                System.out.println("Mua đồ trang trí");
                                System.out.println("Nhập mã khách hàng: ");
                                String maKHTT = scanner.next();
                                System.out.println("Nhập tên khách hàng: ");
                                String tenKHTT = scanner.next();
                                System.out.println("Nhập tuổi: ");
                                int tuoiKHTT = scanner.nextInt();
                                System.out.println("Nhập số dư trong ví: ");
                                double soDuTrongViTT = scanner.nextDouble();
                                KhachHang khachHangTT = new KhachHang(maKHTT, tenKHTT, tuoiKHTT, soDuTrongViTT);
                                quanLyHangHoa.ThemKhachHangDoTrangTri(khachHangTT);
                                System.out.println("Mua Hàng");
                                System.out.println("Nhập mã cần mua: ");
                                String maHangTT = scanner.next();
                                quanLyHangHoa.MuaHangDoTrangTri(maHangTT, khachHangTT);
                                break;
                        }
                        break;

                    case 3:
                        isRunning = false;
                        break;
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Nhập sai kiểu rồi");
        }
    }

}