class Conta:
    def __init__(self, numero, titular, saldo, limite):
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite


    def mostrar_dados(self):
        print(f'Número: {self.__numero} | Titular: {self.__titular} | Saldo: {self.__saldo} | Limite: {self.__limite}')


    def get_atributo(self, tipo):
        if tipo == 'numero':
            return self.__numero
        elif tipo == 'titular':
            return self.__titular
        elif tipo == 'saldo':
            return self.__saldo
        elif tipo == 'limite':
            return self.__limite
        else:
            print('ATRIBUTO NÃO ENCONTRADO')


    def depositar(self, valor):
        self.__saldo += valor
    

    def pode_sacar(self, valor):
        if self.__saldo + self.__limite - valor < 0:
            return False
        else:
            return True

    def sacar(self, valor):
        if self.pode_sacar(valor):
            self.__saldo -= valor
            if self.__saldo < 0:
                self.__limite -= abs(self.__saldo)
                self.__saldo = 0


    def transferir(self, valor, conta):
        self.sacar(valor)
        conta.depositar(valor)


    def limite(self, limite):
        self.__limite = limite
    

    @staticmethod
    def codigos_bancos():
        return {"BB": '001', "Caixa": "104", "Bradesco": "237"}
