from collections import Counter

with open("data.txt") as f:
    words = f.read().split()

print(Counter(words))
