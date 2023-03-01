# Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.

notas = input('Insira notas do aluno separado por espaços: ').split()

print((int(notas[0]) + int(notas[1])) / 2)