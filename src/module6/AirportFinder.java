package module6;

import demos.Airport;

// Author: Faisal I. 

public class AirportFinder {
	// to find a city name using linear search
	public static String findAirportCode(String toFind, Airport[] airports){
		int index = 0;	
		while (index < airports.length){
			Airport curr = airports[index]; 
			if (toFind.equals(curr.getCity())){
				return curr.getCode3();
			}
			index++;			
		}
		return null;
		
	}
	
	//to find a city name using Binary search
	public static String findAirportCodeBS(String toFind, Airport[] airports){
		int low = 0; // initialize low = 0 ; high = size of list - 1 
		int high = airports.length - 1;
		int mid;
		while(high>low){ // while the
			mid = low + ((high-low)/ 2); // sophisticated developers write it like this 
			int compare = toFind.compareTo(airports[mid].getCity());//if city toFind equals city at mid,
			if (compare < 0){  //if the city is alphabetically less than city at mid 
				high = mid - 1; // high = mid - 1 
			}
			else if (compare > 0){
				low = mid + 1; // else low = mid + 1
			}
			else return airports[mid].getCode3(); // return 3-digit airport code
		}
		return null; // return a value to indicate not found
	}
}
