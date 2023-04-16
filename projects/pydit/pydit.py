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


speed = int(input("Qual a velocidade a se acelerar o vídeo ? "))
editor = Pydit('video.mp4')
editor.speed_up(speed)
editor.save('final_video.mp4')