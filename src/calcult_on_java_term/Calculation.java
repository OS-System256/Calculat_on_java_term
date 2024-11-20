package calcult_on_java_term;

public class Calculation {
	public static float result;
	
	public static void calcult() {
		if (Interfaces_user.int_user_answer == 1) {
			Calculation.result = Interfaces_user.number1 - Interfaces_user.number2;
		}
		if (Interfaces_user.int_user_answer == 2) {
			Calculation.result = Interfaces_user.number1 / Interfaces_user.number2;
		}
		if (Interfaces_user.int_user_answer == 3) {
			Calculation.result = Interfaces_user.number1 % Interfaces_user.number2;
		}
		if (Interfaces_user.int_user_answer == 4) {
			Calculation.result = Interfaces_user.number1 + Interfaces_user.number2;
		}
		if (Interfaces_user.int_user_answer == 5) {
			Calculation.result = Interfaces_user.number1 * Interfaces_user.number2;
		}
		if (Interfaces_user.int_user_answer < 1 & Interfaces_user.int_user_answer > 5) {
			Interfaces_user.error = "данная операция не найдена";
			Interfaces_user.answer_error();
		}
		Interfaces_user.number1 = Calculation.result;
	}
}
