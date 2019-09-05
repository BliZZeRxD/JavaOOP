public class StarTriangle{
	public int width;
	//public String s = "";
	

	public StarTriangle(int width){
		this.width = width;
	}

	public String ToString(){
		

		String s = "";

		for(int i=1; i<=width; i++){
			for(int j=0; j<i; j++){
				s += ("[*]");
			}
			s += ("\n");
		}
		return s;
	}
}