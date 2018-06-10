import java.util.Date;
import java.util.TimeZone;

/**
 * @Description:  TODO<请描述此文件是做什么的>
 * @author:  chenshiyao
 * @date:  2017年9月20日 上午9:04:52
 */

/**
 * TODO<请描述这个类是干什么的>
 * @author  chenshiyao
 * @date:  2017年9月20日 上午9:04:52
 */
public class NewDateTest {
	public static void main(String[] args) {
		System.out.println("原时间 " + new Date());
		TimeZone tz = TimeZone.getTimeZone("ETC/GMT-8");
		TimeZone.setDefault(tz);
		System.out.println("修改后时间 " + new Date());
	}
}
