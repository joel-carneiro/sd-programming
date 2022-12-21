from random import randint

def jogar_adivinhacao():

    # Tabela de bem vindo
    bem_vindo = "= Jogo da adivinhação ="
    print('=' * len(bem_vindo))
    print(bem_vindo)
    print('=' * len(bem_vindo))

    # Selecionando o nível

    print('[1] Fácil / [2] Médio / [3] Díficil')
    nivel = input('Selecione o nível da dificuldade: ')
    if nivel == '1':
        tentativas = 20
    elif nivel == '2':
        tentativas = 10
    elif nivel == '3':
        tentativas = 5

    # Script do game

    numero_maquina = randint(1, 20)
    resultado = None
    score = 1000

    for i in range(0, tentativas, 1):
        numero_usuario = int(input('Adivinhe o número: '))
        if numero_maquina == numero_usuario:
            print(f'Você GANHOU! a máquina pensou no número {numero_maquina}')
            resultado = 'win'
            break
        else:
            print('Tente novamente! >:)')
            score = score - 50
    if resultado != 'win':
        print('Você perdeu! :D')
    print(f'Score final: {score}')

if __name__ == '__main__':
    jogar_adivinhacao()