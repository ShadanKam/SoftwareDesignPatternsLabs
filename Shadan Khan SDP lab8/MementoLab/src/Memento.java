

public class Memento{
	
	public String fileName;
	public StringBuilder content;

	public Memento(String file, StringBuilder content) {
		this.fileName = file;
		//notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
		this.content = new StringBuilder(content);
	}
	
	public String getLastSaveFile() {
		return fileName;
	}
	
	public StringBuilder getLastSaveConent() {
		return content;
	}
}


