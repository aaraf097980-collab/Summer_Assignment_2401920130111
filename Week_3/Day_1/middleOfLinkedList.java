package Week_3.Day_1;
     // week_3 Day_1 : Middle of the Linked list
public class middleOfLinkedList {
   static class ListNode {
    int val;
    ListNode next;
    // Constructor to create a node
    ListNode(int val) {
        this.val = val;
    }
}
public ListNode middleNode(ListNode head) {
        ListNode slowptr =head;
        ListNode fastptr =head;
        //treverse until the fast pointer reaches 
        //the last node or null 
        while (fastptr!=null && fastptr.next!=null){
            // slwptr moves one node 
            slowptr=slowptr.next;
            // fastptr moves 2 node 
            fastptr=fastptr.next.next;
        }
        // ate the end print the sloptr
        return  slowptr;
    }
    public static void main(String[] args) {
        middleOfLinkedList obj = new middleOfLinkedList();
         ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
            head.next = second;
           second.next = third;
            third.next = fourth;
           fourth.next = fifth;
       ListNode middle = obj.middleNode(head);
         System.out.print("[");

       while (middle != null) {
        System.out.print(middle.val);

        if (middle.next != null) {
            System.out.print(",");
        }

        middle = middle.next;
    }

    System.out.println("]");
}
    }
    

