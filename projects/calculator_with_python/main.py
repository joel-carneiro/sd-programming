# Importando módulos necessários
from tkinter import *
from tkinter import ttk
from pycalculator import create_digit_button

# Definindo constantes
BLACK = "#1c1b1b"
WHITE = "#f0f0f0"
BLUE = "#032f5e"
ORANGE = "#f78731"
GREY = "#808080"

# Gerando o objeto janela
window = Tk()
window.title("Pyculadora")
window.geometry("235x310")
window.config(bg=WHITE)

# Definindo quadros da janela

## O quadro da tela
screen_frame = Frame(window, width=270, height=50, bg=BLUE)
screen_frame.grid(row=0, column=0)

## O quadro do corpo
body_frame = Frame(window, width=270, height=268, bg=WHITE)
body_frame.grid(row=1, column=0)

# Definindo os botões

# Primeira linha

button_clean = create_digit_button(
    frame=body_frame, text='C', width=8, heigth=2, color=WHITE, x=0, y=0)

button_mode = create_digit_button(
    frame=body_frame, text='%', width=4, heigth=2, color=WHITE, x=105, y=0)

button_division = create_digit_button(
    frame=body_frame, text='/', width=4, heigth=2, color=ORANGE, x=170, y=0)

# Segunda linha


button_09 = create_digit_button(
    frame=body_frame, text='9', width=3, heigth=2, color=WHITE, x=0, y=52)

button_08 = create_digit_button(
    frame=body_frame, text='8', width=3, heigth=2, color=WHITE, x=55, y=52)

button_07 = create_digit_button(
    frame=body_frame, text='7', width=4, heigth=2, color=WHITE, x=110, y=52)

button_multiply = create_digit_button(
    frame=body_frame, text='*', width=4, heigth=2, color=ORANGE, x=170, y=52)

# Terceira linha

button_06 = create_digit_button(
    frame=body_frame, text='6', width=3, heigth=2, color=WHITE, x=0, y=104)

button_05 = create_digit_button(
    frame=body_frame, text='5', width=3, heigth=2, color=WHITE, x=55, y=104)

button_04 = create_digit_button(
    frame=body_frame, text='4', width=4, heigth=2, color=WHITE, x=110, y=104)

button_sub = create_digit_button(
    frame=body_frame, text='-', width=4, heigth=2, color=ORANGE, x=170, y=104)

## Quarta linha

button_03 = create_digit_button(
    frame=body_frame, text='3', width=3, heigth=2, color=WHITE, x=0, y=156)

button_02 = create_digit_button(
    frame=body_frame, text='2', width=3, heigth=2, color=WHITE, x=55, y=156)

button_01 = create_digit_button(
    frame=body_frame, text='1', width=4, heigth=2, color=WHITE, x=110, y=156)

button_sum = create_digit_button(
    frame=body_frame, text='+', width=4, heigth=2, color=ORANGE, x=170, y=156)

## Última linha

button_zero = create_digit_button(
    frame=body_frame, text='0', width=8, heigth=2, color=WHITE, x=0, y=208)

button_point = create_digit_button(
    frame=body_frame, text='.', width=4, heigth=2, color=WHITE, x=105, y=208)

button_equals = create_digit_button(
    frame=body_frame, text='=', width=4, heigth=2, color=ORANGE, x=170, y=208)


# Deixando a janela aberta
window.mainloop()