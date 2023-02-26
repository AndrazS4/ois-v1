import java.util.*;
public class Gravitacija {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		izpis(n);
	}
	
public static void izpis(double nadmorskaVisina) {
	System.out.println(gravitacijskiPospesek(nadmorskaVisina));
}
	
	public static double gravitacijskiPospesek(double nadmorskaVisina) {
		//vrne pospesek po formuli a = G * M / (Rz + h)^2
		return 6.674e-11d * 5.972e24d / ((6.371e6d + nadmorskaVisina)*(6.371e6d + nadmorskaVisina));
	}
}