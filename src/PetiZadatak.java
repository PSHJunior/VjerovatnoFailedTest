import java.util.Scanner;

public class PetiZadatak {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite rijec");
		String korisnik = unos.next();
		while(korisnik.charAt(0)!='k'  && korisnik.charAt(1)!='r'  && korisnik.charAt(2)!='a'  && korisnik.charAt(3)!='j') {
			System.out.println("Unesite jos jednu rijeci");
			String korisnik2=unos.next();
			korisnik.concat(korisnik2);
		}
		System.out.println(korisnik);
		

	}

}
