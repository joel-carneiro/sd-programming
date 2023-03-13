from flask import *
import requests as req
from api import extract_bitcoin

app = Flask(__name__)

@app.route('/')
def index():

    data = extract_bitcoin()
    bitcoin_value = data[0] 
    time_value = data[1]

    return render_template('index.html', coin_title='Bitcoin', coin_price=bitcoin_value, request_time=time_value)

app.run()