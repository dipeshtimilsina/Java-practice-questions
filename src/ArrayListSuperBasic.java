import java.util.ArrayList;
public class ArrayListSuperBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(5);
        arr1.add(3);
        arr1.add(4);
        for (int arr: arr1){
            System.out.println(arr);
        }
    }
}
