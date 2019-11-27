package stringfunctions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class formatdateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LocalDateTime dt=LocalDateTime.now();
     System.out.println("Before Formatting:"+dt);
     System.out.println("-----------------------------------------");
     DateTimeFormatter format=DateTimeFormatter.ofPattern("E,MMM:dd:yyyy HH:mm:ss");
     String formatDate=dt.format(format);
     System.out.println("After Formatting:"+formatDate);
	}

}
