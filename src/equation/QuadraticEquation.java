package equation;
/** * @autor Concetta D'Amato
 * 
 * 
 * Calcolo delle radici di un'equazione di secondo grado*/

import java.util.Arrays;
public class QuadraticEquation {
/** Definizione delle variabili: a è il coefficiente di secondo ordine,
 * b è il coefficiente di primo ordine, c è il termine noto, D è il determinante.
 */
	private double a=1,b=-5,c=2, D=Double.NaN;
	private double sol[]= new double[2];
	
	public double[] getSolution(){
	return sol;}
/** Definizione del metodo di calcolo delle radici dell'equazione	
 */
	public QuadraticEquation() {
	D=Math.pow(b,2)-4*a*c;
	 if (D<0){throw new RuntimeException("\n La soluzione non esiste perchè D<0 \n");} 
	 else {sol[0]=(-b+(double)Math.sqrt(D))/(2*a);
		   sol[1]=(-b-(double)Math.sqrt(D))/(2*a);}}	 

	public QuadraticEquation(double a, double b, double c) {
	D=Math.pow(b,2)-4*a*c;
	if (D<0){throw new RuntimeException("\n La soluzione non esiste perchè D<0 \n");} 
	 else {sol[0]=(-b+(double)Math.sqrt(D))/(2*a);
		   sol[1]=(-b-(double)Math.sqrt(D))/(2*a);}}	
	
		
/**Routine di calcolo */
	public static void main(String[] args){
	double a=1, b=-8, c=2;
	double[] sol= {0,0};
	System.out.println("This is Quadratic Equation Solver");
	
	QuadraticEquation mm=new QuadraticEquation (a,b,c);
	sol=mm.getSolution();
	System.out.println("The solution is "+Arrays.toString(sol));
	
	QuadraticEquation ll=new QuadraticEquation();
	sol=ll.getSolution();
	System.out.println("The solution is "+Arrays.toString(sol));

	System.out.print("End of Computation");}
}