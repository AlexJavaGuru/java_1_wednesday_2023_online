package student_svetlana_daugele.lesson_8.level_7_Library;

 class LibraryMember {
    private int memberId;
    private String name;
    private String surName;
    private String email;
    private int telephoneNumber;
     int age;
     char gender;

     public LibraryMember(int memberId, String name,
                          String email, int telephoneNumber, int age, char gender) {
         this.memberId = memberId;
         this.name = name;
         this.email = email;
         this.telephoneNumber = telephoneNumber;
         this.age = age;
         this.gender = gender;
     }

     public int getMemberId() {
         return memberId;
     }

     public void setMemberId(int memberId) {
         this.memberId = memberId;
     }

     public String getName() {
         return name;
     }

     public void setname(String name) {
         this.name = name;
     }


     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public int getTelephoneNumber() {
         return telephoneNumber;
     }

     public void setTelephoneNumber(int telephoneNumber) {
         this.telephoneNumber = telephoneNumber;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public char getGender() {
         return gender;
     }

     public void setGender(char gender) {
         this.gender = gender;
     }
}
