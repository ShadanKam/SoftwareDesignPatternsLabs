import java.util.ArrayList;



public class FileWriterCareTaker {

	
	ArrayList<Memento> savedMemento = new ArrayList<Memento>();

	
	public void addMemento(Memento m) { 
		savedMemento.add(m);
	}
	
	
	public Memento getMemento(int index) { 
		
		return savedMemento.get(index); 
				
	}


}

