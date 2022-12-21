from data_br import *
from documents import *
from phone_number import *
from cep import *

def register():
    print("Olá, para realizar seu cadastro, por favor, preencha suas credenciais abaixo.")

    input_document = input("CPF ou CNPJ: ")
    document = Document.create_document(input_document)

    input_phone_number = input("Número de telefone: (com DDD) ")
    phone_number = PhoneNumberBR(input_phone_number)

    input_cep = input("CEP: ")
    address = Address(input_cep)
    
    date = DataBR()

    print("Cadastro realizado com sucesso!")

    print(f"Documento: {document}")
    print(f"Telefone: {phone_number} ")
    print(f"Endereço: {address}")
    print(f"Cadastro realizado em: {date}")
    

if __name__ == "__main__":
    register()