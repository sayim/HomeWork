/**
 * This is a vector class of complex numbers
 */

public class VectorOfComplexNumber {

	private int lo_;
	private int hi_;
	private int size_;
	private ComplexNumber[] ArrayOfVector;
	
	//Default Constructor
	
	VectorOfComplexNumber(){
		lo_=0;hi_=0;
	}

	//Parameterized Constructor
	public VectorOfComplexNumber(int size) {
		lo_ = 0;
		hi_ = 0;
		size_ = size;
		ArrayOfVector = new ComplexNumber[size_];
	}
	
	//Function for adding elements
	
	public void push(ComplexNumber C) {
			ArrayOfVector[hi_]=C;
			hi_++;
	}
	
	//Function for removing elements
	
	public void pop() {
		if(hi_>=lo_){
			hi_--;
		}
		else {
			System.out.println("Underflow");
		}
	}
	
	//Function for getting size
	
	public int getSize() {
		return size_;
	}
	
	//Showing a vector
	
	public void show() {
		try {
			//System.out.println(hi_);
			for(int i=lo_;i<size_;i++){
				ArrayOfVector[i].printComplexNumber();
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
	
	//Function for multiplication of a vector
	
	public VectorOfComplexNumber VecttorMultiply(VectorOfComplexNumber V) {
		VectorOfComplexNumber temp=new VectorOfComplexNumber(V.getSize());
		for (int i = lo_; i < V.getSize(); i++) {
			temp.ArrayOfVector[i]=this.ArrayOfVector[i].Multiply(V.ArrayOfVector[i]);
		}
		return temp;
	}

}
