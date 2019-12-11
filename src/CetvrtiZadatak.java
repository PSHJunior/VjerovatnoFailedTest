import java.util.Scanner;

public class CetvrtiZadatak {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string");
		String korisnik = unos.next();
		int broj = 0;
		int broj2= 0;
		int j =0;
		for (int i = korisnik.length() ; i > korisnik.length() ;i--) {
			if (korisnik.charAt(i)== ' ') {
				break;
			}
			else {
				broj++;
			}
		}
			for (int i = korisnik.length()-broj ; i > korisnik.length()-broj ;i--) {
				if (korisnik.charAt(i)== ' ') {
					j=i;
					break;
				}
				else {
					broj2++;
				}
			
		}
			for (int i = j; i < korisnik.length()-broj; i++) {
				System.out.print(korisnik.charAt(i));
			}

	}

}
