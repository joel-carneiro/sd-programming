class ContaCorrente:
    def __init__(self, codigo):
        self.codigo = codigo
        self.saldo = 0
    

    def deposita(self, valor = 0):
        self.saldo += valor
    

    def __str__(self):
        return "[>>Código: {} Saldo: {}<<]".format(self.codigo, self.saldo)


def deposita_para_todas(contas: list, valor: float):
    for conta in contas:
        conta.deposita(valor)


def print_contas(contas):
    for conta in contas:
        print(conta)

c_william = ContaCorrente(123)
c_joel = ContaCorrente(654)
c_marcelo = ContaCorrente(777)
c_natan = ContaCorrente(589)


contas = [c_william, c_joel, c_natan, c_marcelo]

guilherme = ('Guilherme', 37, 1981)
daniela = ('Daniela', 31, 1987)

guilherme = ("Guilherme", 37, 1981)
ana = ("Ana", 31, 1999)

usuarios = [guilherme, ana]

print(usuarios)