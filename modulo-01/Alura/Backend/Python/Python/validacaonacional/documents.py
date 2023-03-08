from validate_docbr import *

class Document:
    @staticmethod
    def create_document(document):
        if len(document) == 11:
            return DocumentCPF(document)

        elif len(document) == 14:
            return DocumentCNPJ(document)

        else:
            raise ValueError("Document not valid.")


class DocumentCPF:
    def __init__(self, document: str) -> None:

        if self.cpf_is_valid(document):
            self.document = document

        else:
            raise ValueError("CPF not valid.")

    def __str__(self) -> str:
        var = CPF()
        return var.mask(self.document)

    def cpf_is_valid(self, document: str):
        cpf = CPF()

        return cpf.validate(document)


class DocumentCNPJ:
    def __init__(self, document: str) -> None:

        if self.cnpj_is_valid(document):
            self.document = document

        else:
            raise ValueError("CPNJ not valid.")

    def __str__(self) -> str:
        var = CNPJ()
        return var.mask(self.document)

    def cnpj_is_valid(self, document: str):
        cnpj = CNPJ()

        return cnpj.validate(document)
