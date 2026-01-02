from collections import deque

def shortest_path(grid):
    n, m = len(grid), len(grid[0])
    if grid[0][0] == 1 or grid[n-1][m-1] == 1:
        return -1

    directions = [(1,0), (-1,0), (0,1), (0,-1)]
    queue = deque([(0, 0, 1)])  # (row, col, distance)
    visited = set((0, 0))

    while queue:
        r, c, dist = queue.popleft()

        if r == n - 1 and c == m - 1:
            return dist

        for dr, dc in directions:
            nr, nc = r + dr, c + dc
            if 0 <= nr < n and 0 <= nc < m and grid[nr][nc] == 0 and (nr, nc) not in visited:
                visited.add((nr, nc))
                queue.append((nr, nc, dist + 1))

    return -1


# Example
grid = [
    [0, 0, 0],
    [1, 1, 0],
    [0, 0, 0]
]

print(shortest_path(grid))
