public class Data{
	private int n;
	private double max = -999999.0;
	private double average = 0;
	private double cnt = 0;
	private double elements = 0;

	public Data(){};

	public void SetValue(int n){
		this.n = n;
		this.cnt+= this.n;
		this.elements++;
		if(this.n>this.max) this.max = this.n;
		this.average = cnt / elements;
	}

	public double GetMax(){
		
		return this.max;
	}

	public double GetAverage(){
			return this.average;
		}

}