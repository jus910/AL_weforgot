import java.util.ArrayList;

public class ALTester{
	ArrayList<Integer> kevin = new ArrayList<Integer>();

	public ALTester(){
		for(int i=0; i<23;i++){
			kevin.add((int) (Math.random()*10));
		}
	}
	
	public boolean isSorted() {
		for (int i = 1; i < 23; i++) {
			if (!(kevin.get(i - 1) < kevin.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		ALTester jonathan = new ALTester();
		System.out.println(jonathan.kevin);
		System.out.println(jonathan.isSorted());
		
		ALTester isSorted = new ALTester();
		for (int i = 0; i < 23; i++){
			isSorted.kevin.set(i, i);
		}
		System.out.println(isSorted.kevin);
		System.out.println(isSorted.isSorted());
		
		ALTester isNotSorted = new ALTester();
		for (int i = 0; i < 23; i++){
			isNotSorted.kevin.add(i);
		}
		System.out.println(isNotSorted.kevin);
		System.out.println(isNotSorted.isSorted());
	} 
}
