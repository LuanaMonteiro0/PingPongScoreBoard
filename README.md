## Tabela de Abordagens

| Abordagem                      | Rotação de tela | Morte do processo |
|:-------------------------------|:----------------|:------------------|
| `remember`                     | Não sobrevive   | Não sobrevive     |
| `rememberSaveable`             | Sobrevive       | Não sobrevive     |
| `ViewModel + mutableStateOf`   | Sobrevive       | Não sobrevive     |
| `ViewModel + StateFlow`        |                 |                   |
| `ViewModel + SavedStateHandle` |                 |                   |

---

**1. Por que o ViewModel sozinho (etapas 2 e 3) não é suficiente para sobreviver à morte do processo, mesmo sobrevivendo à rotação de tela?**

**2. Qual a diferença prática entre usar mutableStateOf e StateFlow dentro do ViewModel nesta aplicação? Em algum momento essa diferença foi perceptível nos testes?**

**3. Se este placar precisasse ser salvo permanentemente (mesmo após o usuário fechar o app e abrir dias depois), qual das quatro abordagens ainda seria insuficiente, e o que seria necessário adicionar?**

**4. Na sua opinião, qual abordagem você usaria em produção para este placar e por quê?**
