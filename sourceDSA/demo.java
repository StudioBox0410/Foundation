
public class Hello {
	public static void main(String[] args) {
			SinhVien SinhVienA = new SinhVien("DreamLatern", "28-08-2002",173);
			System.out.println("ThongTin: " + SinhVienA.HoVaTen);
			System.out.println("ThongTin: " + SinhVienA.NgaySinh);
			System.out.println("ThongTin: " + SinhVienA.ChieuCao);
	}
}
/*
 * Cú pháp: class ten_doi_tuong
 * */
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