Given the head of a singly linked list, return true if it is a palindrome.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer>data = new ArrayList<>();
        
        ListNode one = head;
        
        while(one!=null)
        {
            data.add(one.val);
            one=one.next;
        }
        
        int start=0;
        int end=data.size()-1;
        while(start<end)
        {
            if(data.get(start)==data.get(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        
        return true;
            
    }
}

o(n)
o(1)
