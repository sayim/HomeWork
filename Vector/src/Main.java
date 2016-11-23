import java.lang.NullPointerException;
public class Main {

	static ComplexNumber z1, z2, z3,z4,z5,z6,z7,z8;

	public static void main(String[] args) throws NullPointerException {
		z1 = new ComplexNumber(-1,-2);
		z2 = new ComplexNumber(-2 ,-1);
		z3 = new ComplexNumber(2, -2);
		z4=new ComplexNumber(4,5);
		z5=new ComplexNumber(2,-5);
		z6=new ComplexNumber(3,8);
		z7=new ComplexNumber(3,2);
		z8=new ComplexNumber(4,-11);
		
		
		VectorOfComplexNumber vectorOfComplexNumber=new VectorOfComplexNumber(4);
		VectorOfComplexNumber vectorOfComplexNumber1=new VectorOfComplexNumber(4);
		vectorOfComplexNumber.push(z1);
		vectorOfComplexNumber.push(z2);
		vectorOfComplexNumber.push(z3);
		vectorOfComplexNumber.push(z7);
		
		System.out.println("First Vector");
		
		vectorOfComplexNumber.show();
		
		vectorOfComplexNumber1.push(z4);
		vectorOfComplexNumber1.push(z5);
		vectorOfComplexNumber1.push(z6);
		vectorOfComplexNumber1.push(z8);
		
		System.out.println("Second Vector");
		
		vectorOfComplexNumber1.show();
		
		System.out.println("Ans Vector");
		
		VectorOfComplexNumber ans;
		
		ans=vectorOfComplexNumber.VecttorMultiply(vectorOfComplexNumber1);
		
		ans.show();

	}

}
