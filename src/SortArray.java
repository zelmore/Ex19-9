// Ex19-9
// Zachary Elmore
// 11/14/16
// Takes an array and sorts the elements

import java.util.ArrayList;

public class SortArray {

	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(3);
	        list.add(4);
	        list.add(7);
	        list.add(10);
	        list.add(11);
	        list.add(2);
	        list.add(5);
	        list.add(8);

	        System.out.println(list);
	        sort(list);
	        System.out.println(list);
	    }

	    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
	        for (int i = 0; i < list.size() - 1; i++) {
	            E currentMin = list.get(i);
	            int min = i;
	            for (int j = i + 1; j < list.size(); j++) {
	                if (list.get(j).compareTo(currentMin) < 0) {
	                    currentMin = list.get(j);
	                    min = j;
	                }
	            }

	            if (min != i) {
	                list.set(min, list.get(i));
	                list.set(i, currentMin);
	            }
	        }
	    }
}
    