import adivinhacao
import forca
def escolher_jogo():
    print('Bem-vindo a nossa central de Jogos, Usuário123')
    print('Jogos disponíveis: [1] Adivinhação / [2] Forca')
    jogo = input('Escolha seu jogo: ')

    if jogo == '1':
        adivinhacao.jogar_adivinhacao()
    elif jogo == '2':
        forca.jogar_forca()

if __name__ == '__main__':
    escolher_jogo()
