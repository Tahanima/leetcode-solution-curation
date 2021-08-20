/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution
{
public:
    ListNode *detectCycle(ListNode *head)
    {
        
        if (!head)
        {
            printf("no cycle\n");
            return NULL;
        }
        
        ListNode *tortoise = head, *hare = head;

        while (1)
        {
            if (!hare->next || !(hare->next)->next)
                break; // no cycle
            
            // move hare pointer 2 times and tortoise pointer 1 times
            tortoise = tortoise->next;
            hare = (hare->next)->next;
            
            if (hare == tortoise)
            {
                ListNode *tortoise1 = head, *tortoise2 = tortoise;
                int position = 0;
                
                while (1)
                {
                    
                    if (tortoise1 == tortoise2)
                    {
                        printf("tail connects to node index %d\n", position);
                        return tortoise1;
                    }
                    
                    tortoise1 = tortoise1->next;
                    tortoise2 = tortoise2->next;
                    position++;
                }
            }
        }
        
        printf("no cycle\n");
        return NULL;
    }
};
