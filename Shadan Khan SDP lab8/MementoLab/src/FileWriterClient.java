
public class FileWriterClient {

	public static void main(String[] args) {

		int saveFiles = 0;

		FileWriterCareTaker caretaker = new FileWriterCareTaker();

		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n");
		saveFiles++;
		System.out.println("Number of data set in file : " + saveFiles + "\n\n");

		// save memento
		Memento m1 = fileWriter.save();
		caretaker.addMemento(m1);

		// now write something else
		fileWriter.write("Second Set of Data\n");
		System.out.println(fileWriter + "\n");
		saveFiles++;
		System.out.println("Number of data set in file  : " + saveFiles + "\n\n");

		// save memento
		caretaker.addMemento(fileWriter.save());

		// lets undo to last save
		Memento m2 = caretaker.getMemento(saveFiles - 1);
		fileWriter.undoToLastSave(m2);
		saveFiles--;

		// checking file content again
		System.out.println("First undo \n");
		System.out.println(fileWriter + "\n\n");

		// lets undo to last save
		m2 = caretaker.getMemento(saveFiles - 1);
		fileWriter.undoToLastSave(m2);
		saveFiles--;
		// checking file content again
		System.out.println("Second undo \n");
		System.out.println(fileWriter + "\n\n");

	}

}
