package student_dmitrijs_voronins.lesson_3.Level_2;

public class Task_10 {

    public static void main(String[] args) {

        String s1 = new String("Hello Java");
        System.out.println(s1);
            	String s = "Hello";
    	String str = "Java";
    	String str1 = s.concat(str);
    	System.out.println(str1);

    	String ss = "Hello";
    	String st_r = "Java";
    	String str_1 = ss+st_r;
    	String str_2 = "Java"+11;
    	System.out.println(str_1);
    	System.out.println(str_2);

        String sss = "Hell";
    	String s11 = "Hello";
    	String s22 = "Hello";
    	boolean b = s11.equals(s22);    //true
    	System.out.println(b);
    	b =	sss.equals(s11) ;   //false
    	System.out.println(b);


        String s111 = "Java";
    	String s222 = "Java";
    	String s3 = new String ("Java");
    	boolean bb = (s111 == s222);     //true
    	System.out.println(bb);
    	bb =	(s1 == s3);      //false
    	System.out.println(bb);
    }
}








