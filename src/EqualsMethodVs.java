public class EqualsMethodVs {
    public static void main(String[] args) {
        String s1= new String ("Hello there");
        String s2= new String ("Hello there");
        int a= 5;
        int b=2;
        boolean test= (s1==s2);
        boolean test2= s1.equals(s2);
        boolean test3= (a==b);
        boolean test4= (a==a);
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        }
    }
