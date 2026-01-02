def rotate(matrix):
    matrix[:] = zip(*matrix[::-1])

m = [[1,2],[3,4]]
rotate(m)
print(list(map(list, m)))
