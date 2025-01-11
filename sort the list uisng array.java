class Solution {
    public ListNode sortList(ListNode head) {
       int c=0;
       ListNode curr=head;
       while(curr!=null){
        c++;
        curr=curr.next;
       }
       int[] a=new int[c];
       curr=head;
       for(int i=0;i<a.length;i++){
        if(curr!=null){
            a[i]=curr.val;
            curr=curr.next;
        }
       }
       Arrays.sort(a);
       ListNode dummy=new ListNode(0);
       ListNode d=dummy;
       for(int i=0;i<a.length;i++){
        d.next=new ListNode(a[i]);
        d=d.next;
       }
       return dummy.next;
    }
}