package student_dmitrij_petrass.lesson_3.level_5;

class Dog {
    private String dogsName;
    private double age;
    private String color;
    private String newColor;

    public Dog(String dogsName, double dogsAge, String color, String newColor) {
        this.dogsName = dogsName;
        this.age = dogsAge;
        this.color = color;
        this.newColor = newColor;

    }

    public String getDogsName() {
        return dogsName;
    }

    public double getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void voice() {
        System.out.println("Gaf");
    }

    public void happyBirthday() {
        System.out.println(age + 1);
    }

    public String getNewColor() {
        return newColor;
    }

}
