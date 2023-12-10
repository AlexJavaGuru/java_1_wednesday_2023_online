package student_aleksandra_azbuka.lesson_3;

class Task32Demo {

    public static void main(String[] args) {
        Task32 task32 = new Task32("Viktor", 100000);
        String ownerName = task32.getOwner();
        int moneyAmount = task32.getMoney();
        System.out.println("Owner = " + ownerName);
        System.out.println("Money = " + moneyAmount);
    }
}
