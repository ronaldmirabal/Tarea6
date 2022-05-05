import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vectores {
    public static void main(String[] args) {
        Integer[] arreglo = {1,2,5,6,8};
        List<Integer> tempList = new ArrayList<Integer>(Arrays.asList(arreglo));
        tempList.remove(1);
        tempList.remove(2);
        tempList.forEach((n) -> System.out.println(n));
    }
}
