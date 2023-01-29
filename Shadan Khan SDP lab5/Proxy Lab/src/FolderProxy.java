

public class FolderProxy implements IFolder{

	Folder folder;
	User user;

	public FolderProxy(User newUser) {
		user = newUser;
		folder = new Folder();
	}

	public void performOperations() {

		//check if user name = "arpit", then perform operation on the folder
		//else, print statement "you don't have access to this folder"
		if (user.getUserName().equals("arpit") && user.getPassword().equals("arpit")){
			folder.performOperations();
		}else
			System.out.println("You don't have access to this folder.");
		
		
	}
} 


