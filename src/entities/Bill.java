package entities;

public class Bill {
	
	public  static double KAIZER = 5.00;
	public  static double MAN = 10.00;
	public  static double WOMAN = 8.00;
	public static double KEBAB = 7.00;
	public static double SOFTBEVERAGE = 3.00;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public Bill() {
	}

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}
	
	public  double feeding() {
		return ((KAIZER * beer) + (SOFTBEVERAGE * softDrink) + (KEBAB * barbecue));
	}
	
	public double cover() {
		if(feeding() < 30) {
			return 4;
		}
		else {
			return 0;
		}
	}
	
	public double ticket() {
		if(gender == 'F' || gender == 'f') {
			return WOMAN;
		}
		else {
			return MAN;
		}
	}
		
		public  double total() {
			double soma = feeding() + cover() + ticket();
			return soma;
		}

		@Override
		public String toString() {
			return "Valor a pagar = R$"	+ String.format(" %.2f \n", total());
		}
		
	}	
	

