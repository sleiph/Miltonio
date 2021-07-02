# Milton.io
O Milton.io é um aplicativo de quiz criado pra testar os conhecimentos do jogador sobre as matérias do curso de Análise de Sistemas da FATEC Guarulhos.

Criei esse aplicativo no [MIT App Inventor](https://appinventor.mit.edu) como parte de um laboratório de criação de aplicativos dado na disciplina de administração, agora recriei ele no Android Studio pra aprender um pouco sobre Kotlin e desenvolvimento de aplicativos.

![capa](/img/main.jpg)

Se quiser testar o aplicativo, só baixar o arquivo [Miltonio_debug.apk](/Miltonio_debug.apk) da raiz do projeto e instalar no seu celular Android.

A tela inicial exibe as matérias do semestre, com a sua melhor pontuação em cada tema, o App usa um banco de dados SQLite pra guardar seu progresso, assim como as matérias de cada semestre, que pode ser escolhido na tela inicial. Quando uma das matérias é escolhida você é levado pra tela de quiz, as perguntas aparecem em ordem aleatória, cada uma tem uma quantidade variável de respostas possíveis. A barra de progresso no topo da página muda pra cor verde, ou vermelha, acompanhando seu progresso, um som agradável é tocado pra indicar seu acerto, ou um som menos agradável pra indicar erro. Depois que as perguntas são respondidas você é encaminhado pra uma tela onde pode conferir sua pontuação.

---

### Fazer

Algumas melhorias que qualquer um é bem vindo a me ajudar a fazer são:
- Acessibilidade!!!
- Deixar o app usável em versões mais antigas do Android
- *Darkmode*
- Animações
- Layout responsivo
- Usuários com senha
- Adicionar imagens nas perguntas
- Se você errar a pergunta, ela volta no final (igual o Duolingo)
- Perguntas de múltipla escolha
- Tamanho das caixas de resposta uniforme
- Scroll mais bonito/intuitivo das respostas
- High Scores
- Deixar os menus mais personalizados
- Otimizar o número de assets (tilesets, tints, ...)
- Limpar (bastante) o meu código, principalmente o controle do banco de dados

---
![blocos](/img/blocos2.png)

### Créditos

Eu não tenho direito sobre muitas coisas desse aplicativo, as perguntas pertencem aos professores de cada matéria, os memes pertencem ... à internet? ... eu não tenho direito sobre a imagem do professor Milton, utilizada no título do aplicativo, nem sobre as fontes utilizadas, os [sons](https://freesound.org/people/HenryRichard) ou os sistemas em que o aplicativo foi desenvolvido (MIT app inventor e Android Studio). O pouco que eu posso permitir que seja copiado são a lógica utilizada no app e os padrões de fundo das matérias, essas duas coisas podem ser reproduzidas livremente.
