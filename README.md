## Tabela de Abordagens

| Abordagem                      | Rotação de tela     | Morte do processo |
|:-------------------------------|:--------------------|:------------------|
| `remember`                     | Não sobrevive       | Não sobrevive     |
| `rememberSaveable`             | Sobrevive           | Não sobrevive     |
| `ViewModel + mutableStateOf`   | Sobrevive           | Não sobrevive     |
| `ViewModel + StateFlow`        | Sobrevive           | Não Sobrevive     |
| `ViewModel + SavedStateHandle` | Sobrevive           | Sobrevive         |

---

**1. Por que o ViewModel sozinho (etapas 2 e 3) não é suficiente para sobreviver à morte do processo, mesmo sobrevivendo à rotação de tela?**

O ViewModel sobrevive a rotação de tela por ser a instância de uma classe especifica que o android retém quando ocorre a recriação da activity, porém assim como outras instancias de classes dentro do aplicativo, essa instância existe apenas na memoria RAM do app e quando ocorre a morte do processo, ela e todas as outras instancias são finalizadas.

**2. Qual a diferença prática entre usar mutableStateOf e StateFlow dentro do ViewModel nesta aplicação? Em algum momento essa diferença foi perceptível nos testes?**

A diferença entre o mutableStateOf e o StateFlow é apenas arquitetural, não sendo perceptível nos testes. O mutableStateOf é intimamente ligado ao Compose, enquando o StateFlow não, este sendo nativo do kotlin, o que permite maior flexibilidade e menor acoplamento entre camadas. 

**3. Se este placar precisasse ser salvo permanentemente (mesmo após o usuário fechar o app e abrir dias depois), qual das quatro abordagens ainda seria insuficiente, e o que seria necessário adicionar?**

Todas as abordagens tratadas nessa aplicação são insuficientes para o caso do usuário querer fechar a aplicação, até mesmo o savedStateHandle que só preve a perda dos dados se o SO encerrar o processo. É preciso salvar utilizando persistencia local (banco de dados)

**4. Na sua opinião, qual abordagem você usaria em produção para este placar e por quê?**

Acredito que implementar o SavedStateHandle já é o suficiente, pois permite segurança dos dados contra encerramentos não intencionais da aplicação, sem o peso da persistencia de dados para uma aplicação de natureza efêmera com o simples registro de placar de dois times sempre fixos.
