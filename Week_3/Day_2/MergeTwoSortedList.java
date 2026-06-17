package Week_3.Day_2;

// import Week_3.Day_2.MergeTwoSortedList.ListNode;

public class MergeTwoSortedList {
    class ListNode {
    int val;
    ListNode next;
    // Constructor to create a node
    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head= new ListNode(0);
        ListNode tail=head;
        while(list1!=null && list2!=null){
            if(list1.val <list2.val){
               tail.next=list1;
               list1=list1.next;
               tail=tail.next;
            }
            else {
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        } 
        tail.next=(list1!=null) ? list1:list2;
        return head.next;
    }
public static void main (String [] args ){
     MergeTwoSortedList obj = new MergeTwoSortedList();
     // list 1
     ListNode list1 = obj.new ListNode(1);
        list1.next = obj.new ListNode(3);
        list1.next.next = obj.new ListNode(5);
        //list 2
        ListNode list2 = obj.new ListNode(2);
        list2.next = obj.new ListNode(4);
        list2.next.next = obj.new ListNode(6);
         ListNode result = obj.mergeTwoLists(list1, list2);
         while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
}
}
