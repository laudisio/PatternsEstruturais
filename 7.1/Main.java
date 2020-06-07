package ex_7_1;

public class Main {
	// M�todo principal
	public static void main(String[] args) throws Exception {
		// Manipula de v�rias formas.
		ManipuladorAbstrato manipulador;

		System.out.println("    Transforma em maiusculo    ");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("    Transforma em minusculo    ");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("Duplica");
		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("    Inverte    ");
		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}