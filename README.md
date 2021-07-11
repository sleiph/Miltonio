# Milton.io

![Kotlin](https://img.shields.io/static/v1?label=&message=Kotlin&color=0095D5&logo=Kotlin&logoColor=FFFFFF)
![Android Studio](https://img.shields.io/static/v1?label=&message=Android&color=3DDC84&logo=Android&logoColor=FFFFFF)
![SQLite](https://img.shields.io/static/v1?label=&message=SQLite&color=003B57&logo=SQLite&logoColor=FFFFFF)
![Illustrator](https://img.shields.io/static/v1?label=&message=Illustrator&color=FF9A00&logo=Adobe%20Illustrator&logoColor=FFFFFF)

O Milton.io é um aplicativo de quiz criado pra testar os conhecimentos do jogador sobre as matérias do curso de Análise de Sistemas da FATEC Guarulhos.

Criei esse aplicativo no [MIT App Inventor](https://appinventor.mit.edu) como parte de um laboratório de criação de aplicativos dado na disciplina de administração, agora recriei ele no Android Studio pra aprender um pouco sobre Kotlin e desenvolvimento de aplicativos.

![capa](/img/main.jpg)

Se quiser testar o aplicativo, só baixar o arquivo [Miltonio_debug.apk](/Miltonio.apk) da raiz do projeto e instalar no seu celular Android.

O App usa um banco de dados SQLite pra guardar seu progresso, assim como as matérias de cada semestre, que pode ser escolhido na tela inicial. Quando uma das matérias é escolhida você é levado pra tela de quiz, as perguntas aparecem em ordem aleatória, cada uma tem uma quantidade variável de respostas possíveis. Depois que as perguntas são respondidas você é encaminhado pra uma tela onde pode conferir sua pontuação.

---

### Fazer

Algumas melhorias que qualquer um é bem vindo a me ajudar a fazer são:

- Acessibilidade!!!
- Deixar o app usável em versões mais antigas do Android
- Otimizar o número de assets (tilesets, tints, ...)
- Usar recycler views
- Usar ActivityAddTaskBinding, igual gente grande
- Limpar (bastante) o meu código, principalmente o controle do banco de dados

#### Funções

- Usuários com senha
- Perguntas de múltipla escolha
- Adicionar imagens nas perguntas
- High Scores
- Se você errar a pergunta, ela volta no final (igual o Duolingo)

#### Visual

- *Darkmode*
- Animações
- Layout responsivo
- Scroll mais bonito/intuitivo das respostas

---
![blocos](/img/blocos2.png)

### Créditos

[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)

Eu não tenho direito sobre muitas coisas desse aplicativo, as perguntas pertencem aos professores de cada matéria, os memes pertencem ... à internet? ...
Eu não tenho direito sobre a imagem do professor Milton (pobre professor Milton), utilizada no título do aplicativo, nem sobre as fontes utilizadas.
Os sons são do [Henry Richard](https://freesound.org/people/HenryRichard).

O pouco que eu realmente criei foram a lógica utilizada no app e os padrões de fundo das matérias, essas duas coisas podem ser reproduzidas livremente.
