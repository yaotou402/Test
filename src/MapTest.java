import java.util.HashMap;
import java.util.Map;

/**
 * @Description:  TODO<请描述此文件是做什么的>
 * @author:  chenshiyao
 * @date:  2017年9月16日 上午11:45:52
 */

/**
 * TODO<请描述这个类是干什么的>
 * @author  chenshiyao
 * @date:  2017年9月16日 上午11:45:52
 */
public class MapTest {

	public static void main(String[] args){
		
		Map<String,String> mapTest = new HashMap<String,String>();
		String vbbb = "sf";
		String abc = "sdf";
		mapTest.put("aaa", vbbb);
		mapTest.put("2", abc);
		
		System.out.println(mapTest.get("aaa"));
		System.out.println(mapTest.get(2));
		
	}
}
