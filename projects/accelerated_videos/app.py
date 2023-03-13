# Importando a classe necessária para acelerar vídeos, além de outras funções
from moviepy.editor import *

# Uma função simples de boas vindas
def welcome_to_program():
    print('Bem-vindo ao acelerador de vídeos usando python!')


# Função para carregar os vídeo original, essa assume que o vídeo está no mesmo diretório do arquivo python
def upload_files():
    # Lendo o nome do vídeo original
    video_name = input('Por favor, insira o nome do arquivo: ')

    # Definindo o nome do vídeo acelerado
    accelerated_video_name = 'accelerated_' + video_name

    # Retornando uma tupla contendo os nomes do vídeo original, e vídeo acelerado
    return video_name, accelerated_video_name


# Função para acelerar o vídeo
def speedup_video():
    # Carregando e definindo o nome do vídeo original
    video_name, accelerated_video_name = upload_files()

    # Instânciando um objeto do tipo VideoFileClip com o vídeo original
    clip = VideoFileClip(video_name)

    # Definindo a velocidade desejada
    velocity = int(input('Agora, insira a velocidade a ser adicionada ao vídeo: '))

    # Chamando o método speedx para acelerar o objeto que contém o vídeo na velocidade desejada pelo usuário
    accelerated_clip = clip.speedx(velocity)

    # Criando um novo arquivo com o objeto acelerado
    accelerated_clip.write_videofile(accelerated_video_name)


# Executando a função caso o arquivo seja o principal
if __name__ == '__main__':
    welcome_to_program()
    speedup_video()