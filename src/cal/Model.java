package cal;

public class Model {
	
	public double calculate(String operator, double x, double y) {
		if(operator.equals("+")) {
			return x+y;
		}else if(operator.equals("-")) {
			return x-y;
		}else if(operator.equals("*")) {
			return x*y;
		}else {
			return x/y;
		}
	}
}
