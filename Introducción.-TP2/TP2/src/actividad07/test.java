package actividad07;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperHeroe s1 = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe s2 = new SuperHeroe("Superman", 95, 60, 70);

		System.out.println(s1.competir(s2));

		System.out.println(s2.competir(s1));

	}

}
