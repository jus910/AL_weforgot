import java.util.ArrayList;

public class ALTester{
	ArrayList<Integer> kevin = new ArrayList<Integer>();
	public ALTester(){
		for(int i=0; i<23;i++){
			kevin.add((int) (Math.random()*10));
			}
	}
	
	
	public static void main(String[] args){
		ALTester jonathan = new ALTester();
		System.out.println(jonathan.kevin);
	} 
}
