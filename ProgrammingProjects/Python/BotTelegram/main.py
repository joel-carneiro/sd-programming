import telebot
# Bot

CHAVE = '5975848743:AAHBZw-D0y-Ik8wujgQ-xSklF4p2ejrksH8'
texto_padrao = '''
Oi, tudo certo? :D
Sou o AnBot e posso informar dados financeiros que podem afetar sua vida diretamente ou indiretamente.
Como o valor do dolar, euro, bitcoin, e até como está nossa IBOVESPA!

Eae, vai querer meus serviços? ;)

/sim
/nao

[Create by: Joel Carneiro]
'''

bot = telebot.TeleBot(CHAVE)


# Funções

@bot.message_handler(commands=['sim'])
def sim(mensagem):
    bot.send_message(mensagem.chat.id, 'Bem vindo, vou te enviar atualizações todo dias as 21h00min!')


@bot.message_handler(commands=['nao'])
def nao(mensagem):
    bot.send_message(mensagem.chat.id, 'Que pena, você deve me achar um inutil igual meu criador né? =(')


def verificar(mensagem):
    return True


@bot.message_handler(func=verificar)
def responder(mensagem):
    bot.reply_to(mensagem, texto_padrao)


bot.polling()
