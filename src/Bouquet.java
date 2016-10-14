public class Bouquet {
	private int max = 7;
	private Flower[] flower = new Flower[max];
	public int last = 0;

	public double Price(){
		double Price = 0;
		for (int i = 0; i < flower.length; i++) {
			if (flower[i] != null) {
				Price += flower[i].getPrice();
			}

		}
		return Price;
	}

	public void add(Flower n) {
		if (last > max - 1) {
			Flower[] newFlower = new Flower[max * 2];
			for (int i = 0; i < max; i++) {
				newFlower[i] = flower[i];
			}
			max *= 2;
			flower = newFlower;
		}
		flower[last] = n;
		last++;

	}
}

