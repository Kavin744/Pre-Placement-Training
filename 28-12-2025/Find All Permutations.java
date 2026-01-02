def permute(s, l, r):
    if l == r:
        print("".join(s))
    for i in range(l, r):
        s[l], s[i] = s[i], s[l]
        permute(s, l+1, r)
        s[l], s[i] = s[i], s[l]

permute(list("ABC"), 0, 3)
