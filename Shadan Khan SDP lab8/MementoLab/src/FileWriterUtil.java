
public class FileWriterUtil {

	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String file){
		this.fileName=file;
		this.content= new StringBuilder();
	}

	@Override
	public String toString(){
		return this.content.toString();
	}

	public void write(String str){
		content.append(str);
	}

	//create new memnto with new file name and content (stotrInMemnot)
	public Memento save() {
		return new Memento(fileName, content);
	}

	//restore from memnto
	public void undoToLastSave(Memento memento){
		fileName = memento.getLastSaveFile();
		content = memento.getLastSaveConent();
	}


}


