from datetime import date
import requests
import json


def extract_monetary_data():
    coins = requests.get('https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL').json()
    bitcoin_pure = float(coins['BTCBRL']['bid']) * 1000
    dolar_pure = float(coins['USDBRL']['bid'])
    euro_pure = float(coins['EURBRL']['bid'])

    return euro_pure, dolar_pure, bitcoin_pure


def collect_information():
    study_hours = float(input("Quantas horas você estudou hoje? "))
    training_hours = int(input("Quantos minutos você treinou hoje? "))
    used_social_network = int(input("Você usou rede social hoje? "))
    meditation = float(input("Quantos minutos você meditou hoje? "))
    mood_of_the_day = int(input("De 0 a 10, o quão bem você se sente hoje? "))
    today = date.today()
    euro, dolar, bitcoin = extract_monetary_data()

    data = (
        today, study_hours, training_hours,
        used_social_network, meditation,
        mood_of_the_day, euro, dolar, bitcoin
    )

    return data

def generate_row_of_data():

    data = collect_information()

    line = ",".join(map(str, data))

    return line


def store_information():

    line = generate_row_of_data()

    with open('pyhealth_data.csv', 'a') as file:
        file.write(line + '\n')
