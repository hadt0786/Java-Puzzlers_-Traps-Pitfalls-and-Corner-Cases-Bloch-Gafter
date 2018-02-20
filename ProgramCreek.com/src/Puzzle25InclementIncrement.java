
public class Puzzle25InclementIncrement {
				
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++) {
		j = j++;
		System.out.println(j);//prints 0
		
		
		//
		
		int tmp = j;
		
		
		j = j + 1;
		j = tmp;
		
		System.out.println(j); //prints j 99 time 
	
		}
	
		for (int i = 0; i < 100; i++)
			j++;
		System.out.println(j);
		/*
		Do not assign to the same variable
		more than once in a single expression*/
		
		
	}
	
}
