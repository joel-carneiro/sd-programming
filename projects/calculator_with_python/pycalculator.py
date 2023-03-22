from tkinter import ttk
from tkinter import *


def pycalculate(event):
    pass    


def create_digit_button(frame, text, width, heigth, color, x, y):
    button = Button(frame, text=text, width=width, height=heigth,
    bg=color, font=('Ivy 13 bold'), relief=RAISED, overrelief=RIDGE)

    button.place(x=x, y=y)

    return button

