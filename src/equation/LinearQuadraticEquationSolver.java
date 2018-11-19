package equation;
import java.util.Arrays;

/** LinearEquationSolver4 solves linear equation and quadratic equations according to user needs.
 * @autor Concetta D'Amato 11/11/2018
 */
public class LinearQuadraticEquationSolver {
@SuppressWarnings("static-access")
	public static void main(String[] args) {
	double a,b,c;
	double choise;

System.out.println("Enter a value of choise<=1 to solve a linear equation,"
			+ " otherwise choise>1 to solve a quadratic equation");
// The variable choise allows the user to choose whether to solve a linear or quadratic equation
GetOneDoubleParameter oneParameters= new GetOneDoubleParameter();	
choise= oneParameters.setParameterUsingBufferedReader("choise");	
	 
	if (choise<=1){
	 System.out.println("This is Linear Equation Solver");
	 GetOneDoubleParameter oneLinearParameters= new GetOneDoubleParameter();	
	 System.out.println("Enter a value of a (coefficient of the unknown first degree) and b (known term)");	
	 a= oneLinearParameters.setParameterUsingBufferedReader("a");
	 b= oneLinearParameters.setParameterUsingBufferedReader("b");			
	 // Solve the Linear Equation
	 LinearEquationSolver3 eq=new LinearEquationSolver3(a,b);
	 double sol=eq.getSolution();
	 System.out.println("The solution is"+sol);		
	 } 
	 
	else {
	 System.out.println("This is Quadratic Equation Solver");
	 GetOneDoubleParameter oneQuadraticParameters= new GetOneDoubleParameter();
	 System.out.println("Enter a value of a (coefficient of the unknown second degree),"
	 		+ " b (coefficient of the unknown first degree) and c (known term)");
	 a= oneQuadraticParameters.setParameterUsingBufferedReader("a");
	 b= oneQuadraticParameters.setParameterUsingBufferedReader("b");
	 c= oneQuadraticParameters.setParameterUsingBufferedReader("c");		
	 // Solve the Quadratic Equation
	 System.out.println("This is Quadratic Equation Solver");
	 QuadraticEquation ll=new QuadraticEquation(a,b,c);
	 double[] solution=ll.getSolution();
	 System.out.println("The solution is "+Arrays.toString(solution));
	 System.out.println("End of Computation");			
		}
	}	
}




