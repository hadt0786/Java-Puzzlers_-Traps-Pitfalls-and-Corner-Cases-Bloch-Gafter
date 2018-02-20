
public class Puzzle11 {

	public Puzzle11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//wrong conception
		
		System.out.println("H" + "a");//string concatenation.
		System.out.println('H' + 'a');//wrong outprut widening primitive conversion
		
		StringBuffer sb = new StringBuffer();
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
		
		System.out.println("2 + 2 = " + 2+2);//error
		
		System.out.printf("%c%c", 'H', 'a',"\n");
		System.out.println();
		System.out.print("" + 'H'+'a');

	}

}
