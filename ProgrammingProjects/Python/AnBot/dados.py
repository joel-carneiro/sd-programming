import requests
import json
import locale

locale.setlocale(locale.LC_MONETARY, 'pt_BR.UTF-8')

# Extraindo moedas
def extrair_moedas():
    coins = requests.get('https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL').json()
    bitcoin_pure = float(coins['BTCBRL']['bid']) * 1000
    dolar_pure = float(coins['USDBRL']['bid'])
    euro_pure = float(coins['EURBRL']['bid'])

    euro = locale.currency(euro_pure, grouping=True)
    dolar = locale.currency(dolar_pure, grouping=True)
    bitcoin = locale.currency(bitcoin_pure, grouping=True)

    return {'EUR': euro, 'USD': dolar, 'BTC': bitcoin}


# Extraindo PIB per CAPITA
def exportacoes():
    exportacoes_r = requests.get('https://servicodados.ibge.gov.br/api/v1/paises/BR/indicadores/77825').json()
    lista_exportacoes = exportacoes_r[0]['series'][0]['serie']
    exportacoes_2020_pure = int(lista_exportacoes[-2]['2020'])
    exportacoes_2019_pure = int(lista_exportacoes[-3]['2019'])

    exportacoes_2020 = locale.currency(exportacoes_2020_pure, grouping=True)
    exportacoes_2019 = locale.currency(exportacoes_2019_pure, grouping=True)

    return {'2020': exportacoes_2020, '2019': exportacoes_2019}

# Extraindo valor da Gasolina

def extrair_treasury_yield():

    req = requests.get(f'https://www.alphavantage.co/query?function=TREASURY_YIELD&interval=monthly&maturity=10year&apikey=demo').json()

    last_value = req['data'][0]['value']

    return last_value