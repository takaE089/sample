package exe_pack1_22;

import pack1_22.Japan;

public class Country {

	public static void main(String[] args) {
		Japan name = new Japan("日本");
		name.displayCountry();
		
		Japan food = new Japan("寿司", "和食");
		food.displayFood();
		
		Japan date = new Japan();
		date.displayDate();
	}

}