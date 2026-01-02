import heapq

def dijkstra(graph, src):
    pq = [(0, src)]
    dist = {v: float('inf') for v in graph}
    dist[src] = 0
    while pq:
        d,u = heapq.heappop(pq)
        for v,w in graph[u]:
            if d + w < dist[v]:
                dist[v] = d + w
                heapq.heappush(pq, (dist[v], v))
    return dist
