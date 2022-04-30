package Main;
import java.io.Serializable;
import java.util.*;

public class Log implements Serializable
{
	private List<String> actions = new ArrayList<String>();
	private List<Date> dates = new ArrayList<Date>();
	
	public Log() {}
	
	public void AppendLog(String action, Date date) {
		actions.add(action);
		dates.add(date);
	}
	public void ClearLog() {
		actions.clear();
		dates.clear();
	}
	
	public String toString() {
		String line = "";
		for(int i = 0; i < actions.size(); i++) {
			line += actions.get(i) + "\nDate: " + String.valueOf(dates.get(i));
		}
		return line;
	}
}