from collections import Counter

text = '''Meu primeiro pensamento foi Deus, meu segundo pensamento foi a razão, meu terceiro e último pensamento foi o homem...
Verdade é o homem e não a razão abstrata, verdade é a vida e não o pensamento que fica no papel e encontra no papel a existência que se lhe atribui...
...a consciência que o homem tem de Deus é a consciência que o homem tem de si...
Deus é o espelho do homem...
...assim como o homem pensa e quais sejam os seus princípios, tal é o seu Deus: quanto o homem vale, tanto e não mais vale o seu Deus... Tu conheces o homem pelo seu Deus e, reciprocamente, Deus pelo homem: um e outro se identificam... Deus é o íntimo revelado, a essência do homem expressa: a religião é a revelação solene dos tesouros ocultos do homem, a revelação pública dos seus segredos de amor.
...o núcleo secreto da teologia é a antropologia.
Deus é uma lágrima de amor derramada no mais profundo segredo sobre a miséria humana. 
'''

contador = Counter(text.lower())

print(contador)
print(contador.most_common)