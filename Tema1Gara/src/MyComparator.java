import java.util.Comparator;

public class MyComparator implements Comparator<Tren>{
	
	@Override
	public int compare(Tren t1, Tren t2) {
		return t1.getTime() - t2.getTime();
	}
}
