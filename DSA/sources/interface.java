
public class Hello {
	public static void main(String[] args) {
//			Sinh Vien
		SinhVien SinhVienA = new SinhVien();
		String name = SinhVienA.CamXucVui();
		SinhVienA.Calisthenics();
		System.out.println(name + "\n");
//			GiaoVien
		GiaoVien GiaoVienA = new GiaoVien();
		GiaoVienA.Calisthenics();
		String TenGiaoVien = GiaoVienA.Ten;
		System.out.println("Ten Giao Vien: "+TenGiaoVien);

	}
}

//interface
interface trangThai {
	String Ten = "Atom";// constant variable
	String CamXucVui();
}

interface hanhDong {
	void Calisthenics();
}

//GiaoVien
class GiaoVien extends SinhVien {

	@Override
	public void Calisthenics() {
		// TODO Auto-generated method stub
		System.out.println("GiaoVien override Calisthenics of SinhVien");;
	}
}

//SinhVien
class SinhVien implements trangThai, hanhDong {

	/* Phương thức khởi tạo */

	@Override
	public void Calisthenics() {

		System.out.println("Calisthenics");
	}
	@Override
	public String CamXucVui() {
		return "I'm so happy";
	}

}