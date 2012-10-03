public class Waiter {
	int proverka;

	public String takeOrder(String x) {

		if (x.equals("New York")) {
			return "Я нахожусь в городе " + x + ". Я в костюме.";
		}
		if (x.equals("San Francisco")) {
			return "Я нахожусь в городе " + x + ". Я в шортах";
		} else {
			return "Я не работаю в этом городе и не могу выполнить заказ";
		}
	}

	public String lokal(String x) {

		if (x.equals("Manhattan")) {
			proverka = 1;
			return "Здесь подают " + x + "скую пиццу";
		}
		if (x.equals("New Jersey")) {
			proverka = 2;
			return "Здесь подают пиццу " + x + ".";
		}
		if (x.equals("San Francisco")) {
			proverka = 3;
			return "Здесь подают пиццу " + x + ".";

		} else {
			return "Я не работаю в этом районе";
		}

	}

	public String performOrder() {
		return "Yes";
	}

}