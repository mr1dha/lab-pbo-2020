class Game {
	public static void main(String[] args) {

		Hero hero1 = new Hero("Patimura", 20);
		Hero hero2 = new Hero("Teuku Umar", 30);

		hero1.serang(hero2);

		hero2.serang(hero1); // 70
		hero2.serang(hero1); // 40
		hero2.serang(hero1); // 10

		hero1.healing(); // 20
		hero1.healing(); // 30

		hero2.serang(hero1); // 0

	}
}