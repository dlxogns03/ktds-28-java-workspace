package exam.statics;

public class MathCalculator {
	
	/**계산하려는 첫번째 정수 */
	private int firstNumber;
	
	/**계산하려는 두번째 정수*/
	private int secondNumber;
	
	
	public MathCalculator(int firstNumber , int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	/**
	 * 숫자 두개를 연산하여 반환
	 * 
	 * @param operator (0:더하기, 1:빼기 , 2:곱하기, 3 : 나누기 몫 , 4 : 나누기 나머지값)
	 * @see com.ktdsuniversity.edu.oop.eaxm.statics.Operators 연산자 종류
	 * @return
	 */
	public int getComputeResult(int operator) {
		
		if(operator == Operators.ADD) {
			return this.firstNumber + this.secondNumber;
		}else if (operator == Operators.SUB ) {
			return this.firstNumber - this.secondNumber;
			
		}else if (operator == Operators.MUL) {
			return this.firstNumber * this.secondNumber;
		
		}else if (operator == Operators.DIV) {
			return this.firstNumber / this.secondNumber;
			
		}else if (operator == Operators.MOD) {
			
			return this.firstNumber % this.secondNumber;
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		MathCalculator math = new MathCalculator(10, 2);
		System.out.println(math.getComputeResult(Operators.ADD));
		System.out.println(math.getComputeResult(Operators.SUB));
		System.out.println(math.getComputeResult(Operators.MUL));
		System.out.println(math.getComputeResult(Operators.DIV));
		System.out.println(math.getComputeResult(Operators.MOD));
	}

}
