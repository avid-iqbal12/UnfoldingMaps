package javatuts;

public class Magic {
	public static void main(String[] args){
		int [][] rat = new int[3][];
		rat[0] = new int [2];
		rat[1] = new int [5];
		rat[2] = new int [3];
		
		for(int row=0;row<=2;row++){
			switch(row){
				case 0: for(int j=0;j<=1;j++)
					rat[row][j] = 5+j;
				break;
				case 1: for(int j=0;j<=4;j++)
					rat[row][j] = 50+j;
				break;
				case 2: for(int j=0;j<=2;j++)
					rat[row][j] = 100+j;
				
			}	
		}
		
		for(int row=0;row<=2;row++){
			switch(row){
			case 0: for(int j=0;j<=1;j++)
					System.out.print(rat[row][j]+"\t" ) ;
				System.out.print("\n");
				break;
			case 1: for(int j=0;j<=4;j++)
					System.out.print(rat[row][j]+"\t" ) ;
				System.out.print("\n");
				break;
			case 2: for(int j=0;j<=2;j++)
					System.out.print(rat[row][j]+"\t" ) ;
				System.out.print("\n");
				break;
			}
		}	
	}
}
