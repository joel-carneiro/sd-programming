names_in_brazil = {
    "João": 2.3,
    "Guilherme": 0.89,
    "Fernandes": 0.03,
    "Maria": 3.3,
    "Joel": 0.7,
    "Henrique": 0.99
}

# Deletar um nome:

del names_in_brazil["Henrique"]

print(names_in_brazil)

# Interando:

for name in names_in_brazil:
    print(name)

for number in names_in_brazil.values():
    print(number)

for items in names_in_brazil.items():
    print(items)

