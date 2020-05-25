public class StringManipulation {
    public static void main(String[] args) {
        //Index pos= 0123456789012345
        String str= "Dis strin";
        System.out.println(str.charAt(5)); //i
        System.out.println(str.substring(0,5)); //here, you need to be careful to have 'This printed'
                                                //you will need to go from 0,4 and not 0,3
        System.out.println(str.substring(4,9));
        System.out.println(str.length());
    }
}
