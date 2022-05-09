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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        
        if (list2 == null) {
            return list1;
        }
        
        ListNode mergedHead = null;
        ListNode temporaryHead = null;
        
        while (list1 != null || list2 != null) {
            if (list1 == null && list2 != null) {
                ListNode node = new ListNode(list2.val);
                
                if (mergedHead == null) {
                    mergedHead = node;
                } else {
                    temporaryHead.next = node;
                }
                
                temporaryHead = node;
                list2 = list2.next;
            } else if (list1 != null && list2 == null) {
                ListNode node = new ListNode(list1.val);
                
                if (mergedHead == null) {
                    mergedHead = node;
                } else {
                    temporaryHead.next = node;
                }
                
                temporaryHead = node;
                list1 = list1.next;
            } else {
               if (list1.val < list2.val) {
                   ListNode node = new ListNode(list1.val);
                   
                   if (mergedHead == null) {
                       mergedHead = node;
                   } else {
                       temporaryHead.next = node;
                   }
                   
                   temporaryHead = node;
                   list1 = list1.next;
               } else {
                   ListNode node = new ListNode(list2.val);
                   
                   if (mergedHead == null) {
                       mergedHead = node;
                   } else {
                       temporaryHead.next = node;
                   }
                   
                   temporaryHead = node;
                   list2 = list2.next;
               }
            }
        }
        
        return mergedHead;
    }
}