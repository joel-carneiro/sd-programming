import requests
import datetime
from time import sleep
import locale

locale.setlocale(locale.LC_MONETARY, 'pt_BR.UTF-8')

# Declarando a URL da API
url = 'https://api.coingecko.com/api/v3/coins/bitcoin?localization=false&tickers=false&market_data=true&community_data=false&developer_data=false&sparkline=false'

# Definindo função de requisição
def extrair_bitcoin():
    r = requests.get(url)
    data = r.json()
    bitcoin_brl = data['market_data']['current_price']['brl']

    today = datetime.date.today()
    hour = datetime.datetime.now().hour
    minutes = datetime.datetime.now().minute
    seconds = datetime.datetime.now().second

    req = f'{bitcoin_brl},{today},{hour},{minutes},{seconds}\n'
    with open('data.csv', 'a') as var_data:
        var_data.write(req)

    print(f'\033[32mRequisição realizada com sucesso\033[m: \033[36m{locale.currency(bitcoin_brl, grouping=True)}\033[m')
    sleep(30)

# Execução do programa

def bem_vindo():
    bemvindo = '\033[32mEXTRAÇÃO DE VALORES DA BITCOIN\033[m'
    print('=' * 30)
    print(bemvindo)
    print('=' * 30)

    print('''
Moeda origem: \033[33mBitcoin (BTC)\033[m
Moeda destino: \033[34mReal (BRL)\033[m
Requisição a cada: \033[31m30 segundos\033[m

Digite abaixo, quantas requisições deseja fazer [Digite "i" para realizar indefinidamente]
(Lembre-se, cada requisição demora \033[31m30 segundos\033[m para ser realizada.)
    ''')

bem_vindo()

time = input('>>> ')

if time == 'i':
    time = '0'
else:
    time = time


c = 1
while True:
    extrair_bitcoin()
    if time == c:
        break
    c += 1