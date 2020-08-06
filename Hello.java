package xxx;

import java.util.*;

public class HelloEclipse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = "[A-Z][12][0-9]{12}";
		while(true) {
			String id = sc.next();
			if(id.matches(regex)) {
				System.out.println(":)");
			}else {
				System.out.println(":(");
			}
		}
	}
}