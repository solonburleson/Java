public class SLL {
    public Node head;
    public SLL() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    
    public void remove(){
        Node runner = this.head;
        if(runner == null){
            System.out.println("List is empty");
        } else if(runner.next == null){
            this.head = null;
        } else {
            Node prev = this.head;
            runner = runner.next;
            while(runner.next != null){
                prev = prev.next;
                runner = runner.next;
            }
            prev.next = null;
        }
    }
    
    public void printValues(){
        Node runner = this.head;
        if(runner == null){
            System.out.println("List is empty");
        } 
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public void findInt(Integer val){
        Node runner = this.head;
        Integer idx = 0;
        if(runner == null){
            System.out.println("List is empty");
        }
        while(runner != null){
            if(runner.value == val){
                System.out.println("Value " + val + " found at index " + idx);
                break;
            }
            runner = runner.next;
            idx++;
            if(runner == null){
                System.out.println(val + " not found in list");
            }
        }
    }

    public void removeAt(Integer index){
        Node runner = this.head;
        Node prev = this.head;
        Integer idx = 0;
        if(runner == null){
            System.out.println("List is empty");
        }
        if(index == 0){
            this.head = runner.next;
        }
        runner = runner.next;
        idx++;
        while(runner != null){
            if(index == idx){
                prev.next = runner.next;
            }
            runner = runner.next;
            prev = prev.next;
            idx++;
        }
        if(index > idx){
            System.out.println("Not enough nodes in the list");
        }
    }
}