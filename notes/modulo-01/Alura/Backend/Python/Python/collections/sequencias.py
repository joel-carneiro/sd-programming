idades = [17, 33, 95, 12, 9, 23, 10, 13, 45, 32, 11, 7, 76, 25, 93]
usuarios = [
    ("Guilherme", 38, 123),
    ("Joel", 35, 562),
    ("Marcelo", 33, 321),
    ("Henrique", 17, 675)
]
'''
for i in range(0, len(idades), 1):
    print(i, idades[i])
'''
for endereco, valor in list(enumerate(idades)):
    print(f'{endereco} x {valor}')

for nome, _, id in usuarios:
    print(id)

idades.sort()
