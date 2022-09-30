from flag import flag
import z3
import angr
import random
b = 1
c = 2
secret = random.randint(1, 10000)
d = len(flag)
a = d
e = 0


while e < d * secret:
    flag = flag[0:c] + chr(ord(flag[c])+a) + flag[c+1:]
    a = (a + b) % 127
    b = b + a
    c = (c + a) % d
    e += 1
print(":".join("{:02x}".format(ord(char)) for char in flag))
