import java.io.PrintStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class EingabeTest {

	public static void main(String[] args) throws FileNotFoundException{
		
		 
		File jaws = new File("input.txt");
		Scanner sc = new Scanner(jaws);
		PrintStream ps = new PrintStream(System.out);
		
		
		int result = Eingabe.filter(sc, ps, "one", "four", "new");
		ps.println(result);
	}

}
