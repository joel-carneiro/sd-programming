from moviepy.editor import *

# Método para imprimir as boas-vindas ao programa
def welcome_to_program():
    print('Bem-vindo ao contatenador de aúdio com vídeo usando python!')


# Método para carregar os arquivos
def upload_files():
    # Localizando o path da vídeo
    video_path = input('Por favor, insira o nome do arquivo de vídeo: ')

    # Localizando o path do aúdio
    audio_path = input('Por favor, insira o nome do arquivo de audio: ')
    
    # Retornando uma tupla com o path dos arquivos
    return video_path, audio_path


# Juntando vídeo com aúdio
def join():
	# Atribuindo os paths a variáveis
	video_path, audio_path = upload_files()

	# Criando um objeto do tipo VideoFileClip
	video = VideoFileClip(video_path)

	# Criando um objeto do tipo AudioFileClip
	audio = AudioFileClip(audio_path)

	# Juntando vídeo com aúdio
	final_video = video.set_audio(audio)

	# Definindo o nome do arquivo final
	output_path = "video_with_audio.mp4"

	# Gerando o arquivo final
	final_video.write_videofile(output_path, codec='libx264', audio_codec='aac')


# Executando o programa caso seja executado como principal
if __name__ == '__main__':
	welcome_to_program()
	join()
