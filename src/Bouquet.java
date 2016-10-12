import java.util.ArrayList;

public class Bouquet extends Pavilion {
	private ArrayList<Flower> bouquet;
	private int bouquetPrice = 0;
	private int bouquetSize = 0;
	private boolean bouquetIsFresh;


	public void BouquetPrice(int bouquetPrice){
		this.bouquetPrice = bouquetPrice;
	}
	
	public int getBouquetPrice(){
		return bouquetPrice;
	}
	
	public void BouquetSize(int bouquetSize){
		this.bouquetSize = bouquetSize;
	}

	public int getBouquetSize(){
		return bouquetSize;
	}
		
	public void BouquetFreshness(boolean bouquetIsFresh){
		this.bouquetIsFresh = bouquetIsFresh;
	}
	
	public boolean getBouquetFreshness(){
		return bouquetIsFresh;
	}
}

