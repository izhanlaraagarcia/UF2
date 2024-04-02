package practica1;
import java.util.Scanner;

/**
 * Esta clase representa las notas de un estudiante.
 */
public class test {
	// Declaramos las variables que necesitamos
	/**
	 * La primera nota.
	 */
	double uf1;
	/**
	 * La segunda nota.
	 */
	double uf2;
	/**
	 * La tercera nota.
	 */
	double uf3;
	/**
	 * La primera nota acumulada.
	 */
	double acu1;
	/**
	 * La segunda nota acumulada.
	 */
	double acu2;
	/**
	 * La tercera nota acumulada.
	 */
	double acu3;
	/**
	 * La nota final.
	 */
	double def;
	// Usamos Scanner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Este método se utiliza para introducir las notas del estudiante.
	 */
	public void IngresaNotas() {
		System.out.println("ingrese las notas del estudiante");
		System.out.print("ingrese nota 1: ");
		uf1= entrada.nextDouble();
		System.out.print("ingrese nota 2: ");
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		uf3= entrada.nextDouble();
	}
	
	/**
	 * Este método se utiliza para comprobar la correcta introducción de las notas.
	 */
	public void comprobarcion(){
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	
	/**
	 * Este método se utiliza para calcular la nota final.
	 */
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		def = acu1 + acu2+ acu3;
	}
	
	/**
	 * Este método se utiliza para mostrar las notas y la nota final.
	 */
	public void Mostrar() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		System.out.println(" nota definitiva es = "+ def);
	}

	/**
	 * Este método se utiliza para comprobar si el estudiante ha aprobado o suspendido.
	 */
	public void aprobado() {
		if(def<5 && def>=0) {
			System.out.println("suspendio");
		}else {
			if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
			}else {
				System.out.println(" error en la notas");
			}
		}
	}
	
	/**
	 * El método principal.
	 */
	public static void main(String[] args) {
		test fc= new test();
		fc.IngresaNotas();
		fc.comprobarcion();
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}
}
