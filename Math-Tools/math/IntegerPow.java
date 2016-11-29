package math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class IntegerPow {
	
	public static BigDecimal calculate(BigDecimal number, BigInteger degree) {
		String binaryDegree = degree.toString(2);
		BigDecimal result = new BigDecimal("1");
		for(int i = 0; i < binaryDegree.length(); i++) {
			if(binaryDegree.substring(i, i + 1).equals("1"))
				result = result.multiply(result).multiply(number);
			else
				result = result.multiply(result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IntegerPow.calculate(new BigDecimal("1.1"), new BigInteger("10")));
	}

}
