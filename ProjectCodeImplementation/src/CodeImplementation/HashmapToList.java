package CodeImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapToList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		System.out.println("Winners of the week:");
        map.put(1, "1. Alex");
        map.put(2, "2. carla");
        map.put(3, "3. Gus");
        map.put(4, "4. Meha");
        map.put(5, "5. Ginny");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valueList = new ArrayList<>(map.values());

        System.out.println("No of winners(Key List): " + keyList);
        System.out.println("Winners List(Value List): " + valueList);
	}

}
