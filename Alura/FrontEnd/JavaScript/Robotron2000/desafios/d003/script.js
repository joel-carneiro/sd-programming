const botao1 = document.getElementById('botao1');
const botao2 = document.getElementById('botao2');
const lista = document.getElementById('lista');

function escondeCores () {
    lista.classList.add('des')
}

function mostraCores () {
    lista.classList.remove('des')
}

botao1.addEventListener('click', escondeCores)
botao2.addEventListener('click', mostraCores)