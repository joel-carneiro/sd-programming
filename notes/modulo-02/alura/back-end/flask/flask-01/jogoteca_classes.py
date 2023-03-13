class Game:
    def __init__(self, name, type, console):
        self.name = name
        self.type = type
        self.console = console
    

    def set_name(self, name):
        self.name = name
    

    def set_type(self, type):
        self.type = type


    def set_console(self, console):
        self.console = console


    def get_name(self):
        return self.name
    

    def get_type(self):
        return self.type
    

    def get_console(self):
        return self.console