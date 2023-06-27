class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        stack = []
        output_array = []

        if root is None:
            return output_array

        current = root

        while current is not None or stack:
            while current is not None:
                stack.append(current)
                current = current.left

            current = stack.pop()
            output_array.append(current.val)
            current = current.right
        
        return output_array