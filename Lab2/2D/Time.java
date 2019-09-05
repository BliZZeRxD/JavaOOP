import java.util.*;

public class Time{
	public int hour;
	public int minut;
	public int second;

	public Time(int hour, int minut, int second){
		this.hour = hour%24;
		this.minut = minut % 60;
		this.second = second % 60;
	}

	public String ToUniversal(){
		String sminut = ""; 
		String shour = "";
		String ssecond = "";
		if(this.minut<10) sminut = "0" + this.minut;
		else sminut = this.minut + "";

		if(this.hour<10) shour = "0" + this.hour;
		else shour = this.hour + "";

		if(this.second<10) ssecond = "0" + this.second;
		else ssecond = this.second + "";

		return (shour + ":" + sminut + ":" + ssecond);
	}


	public String ToStandart(){

		String s = "";
		String m = "";

		if(this.hour==0){
			s = "12";
			m = "PM";
		}else if(this.hour>=1 && this.hour<=12){
			s = this.hour + "";
			m = "AM";
		}else {
			s = this.hour % 12 + "";
			m = "PM";
		}


		String sminut = ""; 
		String shour = "";
		String ssecond = "";
		if(this.minut<10) sminut = "0" + this.minut;
		else sminut = this.minut + "";

		if(this.hour<10) shour = "0" + this.hour;
		else shour = this.hour + "";

		if(this.second<10) ssecond = "0" + this.second;
		else ssecond = this.second + "";


		return s + ":" + sminut + ":" + ssecond + m;

	}

	public void TAdd(Time t2){
		int res = this.hour *3600 + this.minut * 60 + this.second + t2.hour *3600 + t2.minut * 60 + t2.second ;
		res = res % 86400;
		this.hour = res / 3600;
		this.minut = (res % 3600)/60;
		this.second = res % 60;

	}
}