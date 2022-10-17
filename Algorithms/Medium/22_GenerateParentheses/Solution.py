class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        res = []
        
        def parenthesis_backtrack(open_paren, close_paren):
            if open_paren == close_paren == n:
                res.append("".join(stack))
                return 
            
            if open_paren < n:
                stack.append("(")
                parenthesis_backtrack(open_paren + 1, close_paren)
                stack.pop()
            
            if open_paren > close_paren:
                stack.append(")")
                parenthesis_backtrack(open_paren, close_paren + 1)
                stack.pop()
                
        parenthesis_backtrack(0, 0)
        return res 