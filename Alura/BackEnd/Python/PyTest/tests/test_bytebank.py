from employee import Employee

class TestClass:
    def test_quando_idade_recebe_13_03_2000_deve_retornar_22(self):
        # Given-contexto
        entrada = '13/03/2000'
        espero = 22

        func = Employee("Teste", entrada, 1111)

        # When-ação

        resultado = func.age

        assert resultado == espero # Then-desfecho