public class Waiter {
	int proverka;

	public String takeOrder(String x) {

		if (x.equals("New York")) {
			return "� �������� � ������ " + x + ". � � �������.";
		}
		if (x.equals("San Francisco")) {
			return "� �������� � ������ " + x + ". � � ������";
		} else {
			return "� �� ������� � ���� ������ � �� ���� ��������� �����";
		}
	}

	public String lokal(String x) {

		if (x.equals("Manhattan")) {
			proverka = 1;
			return "����� ������ " + x + "���� �����";
		}
		if (x.equals("New Jersey")) {
			proverka = 2;
			return "����� ������ ����� " + x + ".";
		}
		if (x.equals("San Francisco")) {
			proverka = 3;
			return "����� ������ ����� " + x + ".";

		} else {
			return "� �� ������� � ���� ������";
		}

	}

	public String performOrder() {
		return "Yes";
	}

}