function playSound(audioElementId) {
    document.querySelector(audioElementId).play();
}

const keyList = document.querySelectorAll('.tecla')

let i = 0;

for (let i = 0; i < keyList.length; i++){

    const key = keyList[i]
    const instrument = key.classList[1]

    key.onclick = function () {
        playSound(`#som_${instrument}`)
    };
}
