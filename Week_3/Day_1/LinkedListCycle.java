package Week_3.Day_1;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // start a slow and fast pointer 
        ListNode slowptr=head;
        ListNode fastptr=head;
        while (slowptr!=null && fastptr!=null && fastptr.next!=null){
            // adavnce both the pointer
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            // if they meats means we found a loop
            if(slowptr == fastptr){
                return true;
            }

        }
        return false;
    }
 public static void main(String[] args) {

        LinkedListCycle obj = new LinkedListCycle();
         ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
         fourth.next = second;

        System.out.println(obj.hasCycle(head));
 }
}
