public class StringMethods {
    public static void main(String[] args) {
        String s= "This is a string";
        int a= 12;
        String b= String.valueOf(12);//valueOf converts all types of data to String
        String c= Integer.toString(12); //you can use it too
        String l= String.valueOf(s);
        System.out.println(s+ " "+ l);
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());


    }
}
