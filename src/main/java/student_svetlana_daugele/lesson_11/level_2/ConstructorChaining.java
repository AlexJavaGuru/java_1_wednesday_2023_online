package student_svetlana_daugele.lesson_11.level_2;

class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}



/*
    Создайте в этом классе публичный конструктор с двумя параметрами.
        Внутри этого конструктора первой строкой вызовите приватный конструктор с одним параметром.

        Более подробно про этот подход можно прочитать: constructor chaining in Java.

*/