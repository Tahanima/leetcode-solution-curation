class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None

        while head != None:
            next = head.next
            head.next = prev
            prev = head
            head = next

        return prev
