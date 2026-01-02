def solve(board):
    for i in range(9):
        for j in range(9):
            if board[i][j] == 0:
                for n in range(1,10):
                    if valid(board, i, j, n):
                        board[i][j] = n
                        if solve(board):
                            return True
                        board[i][j] = 0
                return False
    return True

def valid(board, r, c, n):
    for i in range(9):
        if board[r][i] == n or board[i][c] == n:
            return False
    br, bc = r//3*3, c//3*3
    for i in range(3):
        for j in range(3):
            if board[br+i][bc+j] == n:
                return False
    return True
