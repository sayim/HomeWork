import java.lang.Math;;

public class ComplexNumber {
	private double real;
	private double img;
	private double mag;
	private double theta;
	
	public ComplexNumber() {
	}

	public ComplexNumber(double real_, double img_) {
		real = real_;
		img = img_;
		mag = Math.sqrt(real * real + img * img);
		theta = Math.toDegrees(Math.atan(real / img));
	}

	public ComplexNumber add(ComplexNumber z) {
		return new ComplexNumber(this.real + z.real, this.img + z.img);
	}

	public ComplexNumber sub(ComplexNumber z) {
		return new ComplexNumber(real - z.real, img - z.img);
	}

	public void printComplexNumber() {
		if(img<0){
			System.out.println(real+""+ img + "i");
		}
		else {
			System.out.println(real + "+" + img + "i");
		}
		System.out.println();
		System.out.println("Magnitude: " + mag + " Theta:" + theta);
	}
	
	public ComplexNumber Multiply(ComplexNumber c) {
		ComplexNumber temp=new ComplexNumber();
		temp.real=(this.real*c.real)-(this.img*c.img);
		temp.img=(this.real*c.img)+(this.img*c.real);
		return temp;
		
	}
}
