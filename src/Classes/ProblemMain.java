package Classes;

public class ProblemMain {
	public static void main(String[] args) {
		//UC1 case add last
		System.out.println("adding at last -");
		UC1 uc1=new UC1();
		uc1.addNode(56);
		uc1.addNode(30);
		uc1.addNode(70);
		uc1.printList();
		
		//UC2 case add at start
		System.out.println("adding at start -");
		UC2 uc2=new UC2();
		uc2.addNode(70);
		uc2.addNode(30);
		uc2.addNode(56);
		uc2.printList();
		
		//appending data
		System.out.println("appending data -");
		UC3 uc3=new UC3();
		uc3.addNode(56);
		uc3.addNode(30);
		uc3.addNode(70);
		uc3.printList();
	}
}
