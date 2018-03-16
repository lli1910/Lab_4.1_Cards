import java.util.ArrayList;
import java.util.Random;

//Lily Li
public class DeckOfCards {
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	public DeckOfCards (String[] rank, String[] suit, int[] pointValue) {
		this.Dealt = new ArrayList<Card>();
		this.unDealt = new ArrayList<Card>();
		
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < suit.length; j++) {
				unDealt.add(new Card(rank[i], suit[j], pointValue[i]));
			}
		}
	}
	
	public boolean isEmpty(DeckOfCards deck) {
		if(deck.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return unDealt.size();
	}
	
	//deal card and remove deal card from undealt to dealt
	public Card deal() { 
		if(unDealt.size() == 0) {
			return null;
		}
	
		Dealt.add(unDealt.remove(0));
		
		return unDealt.remove(0);
	}
	
	public void shuffle() {
		//use get and set
		Card temp = unDealt.get(0);
		unDealt.set(0,temp);
		
	}
	
	//random number generator attained from https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
	public static int randInt(int min, int max) {
		 Random rand = null;
		
		 int randomNum = rand.nextInt((max - min) + 1) + min;
		
		 return randomNum;
	}
	
}
