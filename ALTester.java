import java.util.ArrayList;

public class ALTester{
	ArrayList<Integer> array = new ArrayList<Integer>();

	public ALTester(){
		for(int i=0; i<23;i++){
			array.add((int) (Math.random()*10));
		}
	}
	
	public boolean isSorted() {
		for (int i = 1; i < 23; i++) {
			if (!(array.get(i - 1) < array.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		ALTester jonathan = new ALTester();
		System.out.println(jonathan.array);
		System.out.println(jonathan.isSorted());
		
		ALTester isSorted = new ALTester();
		for (int i = 0; i < 23; i++){
			isSorted.array.set(i, i);
		}
		System.out.println(isSorted.array);
		System.out.println(isSorted.isSorted());
		
		ALTester isNotSorted = new ALTester();
		for (int i = 0; i < 23; i++){
			isNotSorted.array.add(i);
		}
		System.out.println(isNotSorted.array);
		System.out.println(isNotSorted.isSorted());
	} 
}
