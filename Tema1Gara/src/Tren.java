import java.sql.Time;

public class Tren {
	
	private Time plecare;
	private String destinatie;
	private String nume;
	
	public Tren(String num, String dest, int ora, int min) {
		plecare = new Time(ora, min, 0);
		destinatie = new String (dest);
		nume = new String (num);
	}
	
	public String print() {
		return nume + " " + destinatie + " " + Integer.toString(plecare.getHours()) + ":" +  Integer.toString(plecare.getMinutes());
	}
	
	public int getTime() {
		int ttime = plecare.getHours()*60 + plecare.getMinutes();
		return ttime;
	}
	
	public String getName() {
		return nume;
	}
}
