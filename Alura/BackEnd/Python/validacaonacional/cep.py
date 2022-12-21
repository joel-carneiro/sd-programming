import requests

class Address:
    def __init__(self, cep) -> None:
        
        r = requests.get(f"https://viacep.com.br/ws/{cep}/json/")

        if r.status_code == 200:
            data = r.json()

            self.cep = data['cep']
            self.public_place = data['logradouro']
            self.district = data['bairro']
            self.locality = data['localidade']
            self.state = data['uf']

        else:
            raise RuntimeError("Error in the request")


    def __str__(self) -> str:
        return self.cep


    def get_address(self):
        return f"{self.public_place}, {self.district}, {self.locality}, {self.state}, {self.cep}"