package Week_3.Day_1;
    class ListNode {
    int val;
    ListNode next;
    // Constructor to create a node
    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseLinkedList {
     public ListNode reverseList(ListNode head) {
        ListNode currentNode=head;
        ListNode prev=null;
        ListNode nextNode;
        if(head==null){
            return null;
        }
        if(head.next==null) return head;
        // traverse the entire linked list 
        while(currentNode !=null){
             // Store the next node
             nextNode = currentNode.next;
             // reverse the current node pointer
            currentNode.next = prev;
            // Move prev one step ahead
            prev = currentNode;
               // Move currentNode one step ahead
          currentNode = nextNode;
        }
    return    head =prev;
    }
    public void display(ListNode head) {
        ListNode temp = head;
      while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        ReverseLinkedList obj = new ReverseLinkedList();
       ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original List:");
        obj.display(head);

        head = obj.reverseList(head);

        System.out.println("Reversed List:");
        obj.display(head);
    }
}
