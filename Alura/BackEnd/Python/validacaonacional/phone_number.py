import re

class PhoneNumberBR:
    def __init__(self, number: str) -> None:
        if self.number_is_valid(number):
            self.number = number
        else:
            raise ValueError("Phone number not valid.")


    def __str__(self) -> str:
        return self.mask()

    
    def number_is_valid(self, number):
        template = re.compile("[0-9]{2}[0-9]{4,5}[0-9]{4}")
        response = re.search(template, number)
        
        if response == None:
            return False
        else:
            return True
    

    def mask(self):
        template = re.compile("([0-9]{2})([0-9]{4,5})([0-9]{4})")
        response = re.search(template, self.number).groups()

        format_number = "({}) {}-{}".format(
            response[0],
            response[1],
            response[2]

        )

        return format_number