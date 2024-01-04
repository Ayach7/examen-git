package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
		System.out.println(Calculatrice.add(5, 5));

		int resultatAutreAddition = Calculatrice.add(10, 20);
        System.out.println("Autre résultat d'addition : " + resultatAutreAddition);
	}
}
