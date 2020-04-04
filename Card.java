package RandomExercises;

import java.util.ArrayList;

public class Card {

	private final String suit;
	private final String rank;
	
	//constructor:
	public Card(String suit, String rank) {
		
		this.suit=suit;
		this.rank=rank;
	}
	
	public String getSuit(){
		return suit;
	}
	
	public String getRank() {
		return rank;
	}
	
	public int getValue() {
	
        switch (rank) {
        case "Ace":  return 1;
            
        case "Two":  return 2;
             
        case "Three":  return 3;
              
        case "Four":  return 4;
                 
        case "Five":  return 5;
                
        case "Six":  return 6;
                
        case "Seven":  return 7;
                 
        case "Eight":  return 8;
                 
        case "Nine":  return 9;
                 
        case "Ten": return 10;
                 
        case "Jack": return 11;
                 
        case "Queen": return 12;
        
        case "King": return 13;
        
        default: return 0;
    }
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
	
}
