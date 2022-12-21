class Cliente:
    def __init__(self, nome: str):
        self.__nome = nome.title()
    

    @property
    def nome(self):
        return self.__nome.title()


cliente = Cliente('joel carneiro verçosa')
print(cliente.nome)
