
public class ParallelArrayEx {

	public static void main(String[] args) {
		String[] names = {"Antonella", "Jonah", "Tim"};
		int [] jerseyNum = {34, 21, 13};
		
		for (int i = 0; i < names.length; ++i) {
			System.out.println("Name: " + names[i] + " JerseyNum: " + jerseyNum[i]);
		}
	}

}
