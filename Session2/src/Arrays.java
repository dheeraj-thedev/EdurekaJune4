
public class Arrays {

	public static void main(String[] args) {
		
		int arizonaDemVoteCount = 126; // pushed
		int arizonaRepVoteCount = 152; // pushed
		
		int floridaDemVoteCount = 32;
		int floridaRepVoteCount = 85;
		
		int demVoteCount = arizonaDemVoteCount + floridaDemVoteCount; // + .. + ...
		int repVoteCount = arizonaRepVoteCount + floridaRepVoteCount; // + .. + ...
		
		// Multi Value Container
		int[] demVotes = {126,32,230,21,200}; //Size: ( 5elements * 4bytes each = 20 bytes for an array)
		int[] repVotes = {152,85,121,215,13};
		
		System.out.println("arizonaDemVoteCount is: "+arizonaDemVoteCount); // 126
		System.out.println("arizonaRepVoteCount is: "+arizonaRepVoteCount); // 152
		
		// demoVotes and repVotes are the reference variables, pointing to the array
		System.out.println("demVotes is: "+demVotes+" | "+demVotes.length);
		System.out.println("repVotes is: "+repVotes+" | "+repVotes.length);
		
		System.out.println("demVotes is: "+demVotes[0]+" "+demVotes[1]);
		System.out.println("repVotes is: "+repVotes[0]+" "+repVotes[1]);
		
		int demSum=0,repSum=0;
		
		for(int i=0;i<demVotes.length;i++){
			demSum = demSum + demVotes[i];
			System.out.print(demVotes[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<repVotes.length;i++){
			repSum = repSum + repVotes[i];
			System.out.print(repVotes[i]+" ");
		}
		
		System.out.println("demSum is: "+demSum);
		System.out.println("repSum is: "+repSum);
		
		if(demSum > repSum){
			System.out.println("Democratic Party Wins !! by "+(demSum-repSum)+" votes");
		}else{
			System.out.println("Republic Party Wins !!");
		}
		
		int[] a1 = {10,20,30,40,50}; 		 // Implicit - Compiler will compile it as int[] a1 = new int[]{10,20,30,40,50};
		int[] a2 = new int[]{10,20,30,40,50}; // Explicit
		// new is an operator which will create the array at run time in the heap area.
		// a1 and a2 are the reference variables which will hold the address of array
		
		int[] a3 = a1; // Reference Copy | a1 and a3 will point to same array
		
		int[] a4 = {10,20,30,40,50};
		System.out.println("a4[10] is: "+a4[10]); // error at run time
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		System.out.println("a3 is: "+a3);
		System.out.println("a4 is: "+a4);
		
		a3[1] = 100;
		
		System.out.println(a3[1]);
		System.out.println(a1[1]);
		
		int[] a5 = new int[5]; // mention size instead of elements (data)
		System.out.println("a5 is: "+a5);
		a5[3] = 545;
		for(int i=0;i<a5.length;i++){
			System.out.print(a5[i]+" | ");
		}
		
		// Syntatical Difference
		int [] arr1, arr2, arr3;
		arr1 = new int[5];
		arr2 = new int[10];
		arr3 = new int[20];
		
		int arr4[], arr5[];
		arr4 = new int[10];
		arr5 = new int[20];
		
		System.out.println();
		
		// Enhanced For Loop | Reading the data
		for(int anyVarName : a4){
			System.out.print(anyVarName+" , ");
		}
		
		System.out.println();
		
		int[] demVotes1 = {126,32,230,21,200,100,456,789,1234,12}; 
		int[] repVotes1 = {152,85,121,215,13,345,123,466,1345,11};
		
		System.out.println("demVotes1 size is: "+demVotes1.length);
		System.out.println("repVotes1 size is: "+repVotes1.length);
		
		// Multi-Dimension Array | 2D
		// votes is a reference variable which is pointing to an array of arrays
		int[][] votes = {
							{126,32,230,21,200,100,456,789,1234,12}, // 0
							{152,85,121,215,13,345,123,466,1345,11}  // 1
						};
		System.out.println("votes is: "+votes);
		System.out.println("votes[0] is: "+votes[0]);
		System.out.println("votes[1] is: "+votes[1]);
		
		
		System.out.println("votes size is: "+votes.length);
		System.out.println("votes[0] size is: "+votes[0].length);
		System.out.println("votes[1] size is: "+votes[1].length);
		
		System.out.println("votes[0][1] element is: "+votes[0][1]); // 32
		System.out.println("votes[1][1] element is: "+votes[1][1]); // 85
		
		for(int i=0;i<votes.length;i++){ // run 2 times | 0 and 1
			for(int j=0;j<votes[i].length;j++){ // votes[0].length = 10, votes[1].length = 10
				System.out.print(votes[i][j]+"  ");
			}
			System.out.println();
		}
		
		// Array of Array of Arrays -> 3-D
		int[][][] moreVotes = {
								{
									{126,32,230,21,200,100,456,789,1234,12}, // 0
									{152,85,121,215,13,345,123,466,1345,11}  // 1
								},
								{
									{126,32,230,21,200,100,456,789,1234,12}, // 0
									{152,85,121,215,13,345,123,466,1345,11}  // 1
								}
							};
		
		// n Dimensional array is a collection of n-1 Dimensional Arrays
		
		int[][] arr = new int[5][5]; // 5 one d arrays with 5 elements each
	}

}
