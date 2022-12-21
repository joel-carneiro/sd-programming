import random

def revela(palavra, chute):
    c = 0
    for letra in palavra.replace(chute, ''):
        palavra = palavra.replace(letra, '_')
    return palavra

def jogar_forca():
    palavras = ['banana', 'manga', 'abacaxi', 'morango', 'abacate', 'ameixa']
    winner = False
    loser = False
    chances = 5
    palavra_secreta = random.choice(palavras)

    print('TEMA: FRUTAS \n')

    while not winner and not loser:
        chute = input('Digite seu chute: ').lower()
        chances = chances - 1
        if chute == palavra_secreta:
            winner = True
            print('Você ganhou!')
        else:
            print(revela(palavra_secreta, chute))
            if chances <= 0:
                loser = True
            else:
                print(f'Você ainda tem {chances} tentativas.')
    if loser == True:
        print('Você perdeu :(')

if __name__ == '__main__':
    jogar_forca()
