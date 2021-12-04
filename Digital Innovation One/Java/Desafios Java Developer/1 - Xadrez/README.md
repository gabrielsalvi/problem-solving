# Desafio

No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) é sempre branca e as cores das casas se alternam entre branca e preta, formando o formato tão conhecido como xadrez. Dessa forma, como o tabuleiro tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8 (canto inferior direito) será também branca. Porém, neste problema, queremos ser capazes de predizer a cor independente do número de linhas e colunas, sendo: L linhas e C colunas. No exemplo da figura, para L = 6 e C = 9, a casa no canto inferior direito será preta, uma simples previsão matemática, não?

# Entrada

A primeira linha da entrada contém um inteiro *L* (1 ≤ *L* ≤ 1000) indicando o número de linhas do tabuleiro.
A segunda linha da entrada contém um inteiro *C* (1 ≤ *C* ≤ 1000) representando o número de colunas.

# Saída

Imprima uma linha na saída. A linha deve conter um inteiro, representando a cor da casa no canto inferior direito do tabuleiro, e para identificar, considere o inteiro 1 para a cor branca e 0 para a cor preta.

| Exemplo de Entrada | Exemplo de Saída|
| ---|--- |
|<div align="center">6</br>9</div>|<div align="center">0</div>|
|<div align="center">8</br>8</div>|<div align="center">1</div>|
|<div align="center">5</br>91</div>|<div align="center">1</div>|