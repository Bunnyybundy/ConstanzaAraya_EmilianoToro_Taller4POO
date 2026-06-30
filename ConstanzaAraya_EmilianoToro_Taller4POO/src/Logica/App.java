package Logica;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws Exception {
		Sistema sys = SistemaImp.getInstancia();
		sys.gestionarArch();

	}

}
