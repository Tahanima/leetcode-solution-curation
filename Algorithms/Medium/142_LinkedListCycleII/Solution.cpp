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
                ListNode *T1 = head, *T2 = tortoise;
                int position = 0;
                while (1)
                {
                    if (T1 == T2)
                    {
                        printf("tail connects to node index %d\n", position);
                        return T1;
                    }
                    T1 = T1->next;
                    T2 = T2->next;
                    position++;
                }
            }
        }
        printf("no cycle\n");
        return NULL;
    }
};