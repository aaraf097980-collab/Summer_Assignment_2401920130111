package Week_3.Day_2;

public class RemoveNthNodeFromEnd {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
     public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode firstptr=dummy;
        ListNode secondptr=dummy;
        // move second pointer n spaces ahead
        for (int i=0;i<n;i++){
            secondptr=secondptr.next;
        }
        // move both now until the next of second pointer is null
        while (secondptr.next!=null){
            firstptr=firstptr.next;
            secondptr=secondptr.next;
        }
        // now we have to remove the node next of ptr
        firstptr.next=firstptr.next.next;
        return dummy.next;
     }
     public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
     public static  void main (String [] args){
        RemoveNthNodeFromEnd obj=new RemoveNthNodeFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(head);
        int n = 2;
        head = obj.removeNthFromEnd(head, n);
        System.out.println("After Removing " + n + "th Node From End:");
        printList(head);
     }
}
