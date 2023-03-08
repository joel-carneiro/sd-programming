import re

class ExtratorURL:
    def __init__(self, url: str):
        self.url = self.sanitiza_url(url)
        self.valida_url()


    def __str__(self) -> str:
        result = f'''
        URL: {self.url}
        BASE: {self.get_base()}
        PARÂMETROS: {self.get_parametros()}
        MOEDA ORIGEM: {self.get_valor('moedaOrigem')}
        MOEDA DESTINO: {self.get_valor('moedaDestino')}
        QUANTIDADE: {self.get_valor()}
        '''

        return result
    

    def __len__(self):
        return len(self.url)
    

    def __eq__(self, outra):
        return self.url == outra.url


    def sanitiza_url(self, url: str):
        return url.strip()
    

    def valida_url(self):
        padrao_URL = re.compile('(http(s)?://)?(www.)?bytebank.com(.br)?/cambio')
        match = padrao_URL.match(self.url)
        if not match:
            raise ValueError('A URL não é VÁLIDA.')


    def get_base(self):
        QUERY = self.url.find('?')
        return self.url[:QUERY]

    
    def get_parametros(self):
        QUERY = self.url.find('?')
        return self.url[QUERY+1:]


    def get_valor(self, nome_parametro: str):
        url_parametros = self.get_parametros()
        indice_inicial = url_parametros.find(nome_parametro) + len(nome_parametro) + 1
        indice_e_comercial = url_parametros.find('&', indice_inicial)

        if indice_e_comercial == -1:
            return url_parametros[indice_inicial:]
        else:
            return url_parametros[indice_inicial:indice_e_comercial]



extrator_url = ExtratorURL('https://bytebank.com/cambio?moedaOrigem=real&moedaDestino=dolar&quantidade=100')
