from flask import Flask
from flask import render_template
from flask import request
from flask import redirect
from jogoteca_classes import Game

app = Flask(__name__)

game1 = Game('Tetris', 'Puzzle', 1984)
game2 = Game('God of war: Ragnarok', 'Ação e Aventura', 2022)
game3 = Game('League of Legends', 'MOBA', 2009)

games = [game1, game2, game3]

@app.route('/')
def index():
    return render_template('lista.html', titulo='Jogos', games=games)


@app.route('/novo')
def new_game():
    return render_template('novo.html', titulo='Adicionar Novo Jogo')


@app.route('/criar', methods=['POST',])
def create_game():
    nome = request.form['nome']
    categoria = request.form['categoria']
    console = request.form['console']

    game = Game(nome, categoria, console)
    games.append(game)

    return redirect('/')

app.run(debug=True)
