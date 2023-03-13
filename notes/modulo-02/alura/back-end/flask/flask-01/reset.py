import pickle
from jogoteca_classes import Game

default_games = [
    Game('The Last of Us', 'Survival', 'PS3'),
    Game('God of War Ragnarok', 'Ação e Aventura', 'PS5'),
    Game('Fallout 4', 'Ação', 'PS4')
]

pickle.dump(default_games, open('games.sav', 'wb'))