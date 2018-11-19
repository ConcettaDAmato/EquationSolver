package equation;
public class LinearEquationSolver3 {   
// Definisco variabili della classe
	private double a=10,b=20,sol=Double.NaN;
    
	public double getSolution(){
		if (Double.isNaN(sol)){throw new RuntimeException ("\n LinearEquationSolver non ititialized\n");}
		else{return sol;}}

	public LinearEquationSolver3() {
		if (a!=0) {sol=-b/a;} 
		else if (b!= 0){throw new RuntimeException("\n La soluzione non esiste perchè a=0 \n");}
		else {throw new RuntimeException("\n Questa è un'identità \n");}}
	
	public LinearEquationSolver3(double c, double d) {
	sol=-d/c;}
	
///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
	double e=10, f=4, sol=0;
				
	System.out.println("This is Linear Equation Solver");
		
	LinearEquationSolver3 ll=new LinearEquationSolver3(f,e);
	sol=ll.getSolution();
	System.out.println("The solution is"+sol);
		
//Second Constructor
	LinearEquationSolver3 mm=new LinearEquationSolver3();
	sol=mm.getSolution();
	System.out.println("The solution is"+sol);
	System.out.println("End of Computation");}
}