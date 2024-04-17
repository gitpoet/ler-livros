const form = document.querySelector('#dados');
console.log(form);
const res = document.querySelector('.res');
const btn = document.querySelector('#btn');

function handleChange() {
  const autor = document.getElementById('autor').value;
  const obra = document.getElementById('obra').value;
  const paginas = document.getElementById('paginas').value;
  const generos = document.getElementById('generos').value;
  const resultado = document.querySelector('.res');

  resultado.innerHTML = `${autor} ${obra} ${paginas} ${generos}`;
  const dados = resultado.textContent;

  window.localStorage.setItem('livro', JSON.stringify(dados));
}

btn.addEventListener('click', handleChange);
