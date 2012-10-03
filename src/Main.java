public class Main {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();

		System.out.println(waiter.takeOrder("New York"));
		System.out.println(waiter.lokal("Manhattan"));

		if (waiter.proverka == 2) {

			PizzaNewJersey pizzaNewJersey = new PizzaNewJersey();
			System.out.print("ѕицца подаетс€ в ");
			System.out.println(pizzaNewJersey.container());
			System.out.print("≈е радиус ");
			System.out.println(pizzaNewJersey.radius());
			System.out.print("ќсновными ингридиетами в ней €вл€ютс€ ");
			System.out.println(pizzaNewJersey.stuffing());
		} else if (waiter.proverka == 1) {

			PizzaManhattan pizzaManhattan = new PizzaManhattan();
			System.out.print("ѕицца подаетс€ в ");
			System.out.println(pizzaManhattan.container());
			System.out.print("≈е радиус ");
			System.out.println(pizzaManhattan.radius());
			System.out.print("ќсновными ингридиетами в ней €вл€ютс€ ");
			System.out.println(pizzaManhattan.stuffing());
		} else if (waiter.proverka == 3) {

			PizzaSanFrancisco pizzaSanFrancisco = new PizzaSanFrancisco();
			System.out.print("ѕицца подаетс€ в ");
			System.out.println(pizzaSanFrancisco.container());
			System.out.print("≈е радиус ");
			System.out.println(pizzaSanFrancisco.radius());
			System.out.print("ќсновными ингридиетами в ней €вл€ютс€ ");
			System.out.println(pizzaSanFrancisco.stuffing());
		}
	}

}