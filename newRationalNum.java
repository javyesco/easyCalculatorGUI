/** Created by Luis J. Escobar Veras
 * with help of YouTube videos and web-research
 * 
 * Language Used: JAVA
 * 
 * Code Purpose: This code will calculate the addition,
 * subtraction, multiplication and division of two fractions
 * 
 * Computer Science Major
 * 
 * Polytechnic University of PR
 * 
 * CECS 3210 Advance Programming
 */

import java.text.DecimalFormat; //To get the decimal value of the fractions

public class newRationalNum {
	private int num;
	private int den;

	//Default Constructor
	public newRationalNum() {
		setNumerator(0);
		setDenominator(0);
	}

	//Overload Constructor
	public newRationalNum(int a, int b) {
		num = a;
		den = b;
		if (den < 0) {
			den = den * -1;
			num = num * -1;
		}else 
			if (den == 0) {
				den = 1;
				num = 0;
			}
		newRationalNum.this.simplify();
	}

	//Mutators and Accessors
	public void setNumerator (int a) {
		num = a;
		newRationalNum.this.simplify();
	}

	public int getNumerator() {
		return num;
	}

	public void setDenominator(int b) {
		if (b < 0) {
			b = b * -1;
			den = b;
			if (num < 0) {;
			} else {
				num = getNumerator() * -1;
			}
		} else 
			if (b == 0) {
				setNumerator(0);
				setDenominator(1);
			} else {
				den = b;
			}
		newRationalNum.this.simplify();
	}

	public int getDenominator() {
		return den;
	}

	@Override //Function
	public String toString() {
		String stringFor = num + "/" + den;
		return stringFor;
	}

	//Addition Function
	public static newRationalNum add(newRationalNum r1, 
			newRationalNum r2) {
		int num1 = r1.getNumerator();
		int denom1 = r1.getDenominator();
		int num2 = r2.getNumerator();
		int denom2 = r2.getDenominator();
		int num3 = (num1 * denom2) + (num2 * denom1);
		int denom3 = denom1 * denom2;

		newRationalNum ans = new newRationalNum(num3, denom3);

		return ans;
	}

	//Subtraction Function
	public static newRationalNum subt(newRationalNum r1, 
			newRationalNum r2) {
		int num1 = r1.getNumerator();
		int denom1 = r1.getDenominator();
		int num2 = r2.getNumerator();
		int denom2 = r2.getDenominator();
		int num3 = (num1 * denom2) - (num2 * denom1);
		int denom3 = denom1 * denom2;

		newRationalNum ans = new newRationalNum(num3, denom3);

		return ans;
	}

	//Multiplication Function
	public static newRationalNum mult(newRationalNum r1, 
			newRationalNum r2) {
		int num1 = r1.getNumerator();
		int denom1 = r1.getDenominator();
		int num2 = r2.getNumerator();
		int denom2 = r2.getDenominator();
		int num3 = (num1 * num2);
		int denom3 = (denom1 * denom2);

		newRationalNum ans = new newRationalNum(num3, denom3);

		return ans;
	}

	//Division Function
	//Has problems returning the correct value
	//Tried to fix, but nothing yet
	public static newRationalNum div(newRationalNum r1, 
			newRationalNum r2) {
		int num1 = r1.getNumerator();
		int denom1 = r1.getDenominator();
		int num2 = r2.getNumerator();
		int denom2 = r2.getDenominator();
		int num3 = (denom1 * num2);
		int denom3 = (denom2 * num1);

		newRationalNum ans = new newRationalNum(num3, denom3);

		return ans;
	}

	//Function simplify the fraction
	public String simplify() {
		int gcd = this.gcd(num, den);

		if(gcd < 0) {
			gcd = -gcd;
		}

		num /= gcd;
		den /= gcd;

		return num + "/" + den;
	}

	//Function to get the GCD
	private Integer gcd(Integer a, Integer b) {
		if((a % b) == 0) {
			return b;
		}
		else {
			return gcd (b, a % b);
		}
	}

	//Function to convert to decimal
	public String toDecimal() {
		DecimalFormat deci = new DecimalFormat("00.00");
		return deci.format(((float)(num) / den));
	}
}
