const teclado = document.querySelectorAll('.tecla');

function playAudio (idElemento) {
    document.querySelector(idElemento).play();
}

for (let i = 0; i < teclado.length; i++) {
    let tecla = teclado[i];
    let elemento = tecla.classList[1];

    tecla.onclick = function () {
        playAudio(`#som_${elemento}`);
    }

    tecla.onkeydown = function (evento) {
        if (evento.code === 'Space' || evento.code === 'Enter') {
            tecla.classList.add('ativa')
        }
    }

    tecla.onkeyup = function (evento) {
        if (evento.code === 'Space' || evento.code === 'Enter') {
            tecla.classList.remove('ativa')
        }
    }
}

