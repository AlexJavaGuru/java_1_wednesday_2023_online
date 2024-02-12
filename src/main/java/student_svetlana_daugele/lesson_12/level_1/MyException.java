package student_svetlana_daugele.lesson_12.level_1;

class MyException extends Exception {

        public MyException(String message) {
            super(message);
        }

        public void findMyException() {
            try {
                throw new MyException("This is a new exception message");
            } catch (MyException e) {
                System.out.println("Caught MyException: " + e.getMessage());
            }
        }
}


/*
class MyException extends Throwable {
}

class MyException extends Exception {
}

class MyException extends RuntimeException  {
}
 */
