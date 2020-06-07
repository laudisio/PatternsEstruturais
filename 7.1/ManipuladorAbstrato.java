package ex_7_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class ManipuladorAbstrato {
	public final void manipularString() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite uma palavra: ");
		String string = reader.readLine();

		System.out.println("Transformado: " + transformarString(string));
	}

	protected abstract String transformarString(String string);
}
