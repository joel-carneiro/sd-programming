from datetime import date
from pandas import read_csv
import matplotlib.pyplot as plt

class Psy:
	def __init__(self):
		print('BEM VINDO AO PSY! TENHA UMA EXCELENTÍSSIMA NOITE! (^-^)')
		print('-=-' * 19)
		self.info = None
		self.data = None


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


	def load_data(self, path):
		self.data = read_csv(path)


	def plot(self, var, title):
		plt.style.use('mplstyles/style.mplstyle')

		plt.figure(figsize=(8, 5))

		plt.plot(self.data['day'], self.data[var])

		plt.title(title)

		plt.savefig(f'graphs/{title}.png')

		plt.close()



if __name__ == '__main__':
	psy = Psy()

	psy.collect_information()

	psy.store_information(path='data/psydata.csv')

	psy.load_data('data/psydata.csv')

	print(psy.data)

	psy.plot(var='study', title='Variação de Estudo')
	psy.plot('train', 'Variação de Treino')
	psy.plot('meditation', 'Variação de Meditação')
	psy.plot('mood', 'Variação de Humor')
