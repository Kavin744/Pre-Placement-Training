def dfs(graph, start, visited=set()):
    visited.add(start)
    print(start, end=" ")
    for n in graph[start]:
        if n not in visited:
            dfs(graph, n, visited)

g = {1:[2,3],2:[4],3:[],4:[]}
dfs(g, 1)
