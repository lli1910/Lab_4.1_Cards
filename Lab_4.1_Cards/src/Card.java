//Lily Li
//March 14, 2018
public class Card {
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}

	String rank;
	String suit;
	int pointValue;
	
	//constructor
	public Card (String rank, String suit, int pointValue) {
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public boolean equal(Card otherCard) {
		if( this.pointValue == otherCard.getPointValue()) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "This special card is a " + this.rank + 
				" of " + this.suit + " with the value of " + pointValue; 
	}
}
