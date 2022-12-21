from datetime import datetime

class Employee:
    def __init__(self, name: str, date_of_birth: str, wage: float) -> None:
        self._name = name
        self._date_of_birth = date_of_birth
        self._wage = wage
    
    @property
    def wage(self):
        return self._wage
    

    @property
    def age(self):
        data = self._date_of_birth.split("/")
        year = int(data[2])
        month = int(data[1])

        now = datetime.today()

        if now.month - month < 0:
            return now.year - year - 1

        elif now.month - month > 0:
            return now.year - year
    

    @property
    def name(self):
        return self._name
    

    def __str__(self) -> str:
        return f"{self._name}, {self.age} anos"