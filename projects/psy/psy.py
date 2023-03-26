from datetime import date
from pandas import read_csv
import matplotlib.pyplot as plt


def times_series(data, variable, title):
	plt.style.use('mplstyles/style.mplstyle')

	plt.figure(figsize=(8, 5))

	plt.plot(data['day'], data[variable])

	plt.title(title)

	plt.savefig(f'graphs/{title}.png')

	plt.close()


class Psy:
	def __init__(self):
		print('BEM VINDO AO PSY! TENHA UMA EXCELENTÍSSIMA NOITE! (^-^)')
		print('-=-' * 19)
		self.info = None


	def collect_information(self):
		today = str(date.today())
		study = input('Tempo de estudo (Horas) ? ')
		train = input('Tempo de treino (Minutos) ? ')
		meditation = input('Tempo de meditação (Minutos) ? ')
		social_media = input('Usou redes sociais hoje (1 ou 0) ? ')
		mood = input('Seu humor: (0 ~ 10) ? ')

		self.info = [
		today, study, train, meditation,
		social_media, mood
		]


	def store_information(self, path):
		line_data = ",".join(self.info)

		with open(path, 'a') as file:
			file.write(line_data + '\n')


	def plot(self):

		df = read_csv('data/psydata.csv')

		times_series(df, 'study', 'Tempo de Estudo')
		times_series(df, 'train', 'Tempo de Treino')    
		times_series(df, 'meditation', 'Tempo de Meditação')    
		times_series(df, 'mood', 'Variação de Humor')   


if __name__ == '__main__':
	psy = Psy()
	psy.collect_information()
	psy.store_information(path='data/psydata.csv')
	psy.plot()