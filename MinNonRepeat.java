import java.util.Scanner;

class MinNonRepeat{
	public static void main(String[]args){
		
			int flag = 0,cntr = 0,lowest = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements of array:- ");
			
			int noe = sc.nextInt();
			int [] arr = new int[noe];
			int [] arr1 = new int[1];
            int flag1  = 0;
			
			System.out.println("Enter the elements of the array:- ");
			
			
			for(int i = 0;i<noe;i++){
				arr[i] =sc.nextInt();
			}
			
			for(int i = 0; i < noe; i++){
					for(int j = 0; j < i; j++){
						if(i != j){
							if(arr[i] != arr[j]){
								flag = 1;
							}
							else{
								flag = 0;
									break;
							}
						}
					}
					if(flag == 1){
						System.out.println(" unique element:- "+arr[i]+" ");
						
						if(lowest == 0){
                        	lowest = arr[i];
                        }						
						
						if(lowest !=0 && lowest > arr[i]){
							lowest = arr[i];
						}
						if(flag1 !=0  ) {
						arr1 = increaseSizeOfArray(arr1);	
						arr1[arr1.length-1] = arr[i];
						}
						else {
						arr1[arr1.length-1] = arr[i];
						}
						flag1 = 1;
					}
				}
				System.out.println("Lowest unique element = "+lowest);

				/*for(int x = 0; x < arr1.length; x++){
					System.out.println(x+"arr1[x] = "+arr1[x]);
				}*/
				
	}//end of main	
	
	static int[]increaseSizeOfArray(int[]arr1){
		int[]arr2 = new int[(arr1.length+1)];
		
		for(int i = 0;i<arr1.length;i++){
			arr2[i] = arr1[i];
		}				
		return arr2;
	}
}//end of class