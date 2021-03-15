package problema3.poo;

import problema3.cuerpoceleste;
import problema3.ubicacion;

public class Myapp {
	
	static void run() {
		System.out.println(new cuerpoceleste("Planeta1", new ubicacion(100.32f, 301.80f,"noviembre", 400.00f), "solidos"));
	}

	public static void main(String[] args) {
		
		run();

	}

}
