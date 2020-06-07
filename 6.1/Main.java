package ex_6_1;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(new Date(System.currentTimeMillis()));
		int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);

		MensagemDoDia mensagem = null;
		switch (diaSemana) {
			case Calendar.SUNDAY:
				mensagem = new MensagemDomingo();
				break;
			case Calendar.MONDAY:
				mensagem = new MensagemSegunda();
				break;
			case Calendar.TUESDAY:
				mensagem = new MensagemTerca();
				break;
			case Calendar.WEDNESDAY:
				mensagem = new MensagemQuarta();
				break;
			case Calendar.THURSDAY:
				mensagem = new MensagemQuinta();
				break;
			case Calendar.FRIDAY:
				mensagem = new MensagemSexta();
				break;
			case Calendar.SATURDAY:
				mensagem = new MensagemSabado();
				break;
			default:
				Systen.out.println("Nao foi possivel encontrar o dia da semana");
				break;
		}

		mensagem.imprimir();
	}
}
