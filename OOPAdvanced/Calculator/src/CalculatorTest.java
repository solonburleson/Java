
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperandOne(10.5);
		c1.setOperation("+");
		c1.setOperandTwo(5.2);
		c1.performOperation();
		System.out.println(c1.getResult());
	}

}
