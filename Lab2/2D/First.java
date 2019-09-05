public class First{
	public static void main(String args[]){

		Time t = new Time(23, 5, 6);
		System.out.println(t.ToUniversal());
		System.out.println(t.ToStandart());
		Time t2 = new Time(4, 24, 33);
		t.TAdd(t2);

		


	}
}