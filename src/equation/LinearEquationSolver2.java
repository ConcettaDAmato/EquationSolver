package equation;

public class LinearEquationSolver2 {
////////////////////////////////////////////////////////////////////
///////////////////////// variabili static /////////////////////////
////////////////////////////////////////////////////////////////////
	
//static private double a=3,b=4;
//public static void main(String[] args) {
		
// Creo oggetto mm
	//LinearEquationSolver2 mm= new LinearEquationSolver2 ();
	
//Cambio il valore della variabile a chiamandola direttamente dalla classe. 
//Questo � possibile perch� � una variabile static
	//LinearEquationSolver2.a=5; 

////////////////////////////////////////////////////////////////////
///////////////////////variabili non static ////////////////////////
////////////////////////////////////////////////////////////////////
	private double a=3,b=4;
	public static void main(String[] args) {
			
// Creo oggetto mm
	LinearEquationSolver2 mm= new LinearEquationSolver2 ();
		
// Poich� la variabile non � static cambiando il valore di a  
// non si cambia automaticamente il valore di mm.a		
		
	mm.a=5;
	mm.b=1;
		
	System.out.println("The solution is: "+(-mm.a/mm.b));}
}