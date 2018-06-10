/**
 * @Description:  TODO<请描述此文件是做什么的>
 * @author:  chenshiyao
 * @date:  2017年8月17日 下午7:10:30
 */

/**
 * TODO<请描述这个类是干什么的>
 * @author  chenshiyao
 * @date:  2017年8月17日 下午7:10:30
 */
public class SubStringTest {

	public static void main(String[] args){
		
		String date = "20160725";
		
		String d1 = date.substring(4,6);  //07
		
		System.out.println(d1);
		
		System.out.println(Integer.valueOf(d1));   //7
		
		String d2 = date.substring(6,8);  //25
		
		System.out.println(d2);
	}
}
