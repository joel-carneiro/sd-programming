import telebot
import dados

with open('token.txt', 'r') as token_text:
    TOKEN = token_text.read()

bot = telebot.TeleBot(TOKEN)

texto = '''
Oi, sou o Anbot! :D

Tá afim de saber de alguns dados financeiros do Brasil agora?
Clique em extrair para receber as informações

/extrair

/sair

Caso queira receber esses dados automaticamentes diariamente, clique em registrar!

/registrar
'''

@bot.message_handler(commands=['registrar'])
def registrar(message):
    bot.reply_to(message, 'Registro realizado com sucesso, você irá receber atualizações diárias')

    print('Novo Registro!')

    with open('users.csv', 'a') as users:
        users.write(f'{message.from_user.id},{message.from_user.first_name}\n')


@bot.message_handler(commands=['extrair'])
def extrair(message):
    coins = dados.extrair_moedas()
    exportacoes = dados.exportacoes()
    treasury_yield = dados.extrair_treasury_yield()

    dados_financeiros = f'''
Esses são os dados da cotação de algumas moedas em relação ao Real.

    Dolar: {coins['USD']}
    Euro: {coins['EUR']}
    Bitcoin {coins['BTC']}

Exportações do Brasil nos anos de:

    2019: {exportacoes['2019']}
    2020: {exportacoes['2020']}

Última atualização do Treasury Yield: {treasury_yield}
    '''
    bot.reply_to(message, dados_financeiros)


@bot.message_handler(commands=['sair'])
def sair(message):
    bot.reply_to(message, 'A ignorância é uma virtudade. (as vezes)')


def verify(message):
    return True


@bot.message_handler(func=verify)
def send(message):
    bot.reply_to(message, texto)
    print('Nova mensagem')

bot.polling()