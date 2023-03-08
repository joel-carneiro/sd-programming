import requests
from bs4 import BeautifulSoup
import locale
from modelos import FII

locale.setlocale(locale.LC_ALL, 'pt_BR.UTF-8')

def trata_porcentagem(porcentagem_str: str):
    return locale.atof(porcentagem_str.split('%')[0])


def trata_decimal(decimal_str: str):
    return locale.atof(decimal_str)


# Definindo a URL e HEADERS
headers = {'User-Agent': 'Mozilla/5.0'}
resposta = requests.get('https://www.fundamentus.com.br/fii_resultado.php', headers=headers)
soup = BeautifulSoup(resposta.text, 'html.parser')
linhas = soup.find(id="tabelaResultado").find('tbody').find_all('tr')

# Programa

for linha in linhas:
    dados = linha.find_all('td')
    codigo = dados[0].text
    segmento = dados[1].text
    cotacao_atual = trata_decimal(dados[2].text)
    ffo_yield = trata_porcentagem(dados[3].text)
    dividiend_yield = trata_porcentagem(dados[4].text)
    p_vp = trata_decimal(dados[5].text)
    valor_mercado = trata_decimal(dados[6].text)
    liquidez = trata_decimal(dados[7].text)
    qt_imoveis = int(dados[8].text)
    preco_m2 = trata_decimal(dados[9].text)
    aluguel_m2 = trata_decimal(dados[10].text)
    cap_rate = trata_porcentagem(dados[11].text)
    vacancia_media = trata_porcentagem(dados[12].text)

    fundo_imobiliario = FII(codigo, segmento, cotacao_atual, ffo_yield, dividiend_yield, p_vp, valor_mercado, liquidez, qt_imoveis, preco_m2, aluguel_m2, cap_rate, vacancia_media)
    
    print(fundo_imobiliario)