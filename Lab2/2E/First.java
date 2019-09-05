public class First{


		


	public static void main(String args[]){

		
		int arr[] = {1, 2, 3};
		
		int repeate = 3;
		int[] newArr = new int[arr.length*repeate];

		
		ARR a = new ARR();

		a.Mehodd(arr, newArr, repeate);


		for(int i=0; i < newArr.length; i++){
			System.out.println(newArr[i]);
		}

		

	}


}