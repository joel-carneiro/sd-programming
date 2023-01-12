import array as arr
import numpy as np
from abc import ABCMeta, abstractmethod
class Conta:
    def __init__(self, codigo):
        self.codigo = codigo
        self._saldo = 0


    def deposita(self, valor):
        self._saldo += valor


    def saca(self, valor):
        self_saldo -= valor


    def __str__(self) -> str:
        return f"[Código: {self.codigo} -=- Saldo: {self._saldo}]"


    @abstractmethod
    def passa_mes(self):
        pass


class ContaCorrente(Conta):
    def passa_mes(self):
        self._saldo -= 2


class ContaPoupanca(Conta):
    def passa_mes(self):
        self._saldo *= 1.01


class ContaInvestimento(Conta):
    pass


conta1 = ContaCorrente(16)
conta1.deposita(100)
conta2 = ContaPoupanca(32)
conta2.deposita(100)
conta3 = ContaInvestimento(64)
conta3.deposita(333)

contas = [conta1, conta2]

for conta in contas:
    conta.passa_mes()

# print(conta1, conta2)

numeros = np.array([1, 3.5, 2, 3.7, 0.9, 0])

class ContaSalario:
    def __init__(self, codigo, saldo = 0):
        self.codigo = codigo
        self._saldo = saldo


    def get_saldo(self):
        return self._saldo


    def deposita(self, valor):
        self._saldo += valor


    def __str__(self) -> str:
        return f"[Código: {self.codigo} -=- Saldo: {self._saldo}]"


    def __eq__(self, outro):
        if type(outro) == type(ContaSalario):
            return False
        else:
            return self.codigo == outro.codigo


    def __lt__(self, outro):
        return self._saldo < outro._saldo


class ContaSalarioMultiplo(ContaSalario):
    pass


conta1 = ContaSalario(12, 350)
conta2 = ContaSalario(37, 790)
conta3 = ContaSalario(39, 930)

contas = [conta1, conta2, conta3]

'''def extrai_saldo(conta):
    return conta.get_saldo()

for conta in sorted(contas, key=extrai_saldo):
    print(conta)
'''

print(conta3 > conta2)