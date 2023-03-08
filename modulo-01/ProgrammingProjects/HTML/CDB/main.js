const botao = document.querySelector('.botao')
const menu = document.querySelector('.resultados')
const submit = document.querySelector('.submit')

const resultados = document.getElementsByClassName('resultado-valor')

botao.addEventListener('click', () => {
    menu.classList.toggle('resultados-ativo')
    botao.classList.toggle('imprimir')
})

submit.addEventListener('click', (evento) => {
    evento.preventDefault()
    const dados = [
    document.getElementById('investimento-inicial'),
    document.getElementById('juros'),
    document.getElementById('anos'),
    document.getElementById('investimento-mensal')
    ]

    var invInicial = parseFloat(dados[0].value)
    var juros = parseFloat(dados[1].value)
    var anos = parseFloat(dados[2].value)
    var invMensal = parseFloat(dados[3].value)

    var capital = invInicial

    for (let i = 0; i < anos; i++) {
        var capital = capital + (capital * juros/100)
        var capital = capital + (invMensal * 12)
    }

    var capitalBruto = capital
    var imposto = (capital * 0.175)
    var capitalLiquido = capitalBruto - imposto

    resultados[0].textContent = `${capitalLiquido.toLocaleString('pt-br', {style: 'currency', currency:'BRL'})}`
    resultados[1].textContent = `${capitalBruto.toLocaleString('pt-br', {style: 'currency', currency:'BRL'})}`
    resultados[2].textContent = `${(invInicial + (invMensal * 12 * anos)).toLocaleString('pt-br', {style: 'currency', currency:'BRL'})}`
    resultados[3].textContent = imposto.toLocaleString('pt-br', {style: 'currency', currency:'BRL'})

    menu.classList.add('resultados-ativo')
    botao.classList.toggle('imprimir')
})

