from collections import defaultdict

text = '''Se a nossa existência não tem por fim imediato a dor, pode dizer-se que não tem razão alguma de ser no mundo. Porque é absurdo admitir que a dor sem fim, que nasce da miséria inerente à vida e enche o mundo, seja apenas um puro acidente, e não o próprio fim. Cada desgraça particular parece, é certo, uma exceção, mas a desgraça geral é a regra.'''

lower_text = text.lower().split()

'''
aparicoes = dict()

for palavra in lower_text:
    ate_agora = aparicoes.get(palavra, 0)
    aparicoes[palavra] = ate_agora + 1
'''

aparcioes = defaultdict(int)

for palavra in lower_text:
    ate_agora = aparcioes.get(palavra, 0)
    aparcioes[palavra] = ate_agora + 1

print(aparcioes)