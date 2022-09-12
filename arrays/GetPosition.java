
import java.util.*;

public class GetPosition {

	public static void main(String[] args)
	{

		ArrayList<String> arr = new ArrayList<String>(4);

		arr.add("hello");
		arr.add("manicks");
		arr.add("Be");
		arr.add("Happy");

		System.out.println("List: " + arr);

		String element = arr.get(2);

		System.out.println("the element at index 2 is " + element);
	}
}
