import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:  TODO<请描述此文件是做什么的>
 * @author:  chenshiyao
 * @date:  2017年7月6日 上午9:44:05
 */

/**
 * TODO<请描述这个类是干什么的>
 * @author  chenshiyao
 * @date:  2017年7月6日 上午9:44:05
 */
public class DateTest {

	public static void main(String[] args) {
		/*Date d=new Date();   
	    SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");   
	    String expireDate = df.format(new Date(d.getTime() + 15 * 24 * 60 * 60 * 1000));
		System.out.println("15天后的日期：" + df.format(new Date(d.getTime() + 15 * 24 * 60 * 60 * 1000)));
		System.out.println(expireDate);	*/
		
        String dateStr = "2010-04-20";
        //String dateStr2 = "2017-08-26";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
			Date date = format.parse(dateStr);
			Date date2 = new Date();
			int days = (int) ((date2.getTime() - date.getTime()) / (1000*3600*24));
			
			System.out.println(days);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}
}
