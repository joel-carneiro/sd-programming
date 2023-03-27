from moviepy.editor import VideoFileClip, AudioFileClip


class Pydit:
    def __init__(self, video_name):
        self.path_video = video_name
        self.clip = VideoFileClip(video_name)
        self.audio = None
    

    def join(self, audio_name):
        self.audio = AudioFileClip(audio_name)
        self.clip = self.clip.set_audio(self.audio)


    def speed_up(self, velocity):
        self.clip = self.clip.speedx(velocity)
    

    def save(self, name):
        self.clip.write_videofile(name, codec='libx264', audio_codec='aac')


quantum = int(input("Você pretende juntar quantos vídeos ? "))

videos_names = [f'input/video{n}.mp4' for n in range(1, quantum+1, 1)]
audios_names = [f'input/audio{n}.ogg' for n in range(1, quantum+1, 1)]

for i in range(0, quantum, 1):
    editor = Pydit(videos_names[i])
    editor.join(audios_names[i])
    editor.save(f'output/final_video{i+1}.mp4')