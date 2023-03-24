import string
import random
from time import sleep

GREEN = "\033[0;32m"

x = input('char: ')
y = input('brick: ')
v = float(input('velocity: '))

T = v ** (-1)

char = GREEN + x
line = y * (81 - len(x))
line = list(line)

while True:
    for i in range(0, len(line), 1):
        line[i] = char
        print("".join(line))
        line = y * 80
        line = list(line)
        sleep(T)

    for i in range(0, len(line), 1):
        line[-i] = char
        print("".join(line))
        line = y * 80
        line = list(line)
        sleep(T)
