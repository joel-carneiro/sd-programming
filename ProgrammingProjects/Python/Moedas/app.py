import requests
from time import sleep
dados = int(input('Quantidade de dados para a extração: '))
for i in range(0, dados, 1):
    coins_requests = requests.get('https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL')
    coins = coins_requests.json()

    EURO = float(coins['EURBRL']['bid'])
    DOLAR = float(coins['USDBRL']['bid'])
    BITCOIN = float(coins['BTCBRL']['bid'])

    with open('euro.csv', 'a') as euro:
        euro.write(f'{EURO}\n')

    with open('dolar.csv', 'a') as dolar:
        dolar.write(f'{DOLAR}\n')

    with open('bitcoin.csv', 'a') as bitcoin:
        bitcoin.write(f'{BITCOIN}\n')
        
    print(f'Requisição {i} realizada com sucesso!')

    sleep(30)
    
