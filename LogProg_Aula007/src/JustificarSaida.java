
public class JustificarSaida {
	public static void main (String[] args) {
		int a = 1, b = 2, c = 3;
		if (a-- == 0) {
		c++;
		}
		else {
		c--;
		}
		System.out.println(a + " " + b + " " + c);
		
		// SA�DA = 1 3 4
	}
}