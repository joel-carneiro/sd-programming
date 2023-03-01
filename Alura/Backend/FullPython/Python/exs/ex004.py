# Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações
# possíveis sobre ele.

key = input('? ')
print(type(key))
print(key.isalpha())
print(key.isalnum())
print(key.isdigit())
print(key.isspace())