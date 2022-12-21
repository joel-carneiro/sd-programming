url = 'https://bytebank.com/cambio?moedaOrigem=real&moedaDestino=dolar&quantidade=100'

# Validação da URL
url = url.strip()
if url == '':
    raise ValueError('A string está VAZIA')
else:
    pass

# Separando dados
QUERY = url.find('?')
url_base = url[:QUERY]
url_parametros = url[QUERY+1:]

# Buscando o valor da variável
parametro = 'moedaOrigem'

index_parametro = url_parametros.find(parametro)
index_final = index_parametro + len(parametro) + 1
index_e_comercial = url_parametros.find('&', index_final)

if index_e_comercial == -1:
    valor = url_parametros[index_final:]
else:
    valor = url_parametros[index_final:index_e_comercial]

print(valor)