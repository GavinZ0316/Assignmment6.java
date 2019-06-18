/****************************************************************************
 * Created by: Gavin Zhou
 * Created on: May 2018
 * Created for: assignment6
 * This program is game BlackJack'Card
 ****************************************************************************/
public class Card{

	private Color color;
	private Value value;

	public Card(Color suit, Value value){
		this.color = suit;
		this.value = value;
	}

	public String toString(){
		return this.color.toString() + "-" + this.value.toString();
	}

	public Value getValue(){
		return this.value;
	}
}
