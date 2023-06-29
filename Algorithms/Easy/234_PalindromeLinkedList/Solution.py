class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        fast, slow = head, head

        while fast != None and fast.next != None:
            fast = fast.next.next
            slow = slow.next

        slow = self.reverse(slow)
        fast = head

        while slow != None:
            if fast.val != slow.val:
                return False 
            
            fast = fast.next
            slow = slow.next
        
        return True

    def reverse(self, head):
        prev = None

        while head != None:
            next = head.next
            head.next = prev
            prev = head
            head = next  
        
        return prev