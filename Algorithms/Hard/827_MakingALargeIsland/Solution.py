class Solution:    
    ISLAND_MARK = 1

    def _is_in_boundary(self, row_index: int, column_index: int) -> bool:
        if (row_index < self._row_num and row_index >= 0) and \
                (column_index < self._column_num and column_index >= 0):
                return True

        return False

    def _get_island_size(self, 
                        grid: List[List[int]], 
                        visited: List[List[int]], 
                        group_id: int,
                        row_index: int, 
                        column_index: int) -> int:        
        #                 [ up,      down,   left,    right]
        four_directions = [(0, -1), (0, 1), (-1, 0), (1, 0)]

        queue = []
        island_size = 1

        queue.append((row_index, column_index))         

        while queue:
            row_index, column_index = queue.pop(0)             
            visited[row_index][column_index] = group_id

            for direction in four_directions:       
                next_row_index = row_index + direction[1]
                next_col_index = column_index + direction[0]
                
                if self._is_in_boundary(next_row_index, next_col_index):                    
                    is_part_island = grid[next_row_index][next_col_index] == Solution.ISLAND_MARK
                    is_visited = visited[next_row_index][next_col_index] != -1
                    
                    if is_part_island and not is_visited:                        
                        island_size += 1                        
                        visited[next_row_index][next_col_index] = group_id
                        queue.append((next_row_index, next_col_index))

        return island_size

    def _get_max_island_size(self, 
                            grid: List[List[int]], 
                            visited: List[List[int]], 
                            group_id_island_count_map: Dict[int, int], 
                            row_index: int, 
                            column_index: int) -> int:
        #                 [ up,      down,   left,    right]
        four_directions = [(0, -1), (0, 1), (-1, 0), (1, 0)]

        island_size = 1        
        group_ids = []
        for direction in four_directions:       
            next_row_index = row_index + direction[1]
            next_col_index = column_index + direction[0]

            if self._is_in_boundary(next_row_index, next_col_index):                    
                is_part_island = grid[next_row_index][next_col_index] == Solution.ISLAND_MARK
                
                if is_part_island:
                    group_id = visited[next_row_index][next_col_index]
                    group_ids.append(group_id)        

        # using set() to make sure, not to add same group id more than once
        for group_id in set(group_ids):            
            island_size += group_id_island_count_map[group_id]        

        return island_size

        

    def largestIsland(self, grid: List[List[int]]) -> int:
        self._row_num = len(grid)
        self._column_num = len(grid[0])

        visited = [[-1]*self._column_num for _ in range(self._row_num)]
        
        group_id = 1
        group_id_island_count_map = {}
        # will be runnning BFS to explore islands.
        for row_index in range(self._row_num):
            for column_index in range(self._column_num):
                if grid[row_index][column_index] == 1 and visited[row_index][column_index] == -1:                    
                    island_size = self._get_island_size(grid, visited, group_id, row_index, column_index)
                    group_id_island_count_map[group_id] = island_size
                    group_id += 1

        max_island_size = -1
        # now searching for max island size
        for row_index in range(self._row_num):
            for column_index in range(self._column_num):
                if grid[row_index][column_index] == 0:                                        
                    max_island_size = max(max_island_size, self._get_max_island_size(grid, visited, group_id_island_count_map, row_index, column_index))

        if max_island_size == -1:
            # it means there is no zero in the grid, so the whole grid is the island
            max_island_size = self._row_num * self._column_num
        
        return max_island_size
