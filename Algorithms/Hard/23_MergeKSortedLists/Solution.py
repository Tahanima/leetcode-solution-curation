#Merge Sort approach
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
    
        if not lists:
                return None
        
        def mergeSort(listArray):
            
            ln = len(listArray)
            if ln <= 1:
                return listArray[0]

            # dividing the list into two halves each time
            mid = ln // 2
            leftList = listArray[:mid]
            rightList = listArray[mid:ln]

            l = mergeSort(leftList)
            r = mergeSort(rightList)
            
            return merge(l, r)
            
        
        def merge(l1, l2):
            
            dummy = ListNode()
            looper = dummy
            while l1 and l2:
                if l1.val > l2.val:
                    looper.next = l2
                    l2 = l2.next
                else:
                    looper.next = l1
                    l1 = l1.next
                looper = looper.next
            if l1:
                looper.next = l1
            else:
                looper.next = l2
            
            return dummy.next
        
        return mergeSort(lists)
        
        
        