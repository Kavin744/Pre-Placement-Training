from collections import deque

def bfs(graph, start):
    q = deque([start])
    visited = {start}
    while q:
        node = q.popleft()
        print(node, end=" ")
        for n in graph[node]:
            if n not in visited:
                visited.add(n)
                q.append(n)

bfs(g, 1)
