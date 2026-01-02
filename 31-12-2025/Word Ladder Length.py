from collections import deque

def ladder(begin, end, words):
    word_set = set(words)
    q = deque([(begin, 1)])

    while q:
        word, steps = q.popleft()
        if word == end:
            return steps
        for i in range(len(word)):
            for c in 'abcdefghijklmnopqrstuvwxyz':
                nxt = word[:i] + c + word[i+1:]
                if nxt in word_set:
                    word_set.remove(nxt)
                    q.append((nxt, steps+1))
    return 0

print(ladder("hit", "cog", ["hot","dot","dog","lot","log","cog"]))
