
public class Flower extends Bouquet {
	private int price;
	private int length;
	private boolean isFresh;
	
	public void Price(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void Length(int length){
		this.length = length;
	}
	
	public int getLength(){
		return length;
	}
		
	public void Freshness(boolean isFresh){
		this.isFresh = isFresh;
	}
	
	public boolean getFreshness(){
		return isFresh;
	}
}
