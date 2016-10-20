package javatuts;

public class Wilsford {
	public static void main(String[] args){
		int [] pack = new int [52];		//original pack
		int [] shpack = new int [52];	//pack after shuffling
		int k,j;
		for(k=0;k<52;k++) 				//setup cards by number(1-52)
			pack[k]=k+1;
		
	//shuffle	
		for(k=0;k<52;k++){
			int drawn_card = (int) (Math.random()*(52-k));	//choose at random
			shpack[k] = pack[drawn_card];	//add chosen card to shuffled
			pack[drawn_card]=pack[52-k-1];	//move last card up to fill gap 
		}
		
	//deal
		int [][] deal = new int[4][];	//4 hands of cards
		int nc = 0;						
		for(k=0;k<3;k++)				// Set up 3 subarrays of 5 ...
			deal[k] = new int[5];
		for(j=0;j<5;j++){				// and populate them
			for(k=0;k<3;k++)
				deal[k][j] = shpack[nc++];
		}
		deal[3] = new int[37];			// and 1 subarray of 37(52-15) ...		
		for(k=0;k<37;k++)				// and populate it
			deal[3][k] = shpack[nc++];
	
	//list out hands
		for(k=0;k<4;k++){
			System.out.println("Contents of hand number " + (k+1) + ": ");
			for(j=0;j<deal[k].length;j++){		// each a different length
				System.out.print(" " + deal[k][j]);
			}
			System.out.println(" ");
		}
	}
}