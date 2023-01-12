import requests
import datetime
import locale

locale.setlocale(locale.LC_MONETARY, locale='pt_BR.UTF-8')

def extract_bitcoin():
    url = 'https://api.coingecko.com/api/v3/coins/bitcoin?localization=false&tickers=false&market_data=true&community_data=false&developer_data=false&sparkline=false'

    r = requests.get(url)
    data = r.json()
    bitcoin = data['market_data']['current_price']['brl']

    today = datetime.date.today()
    hour = datetime.datetime.now().hour
    minutes = datetime.datetime.now().minute
    seconds = datetime.datetime.now().second

    now_time = f'{today} ás {hour}:{minutes}:{seconds}'

    return (locale.currency(bitcoin, grouping=True), now_time)

