import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListLamada {

	public static void main(String[] args){
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> map1 = new HashMap<String,Object>();
		map1.put("username", "����");
		map1.put("age", 15);
		map1.put("sex", "��");
		
		Map<String,Object> map2 = new HashMap<String,Object>();
		map2.put("username", "����");
		map2.put("age", 20);
		map2.put("sex", "Ů");
		
		list.add(map1);
		list.add(map2);
		
		list.stream().forEach(map -> {
			System.out.println(map);
		});
		
		
		
		
		
	}
}
