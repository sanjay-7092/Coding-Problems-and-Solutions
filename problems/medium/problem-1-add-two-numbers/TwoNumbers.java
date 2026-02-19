
public class TwoNumbers
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        if (l1 != null && l2 != null) {
            int tempSum = l1.val + l2.val;
            int tempAddOn = tempSum / 10;
            result.val = tempSum % 10;
            if (l1.next != null && l2.next != null) {
                l1.next.val += tempAddOn;
                result.next = addTwoNumbers(l1.next, l2.next);
            } else if (l1.next != null) {
                result.next = addTwoNumbers(l1.next, new ListNode(tempAddOn));
            } else if (l2.next != null) {
                result.next = addTwoNumbers(new ListNode(tempAddOn), l2.next);
            } else if (tempAddOn > 0) {
                result.next = new ListNode(tempAddOn);
            }
        }
        return result;
    }
    public static void main(String args[]){

    }
}