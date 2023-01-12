import pyautogui as pag
from time import sleep

horizontal = 500
vertical = 500

sleep(5)

while True:
    pag.move(xOffset=horizontal, yOffset=0, duration=0.2)
    pag.move(xOffset=0, yOffset=vertical, duration=0.2)
    pag.move(xOffset=-horizontal, yOffset=0, duration=0.2)
    pag.move(xOffset=0, yOffset=-vertical, duration=0.2)