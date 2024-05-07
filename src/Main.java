import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code hereh
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        //оставить положительные четные числа и расположить их в порядке возрастания
       intList = new ArrayList<>(intList);

        for (int i = 0; i <intList.size(); i++) {
            if(intList.get(i)<=0||intList.get(i)%2!=0){
                intList.remove(i);
                //здесь надо вернуться на шаг назад, чтоб не перескочить через элементъ
                i--;
            }
        }

        Collections.sort(intList);
        System.out.println(intList);
    }
}
