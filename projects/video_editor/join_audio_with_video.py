from moviepy.editor import *

def welcome_to_program():
    print('Bem-vindo ao acelerador de vídeos usando python!')


def upload_files():
    video_path = input('Por favor, insira o nome do arquivo de vídeo: ')

    audio_path = input('Por favor, insira o nome do arquivo de audio: ')

    return video_path, audio_path


def join():
	video_path, audio_path = upload_files()
	video = VideoFileClip(video_path)
	audio = AudioFileClip(audio_path)
	final_video = video.set_audio(audio)
	output_path = "video_with_audio.mp4"
	final_video.write_videofile(output_path, codec='libx264', audio_codec='aac')


if __name__ == '__main__':
	welcome_to_program()
	join()
