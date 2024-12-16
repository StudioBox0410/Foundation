
public class Hello {
	public static void main(String[] args) {
//			Sinh Vien
			SinhVien SinhVienA = new SinhVien("DreamLatern", "28-08-2002",173);
			
//			GiaoVien
			GiaoVien GiaoVienA = new GiaoVien("GiaoVienA", "10-10-2000", 175, "GVCNLop83");
			GiaoVienA.tinhLuong();
			System.out.println("\n");
			
//			Hieu Truong
			HieuTruong HieuTruongA = new HieuTruong("HieuTruongA", "12-12-2002", 185, "HieuTruongKhoaII", "Truong THCS PCT");
			HieuTruongA.tinhLuong();
	}
}
/*
 * Cú pháp: class ten_doi_tuong
 * */

class GiaoVien extends SinhVien{
	String ChucVu;
	String LopDay;
	public GiaoVien(String HovaTen, String NgaySinh, int ChieuCao, String ChucVu) {
		super(HovaTen, NgaySinh, ChieuCao);
		this.ChucVu = ChucVu;
	}
	public void tinhLuong() {
		System.out.println("Lương của giáo viên là 20tr");
	}
}

class HieuTruong extends GiaoVien{
	String Truong;
	public HieuTruong(String HovaTen, String NgaySinh, int ChieuCao, String ChucVu, String Truong) {
		super(HovaTen, NgaySinh, ChieuCao, ChucVu);
		this.Truong = Truong;
	}
//	Ghi đè hàm tính lương 
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Lương của hiệu trưởng là 40tr");
	}
}

class SinhVien{
	String HoVaTen;
	String NgaySinh;
	int ChieuCao;
	
/*Phương thức khởi tạo*/	
	public SinhVien(String HoVaTen, String NgaySinh, int ChieuCao) {
		//TODO Auto-generated constructor stub
		this.HoVaTen=HoVaTen;
		this.NgaySinh=NgaySinh;
		this.ChieuCao=ChieuCao;
		
	}
	
}