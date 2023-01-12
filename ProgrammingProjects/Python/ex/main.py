import pyautogui as pag
from time import sleep

sleep(7)

pag.click()

t = 0.01
size = 400
delta = 5

for i in range(0, 40, 1):
    pag.drag(size, 0, t)
    pag.drag(0, size, t)
    size -= delta
    pag.drag(-size, 0, t)
    pag.drag(0, -size, t)
    size -= delta

