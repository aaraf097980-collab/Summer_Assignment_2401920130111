package Week_3.Day_2;

public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
     public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow =head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow =slow.next;
        }
        slow =reverseList(slow);
        fast=head;
        while (slow!=null){
            if(fast.val!=slow.val) return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
     private ListNode reverseList(ListNode head){
              ListNode currentNode=head;
        ListNode prev=null;
        ListNode nextNode;
        if(head==null){
            return null;
        }
        if(head.next==null) return head;

        while(currentNode !=null){
             nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
          currentNode = nextNode;
        }
    return    head =prev;
    }
    public static void main (String [] args){
        PalindromeLinkedList obj=new PalindromeLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(obj.isPalindrome(head));
    }
}
