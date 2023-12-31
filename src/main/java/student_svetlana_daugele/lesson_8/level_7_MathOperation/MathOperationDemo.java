package student_svetlana_daugele.lesson_8.level_7_MathOperation;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 20 / 5 = a
		Argument arg1 = new Argument(20);
		Argument arg2 = new Argument(5);
		MathOperation divide = new Divide(arg1, arg2);
		System.out.println("Right side Divide result = " + divide.calculate());

		// build and calculate: 10 - 5 = b
		Argument arg3 = new Argument(10);
		Argument arg4 = new Argument(5);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Left side Subtraction result = " + subtraction.calculate());

		// build and calculate: a * b
		Argument arg5 = new Argument(subtraction.calculate());
		Argument arg6 = new Argument(divide.calculate());
		MathOperation multiply = new Multiply(arg5, arg6);
		System.out.println("Result = " + multiply.calculate());

	}

}
/*
Разобраться в коде MathOperation, который находится в пакете super_task_2.
Реализовать две дополнительные математические операции: умножение и деление.
В демо программе сконструировать и вычислить выражение: (10 - 5) * (20 / 5).
Написать тесты для данного кода.
 */