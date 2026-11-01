class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Ensure list1 starts with the smaller head
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode temp = list1;
        ListNode temp2 = list2;

        while (temp.next != null && temp2 != null) {
            if (temp.next.val <= temp2.val) {
                temp = temp.next;
            } else {
                ListNode nextTemp2 = temp2.next;
                temp2.next = temp.next;
                temp.next = temp2;
                temp = temp2;
                temp2 = nextTemp2;
            }
        }

        // Attach remaining nodes
        if (temp.next == null) {
            temp.next = temp2;
        }

        return list1;
    }
}