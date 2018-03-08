import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Gara {

	List<Tren> trenuri;
	
	public Gara () {
		trenuri = new ArrayList<Tren>();
	}
	
	public void addTrain(String num, String dest, int ora, int min) {
		Tren t = new Tren(num, dest, ora, min);
		trenuri.add(t);
	}
	
	private void sortByTime() {
		Comparator<Tren> c = new MyComparator();
		trenuri.sort(c);
	}
	
	public void printTrains() {
		sortByTime();
		for (Tren t: trenuri) {
			System.out.println(t.print());
		}
	}


}
