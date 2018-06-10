
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.text.DecimalFormat;  
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.List;  
import java.util.concurrent.TimeUnit;  
  
public class SerialNumTest {  
  
    public static void main(String[] args) throws InterruptedException {  
        SerialNumber serial = new FileEveryDaySerialNumber(5, "EveryDaySerialNumber.dat");  
 
            System.out.println(serial.getSerialNumber());  

    }  
}  
  
abstract class SerialNumberTest {  
    public synchronized String getSerialNumber() {  
        return process();  
    }  
  
    protected abstract String process();  
}  
  
abstract class EveryDaySerialNumberTest extends SerialNumberTest {  
  
    protected final static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
    protected DecimalFormat df = null;  
  
    public EveryDaySerialNumberTest(int width) {  
        if (width < 1) {  
            throw new IllegalArgumentException("Parameter length must be great than 1!");  
        }  
        char[] chs = new char[width];  
        for (int i = 0; i < width; i++) {  
            chs[i] = '0';  
        }  
        df = new DecimalFormat(new String(chs));  
    }  
  
    protected String process() {  
        Date date = new Date();  
        int n = getOrUpdateNumber(date, 1);  
        return format(date) + format(n);  
    }  
  
    protected String format(Date date) {  
        return sdf.format(date);  
    }  
  
    protected String format(int num) {  
        return df.format(num);  
    }  
  
    protected abstract int getOrUpdateNumber(Date current, int start);  
}  
  
class FileEveryDaySerialNumberTest extends EveryDaySerialNumberTest {  
  
    private File file = null;  
  
    private final static String FIELD_SEPARATOR = ",";  
  
    public FileEveryDaySerialNumberTest(int width, String filename) {  
        super(width);  
        file = new File(filename);  
    }  
  
    @Override  
    protected int getOrUpdateNumber(Date current, int start) {  
        String date = format(current);  
        int num = start;  
        if (file.exists()) {  
            List<String> list = FileUtil.readList(file);  
            String[] data = list.get(0).split(FIELD_SEPARATOR);  
            if (date.equals(data[0])) {  
                num = Integer.parseInt(data[1]);  
            }  
        }  
        FileUtilTest.rewrite(file, date + FIELD_SEPARATOR + (num + 1));  
        return num;  
    }  
}  
  
class FileUtilTest {  
    public static void rewrite(File file, String data) {  
        BufferedWriter bw = null;  
        try {  
            bw = new BufferedWriter(new FileWriter(file));  
            bw.write(data);  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (bw != null) {  
                try {  
                    bw.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
  
    public static List<String> readList(File file) {  
        BufferedReader br = null;  
        List<String> data = new ArrayList<String>();  
        try {  
            br = new BufferedReader(new FileReader(file));  
            for (String str = null; (str = br.readLine()) != null;) {  
                data.add(str);  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (br != null) {  
                try {  
                    br.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return data;  
    }  
} 

