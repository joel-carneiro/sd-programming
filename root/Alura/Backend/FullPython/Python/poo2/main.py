from random import randint

class Programa:
    def __init__(self, nome, ano):
        self._nome = nome.title()
        self.ano = ano
        self._likes = 0


    def __str__(self) -> str:
        return f'{self.nome} - {self.ano}: {self.likes} Likes'
    

    @property
    def nome(self):
        return self._nome


    @property
    def likes(self):
        return self._likes


    @nome.setter
    def nome(self, novo_nome):
        self._nome = novo_nome.title()


    def dar_like(self):
        self._likes += 1


class Filme(Programa):
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self.duracao = duracao
    

    def __str__(self) -> str:
        return f'{self.nome} - {self.ano} - {self.duracao} min: {self.likes} Likes'


class Serie(Programa):
    def __init__(self, nome, ano, temporadas):
        super().__init__(nome, ano)
        self.temporadas = temporadas
    

    def __str__(self) -> str:
        return f'{self.nome} - {self.ano} - {self.temporadas} temporadas: {self.likes} Likes'
    

class Playlist:
    def __init__(self, nome, programas):
        self.nome = nome
        self._programas = programas


    def __getitem__(self, item):
        return self._programas[item]


    @property
    def listagem(self):
        return self._programas
    

    @property
    def tamanho(self):
        return len(self._programas)


    def __len__(self):
        return len(self._programas)
    

vingadores = Filme('vingadores: ultimato', 2019, 160)
sonic = Filme('sonic: o filme', 2018, 120)
coringa = Filme('coringa', 2018, 140)

breaking_bad = Serie('breaking bad', 2010, 5)
narcos = Serie('narcos', 2016, 5)
the_boys = Serie('the boys', 2020, 3)


for programa in [vingadores, sonic, breaking_bad, narcos, the_boys, coringa]:
    random = randint(0, 10000)
    for i in range(0, random, 1):
        programa.dar_like()


playlist_fds = Playlist('final de semana', [vingadores, sonic, breaking_bad, narcos, the_boys, coringa])


for programa in playlist_fds:
    print(programa)

print(f'Tamanho da playlist: {len(playlist_fds)}')