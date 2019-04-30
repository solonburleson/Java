
public class Calculator {
	private Double operandOne;
	private Double operandTwo;
	private String operation;
	private Double result;
	
	public Calculator() {
		this.operandOne = 0.0;
		this.operandTwo = 0.0;
		this.operation = "";
		this.result = 0.0;
	}
	
	public Double getOperandOne() {
		return this.operandOne;
	}
	
	public void setOperandOne(Double operand) {
		this.operandOne = operand;
	}
	
	public Double getOperandTwo() {
		return this.operandTwo;
	}
	
	public void setOperandTwo(Double operand) {
		this.operandTwo = operand;
	}
	
	public String getOperation() {
		return this.operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if(this.operation == "+") {
			this.result = this.operandOne + this.operandTwo;
		} else if(this.operation == "-") {
			this.result = this.operandOne - this.operandTwo;
		}
	}
	
	public Double getResult() {
		return this.result;
	}
}
