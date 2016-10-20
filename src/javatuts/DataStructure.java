package javatuts;

// inner class example
public class DataStructure {
	//create an array
	private static final int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	
	public 	DataStructure(){
		// fill an array with ascending integer values
		for (int i=0; i<SIZE; i++){
			arrayOfInts[i] = i;
		}
	}
	
	public void printEven(){
		//print out values of even indices of the array
		DataStructureIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer>{}
	
	//Inner class implements the DataStructureIterator interface,
	//which extends the Iterator<Integer> interface
	
	private class EvenIterator implements DataStructureIterator {
		//start stepping through the array from the beginning 
		private int nextIndex = 0;
		
		public boolean hasNext(){
			//check if the current element is the last in the array
			return (nextIndex <= SIZE-1);
		}
		
		public Integer next(){
			//Record the value of an even index of the array
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			
			//Get the next even element
			nextIndex += 2;
			return retValue;
		}
		
	}
		
	public static void main(String s[]){
		//Fill the array with integer values and print out only
		// values of even indices
		DataStructure ds = new DataStructure();
		ds.printEven();
		}
}

