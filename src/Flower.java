
public class Flower extends Bouquet {
	public static void main(String[] args) {
		Flower flower1 = new flowerOne(3, true);
		Flower flower2 = new flowerOne(5, true);
		Flower flower3 = new flowerOne(4, false);
		Flower flower4 = new flowerTwo(1, true);
		Bouquet bouquet1 = new Bouquet();
		bouquet1.add(flower1);
		bouquet1.add(flower2);
		bouquet1.add(flower3);
		bouquet1.add(flower4);
		System.out.println(bouquet1.Price());

	}

	public double price;
	public double stemLength;
	public boolean isFresh;
	
	public void Price(int price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}

	public void Freshness(boolean isFresh){
		this.isFresh = isFresh;
	}
	
	public boolean getFreshness(){
		return isFresh;
	}

	public void StemLength(double stemLength){
		this.stemLength = stemLength;
	}

	public double getStemLength(){
		return stemLength;
	}

	public boolean isFresh() {
		return isFresh;
	}
}
