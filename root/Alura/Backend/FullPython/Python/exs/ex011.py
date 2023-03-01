# Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a
# quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma área de
# 2 metros quadrados.

altura = float(input('altura ? '))
largura = float(input('largura ? '))

area = largura * altura

print(f'Área: {area}, quantidade de tinta: {area / 2}L')