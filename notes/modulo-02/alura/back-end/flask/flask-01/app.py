# Importando as bibliotecas necessárias para o aplicativo
from flask import request
from flask import render_template
from flask import redirect
from flask import session
from flask import flash

from jogoteca_classes import Game

import pickle

# Criando a instância do aplicativo
app = Flask(__name__)

# Definindo a chave secreta do aplicativo
app.secret_key = '123'

# Carregando os jogos salvos em um arquivo pickle
games = pickle.load(open('games.sav', 'rb'))


# Definindo a rota principal do aplicativo
@app.route('/')
def index():
	# Renderizando a template 'index.html' com a lista de jogos
	return render_template('index.html', title='Lista de Jogos', games=games)


# Definindo a rota para adicionar um novo jogo
@app.route('/new_game')
def new_game():
	# Verificando se o usuário está logado ou redirecionando para a página de login
	if 'USER' not in session or session['USER'] == None:
		return redirect('/login?next=new_game')
	# Renderizando a template 'new.html' para adicionar um novo jogo
	return render_template('new.html', title='Adicionar um novo Jogo')


# Definindo a rota para criar um novo jogo
@app.route('/create', methods=['POST'])
def create_new_game():
	# Obtendo os dados do novo jogo do formulário
	name = request.form['nome']
	category = request.form['categoria']
	console = request.form['console']

	# Criando uma nova instância da classe Game com os dados do novo jogo
	new_game = Game(name, category, console)
	# Adicionando o novo jogo à lista de jogos
	games.append(new_game)

	# Salvando a lista de jogos em um arquivo pickle
	pickle.dump(games, open('games.sav', 'wb'))

	# Redirecionando de volta para a página para adicionar um novo jogo
	return redirect('/new_game')

à
# Definindo a rota para a página de login
@app.route('/login')
def login():
	# Renderizando a template 'login.html'
	return render_template('login.html')


# Definindo a rota para autenticar o usuário
@app.route('/auth', methods=['POST'])
def auth():
	# Obtendo as credenciais do usuário do formulário
	user = request.form['usuario']
	password = request.form['senha']

	# Verificando se as credenciais são válidas
	if password == '123':
		# Armazenando o nome do usuário na sessão
		session['USER'] = user
		# Exibindo uma mensagem de boas-vindas
		flash(f'Bem-vindo a Jogoteca, {user}!')
		# Redirecionando para a página para adicionar um novo jogo
		return redirect('/new_game')
	else:
		# Exibindo uma mensagem de erro e redirecionando de volta para a página de login
		flash(f'Senha ou usuário incorretos!')
		return redirect('/login')


# Definindo a rota para fazer logout
@app.route('/logout')
def logout():
	# Removendo o nome do usuário da sessão
	session['USER'] = None
	# Exibindo uma mensagem de logout e redirecionando para a página principal
	flash('Logout efetuado com sucesso!')
	return redirect('/')


# Executando o aplicativo em modo de depuração
app.run(debug=True)
