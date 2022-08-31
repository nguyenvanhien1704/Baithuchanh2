import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class Thucpham1 {
	private final String mahang = " xxx" ;
	private String tenHang;
	private double dongia;
	private LocalDate  nsx, hsd;
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public LocalDate getNsx() {
		return nsx;
	}
	public void setNsx(LocalDate nsx) {
		this.nsx = nsx;
	}
	public LocalDate getHsd() {
		return hsd;
	}
	public void setHsd(LocalDate hsd) {
		this.hsd = hsd;
	}

	public Thucpham1(String string, int i, String string3, String string4) {
	}
	public Thucpham1(String mahang ,String tenHang, double dongia, LocalDate nsx, LocalDate hsd) {
		super();
		this.tenHang = tenHang;
		this.dongia = dongia;
		this.nsx = nsx;
		this.hsd = hsd;
	}

	/* Khoi tao phuong thuc kiem tra ten hang khong duoc trong */ 
//	public boolean checkHang(boolean k) {
//		if(this.tenHang ==" " || this.tenHang.isEmpty()) {
//			System.out.println(" Ten hang khong duoc bo trong !!");
//		}else {
//			k = false ;
//		}
//	return k ;
//	}
	/* Khoi tao phuong thuc kiem tra hsd khong duoc nho hon nsx*/ 
//	public boolean checkngay(boolean t)
//	{
//		if(this.getNsx().compareTo(this.getHsd())< 0) {
//			t = false  ;
//		}
//	return t;
//	}
	
	/* Kiem tra con hsd ?*/
	public boolean  checkhsd() {
		LocalDate today = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
//		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
//	String st = sp.format(today);
//		if(this.getHsd().compareTo(today)<0){
//			System.out.println("Hom nay la ngay "+ st + "Hang hoa da het han su dung!!");
//		}else {
//			System.out.println("Hom nay la ngay "+ st + " Hang hoa da het han su dung!! ");
//		}
		return hsd.isBefore(today);
	}


	/* tra ve to string */
	@Override
	public String toString() {
		/* bien doi tien te VN */
		Locale localeVN= new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String str = numberFormat.format(dongia);
//		/* dd/MM/yyyy */
//		SimpleDateFormat  SimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		String str1 = SimpleDateFormat.format(nsx);
//		String str2 = SimpleDateFormat.format(hsd);
//		
		String ghichu = checkhsd()? " Da het han" : " ";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s|%20s|%15.2f|%20s|%20s|%20s", mahang, tenHang, dongia, dtf.format(nsx), dtf.format(hsd),ghichu);
		
//		return "Thucpham1 [mahang=" + mahang + ", tenHang=" + tenHang + ", dongia=" + dongia + ", nsx=" + nsx + ", hsd="
//				+ hsd +  ghichu +"]";
	} 
	
	
	
	
	
}