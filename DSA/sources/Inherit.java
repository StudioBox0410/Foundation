
public class Hello {
	public static void main(String[] args) {
//			Sinh Vien
			SinhVien SinhVienA = new SinhVien("DreamLatern", "28-08-2002",173);
			System.out.println("ThongTin: " + SinhVienA.HoVaTen);
			System.out.println("ThongTin: " + SinhVienA.NgaySinh);
			System.out.println("ThongTin: " + SinhVienA.ChieuCao + "\n\n");
			
//			GiaoVien
			GiaoVien GiaoVienA = new GiaoVien("GiaoVienA", "10-10-2000", 175, "GVCNLop83");
			System.out.println("ThongTinGiaoVienA: " + GiaoVienA.NgaySinh);
			System.out.println("ThongTinGiaoVienA: " + GiaoVienA.ChucVu + "\n\n");
			
//			Hieu Truong
			HieuTruong HieuTruongA = new HieuTruong("HieuTruongA", "12-12-2002", 185, "HieuTruongKhoaII", "Truong THCS PCT");
			System.out.println("ThongTinHieuTruongA: " + HieuTruongA.HoVaTen);
			System.out.println("ThongTinHieuTruongA: " + HieuTruongA.ChucVu);
			System.out.println("ThongTinHieuTruongA: " + HieuTruongA.Truong);
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
}
class HieuTruong extends GiaoVien{
	String Truong;
	public HieuTruong(String HovaTen, String NgaySinh, int ChieuCao, String ChucVu, String Truong) {
		super(HovaTen, NgaySinh, ChieuCao, ChucVu);
		this.Truong = Truong;
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