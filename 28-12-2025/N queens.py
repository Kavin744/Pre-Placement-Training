def solve_n_queens(n):
    board = [-1]*n
    res = []

    def safe(row, col):
        for r in range(row):
            if board[r] == col or abs(board[r] - col) == row - r:
                return False
        return True

    def backtrack(row):
        if row == n:
            res.append(board[:])
            return
        for col in range(n):
            if safe(row, col):
                board[row] = col
                backtrack(row + 1)

    backtrack(0)
    return res

print(len(solve_n_queens(8)))
