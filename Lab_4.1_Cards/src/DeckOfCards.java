import java.util.ArrayList;

//Lily Li
public class DeckOfCards {
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	public DeckOfCards (String[] rank, String[] suit, int[] pointValue) {
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
		
	}
	
	public Card deal() {
		
	}
	
	public void shuffle() {
		
	}
}
