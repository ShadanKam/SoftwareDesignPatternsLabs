
public class ProxyTest {

	public static void main(String[] args) {

		// When you click on folder,Lets say a GUI form will ask for userName and
		// password.
		// and this GUI will create this user object

		System.out.println("\nWhen userName and password are correct:");

		// If we give correct userName and password
		User user = new User("arpit", "arpit");
		FolderProxy folderProx = new FolderProxy(user);
		folderProx.performOperations();

		System.out.println("\n**************************************");

		System.out.println("\nWhen userName and password are incorrect:");
		// if we give wrong userName and Password
		User userWrong = new User("abc", "abc");
		folderProx = new FolderProxy(userWrong);
		folderProx.performOperations();

	}

}
