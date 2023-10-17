package test;
import java.util.ArrayList;
import java.util.Random;
public class Example2ArrayList {

	final private static String ERR_USAGE = "Usage: <seed> <num>";
	
	public static Integer smallest(ArrayList<Integer> a) {
		if (a.isEmpty()) return null;
		
		int smallest = a.get(0);
		for (int v : a) {
			if (v < smallest) {
				smallest = v;
			}
		}
		
		return smallest;
	}	
	
	public static void main(String[] args) {
		try {
			
			final int seed = Integer.parseInt(args[0]);
			final int num = Integer.parseInt(args[1]);
			final Random random = new Random(seed);
			final ArrayList<Integer> list = new ArrayList<>(num);
			
			for (int i=0; i<num; i++) {
				list.add(random.nextInt(100)+1);
			}
			System.out.printf("%s%nSmallest: %d%n", list, smallest(list));
			
		} catch (Exception e) {
			System.out.printf("%s%n", ERR_USAGE);
		}
		
	}

}
