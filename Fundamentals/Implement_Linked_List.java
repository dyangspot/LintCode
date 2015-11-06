Class Node{
	Node next = null;
	int val = null;

	public Node(int val){
		this.val = val;
	}

	public void addToTail(Node node){
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = node;
	}

	public delete(Node head,int d){
		Node n = head;
		if(n.val == d){
			return head.next;
		}

		while(n.next != null){
			if(n.val == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}

}