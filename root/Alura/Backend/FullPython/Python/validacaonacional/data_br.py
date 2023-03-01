from datetime import datetime, timedelta

class DataBR:
    def __init__(self) -> None:
        self.time_of_registration = datetime.today()


    def __str__(self) -> str:
        return self.formatted_date


    @property
    def month(self):

        months = (
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro",
        )

        month_registration = self.time_of_registration.month
        
        return months[month_registration - 1]
    

    @property
    def week_day(self):

        days = (
            "Domingo",
            "Segunda",
            "Terça",
            "Quarta",
            "Quinta",
            "Sexta",
            "Sábado"
        )

        week_day = self.time_of_registration.weekday()

        return days[week_day + 1]
    

    @property
    def formatted_date(self):
        return self.time_of_registration.strftime("%d/%m/%Y %H:%M")


    def registration_time(self):
        registration_time = ( datetime.today() + timedelta(days=30)) - self.time_of_registration
        return registration_time