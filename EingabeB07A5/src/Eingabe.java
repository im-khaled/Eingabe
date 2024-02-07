/**
  * @author mshujo2s
 */
import java.util.*;
import java.io.*;
public class Eingabe {
	public static int filter(Scanner sc,PrintStream ps, String start, String stop, String skip) {
		String ergib = "";
		
		while (sc.hasNext()) {
			String s = sc.next();
			ergib = ergib +" "+ s;
			
			if (s.equals(start)) {
				while (sc.hasNext()) {
				String j = sc.next();
				if(j.equals(stop)) {
				
					ergib = "";
					ergib = ergib + sc.next();
					continue;
				}
				
				}
			}
			
			
				if(s.equals(skip)) {
				
				ergib = ergib.substring(0, ergib.indexOf(skip));
				
				while (sc.hasNext()) {
					String d = sc.nextLine();
					d= "";
				 ergib = ergib + sc.next();
				}
			}
		
			
		}
		
		ps.println(ergib+" ");
		
		int count = 1;
		for (int i = 0; i<ergib.length()-1; i++ ) {
			
			if(ergib.charAt(i) == ' ' && ergib.charAt(i+1) != ' ') {
				 count++;
			}
		}
		return count;
	}
	
}
