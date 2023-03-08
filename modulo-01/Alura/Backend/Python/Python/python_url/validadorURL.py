import re

url = 'https://bytebank.com/cambio'
padrao_URL = re.compile('(http(s)?://)?(www.)?bytebank.com(.br)?/cambio')
match = padrao_URL.match(url)

if not match:
    raise ValueError('A URL não é VÁLIDA.')

print('A URL é válida')