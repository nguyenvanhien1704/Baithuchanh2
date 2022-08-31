import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static Thucpham1 htp() throws Exception {
		Scanner sc = new Scanner(System.in);
		String mahang = sc.nextLine();
		sc = new Scanner(System.in);
		String tenhang = sc.nextLine();
		sc = new Scanner(System.in);
		double  dongia = sc.nextDouble();
		sc = new Scanner(System.in);
		String nsx = sc.nextLine();
		String hsd = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return new Thucpham1(mahang, tenhang, dongia, LocalDate.parse(nsx,formatter),LocalDate.parse(hsd,formatter) );
		
	}

	public static void main(String[] args) {
		try {
//			Thucpham1 tp1,tp2,tp3;
			Thucpham1 tp1 = htp();
			Thucpham1 tp2 =htp();
			Thucpham1 tp3 = htp();
			System.out.println(tp1.toString());
			System.out.println(tp2.toString());
			System.out.println(tp3.toString());
			if(tp1.checkhsd()== true ) {
				System.out.println("het han su dung !");
			}else {
				System.out.println(" Con han su dung");
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
		
	

	}

}
