public class Gravitacija {
	public static void main(String[] args) {
		System.out.println("OIS je zakon!");
	}
	
	public static double gravitacijskiPospesek(double nadmorskaVisina) {
		//vrne pospesek po formuli a = G * M / (Rz + h)^2
		return 6.674e-11d * 5.972e24d / ((6.371e6 + nadmorskaVisina)*(6.371e6 + nadmorskaVisina));
	}
}