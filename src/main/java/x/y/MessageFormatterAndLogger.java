package x.y;

public class MessageFormatterAndLogger {

	public void log(String message) {
		String formattedLog = this.format(message);
		System.err.println(formattedLog);
	}
	
	public String format(String message) {
		return String.format("(%s) %d : %s", System.getProperty("user.name"), System.currentTimeMillis(), message);
	}
}
