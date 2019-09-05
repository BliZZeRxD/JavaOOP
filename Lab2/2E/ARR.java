public class ARR{

	public void Mehodd(int[] arr, int[] newArr, int repeate){
		int cnt = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<repeate; j++){
				newArr[cnt] = arr[i];
				cnt++;
			}
		}
	}

}