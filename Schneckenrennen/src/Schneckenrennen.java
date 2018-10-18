
public class Schneckenrennen {

	public static void main(String[] args) {
		
		Rennschnecke Schneggrich1 = new Rennschnecke("Schneggberd", "Glitscho",90);
		Rennschnecke Schneggrich2 = new Rennschnecke("Schneggberd2", "Ultimato", 6);
		Rennschnecke Schneggrich3 = new Rennschnecke("Schleima", "Nihaaa", 3331);
		Schneggrich1.krieche();
		System.out.println(Schneggrich1);
		Schneggrich2.krieche();
		System.out.println(Schneggrich2);
		Schneggrich3.krieche();
		System.out.println(Schneggrich3);
	
	}

}
