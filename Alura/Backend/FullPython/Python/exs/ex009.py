# Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.

number = int(input('? '))

for value in [number * i for i in range(1, 11, 1)]:
    print(value)