
public class Demo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("This skipped the 5 as continue keyword is executed.");
	}

}
