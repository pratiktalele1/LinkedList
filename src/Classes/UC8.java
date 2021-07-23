package Classes;

public class UC8 {
	Node head;

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	// inserting data in between
	public void insertAfter(int data) {
		Node node = new Node(data);

		Node temp = head;
		Node prev = head;
		while (temp != null) {
			prev = temp;
			temp = temp.next;
			if (prev.data == 30) {
				prev.next=node;
				node.next=temp;
				break;
			}

		}

	}

	// list printing
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}

}
