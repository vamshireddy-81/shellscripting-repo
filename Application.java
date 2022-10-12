/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

 class main
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
		//create a file object for the current location
		File devfile1=new File("deployment.java");
		try{
			//trying to create a file based on theobject
			boolean value=file.createNewFile();
			if(value){
				System.out.println("The new file is created");
			}
			else
			{
				System.out.println("file already exists");
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}