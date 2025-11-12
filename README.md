# 🔴 AdvancedJUnitTestes

Projeto desenvolvido para explorar **testes unitários avançados** com **JUnit 5**, incluindo:
- **Assumptions**  
- **Testes Condicionais**
- **Testes de Exceptions**
- **Ordenação de Testes**

Cada teste foi criado com o objetivo de demonstrar diferentes situações de verificação, controle de ambiente e comportamento do código em condições específicas.



## 🧠 1. AssumptionsTest
Os **Assumptions** são usados quando queremos que um teste seja executado **somente se uma condição for verdadeira**.  
Se a condição não for satisfeita, o teste é **ignorado**, não contado como falha.

### ✅ Testes realizados:
- `deveExecutarSomenteEmAmbienteDeDesenvolvimento()`  
  → Executa apenas se a variável de ambiente `ENV` for igual a `"DEV"`.  
- `deveIgnorarSeBancoDesconectado()`  
  → Ignora o teste se o "banco de dados" estiver desconectado.  
- `deveExecutarSomenteSeBancoConectado()`  
  → Executa o teste apenas se o banco estiver ativo.

📊 **Resultado esperado:**  
✔️ Testes executados apenas quando as condições são verdadeiras.  
⚠️ Testes ignorados quando os pressupostos não são atendidos.



## ⚙️ 2. CondicionalTest
Os **testes condicionais** são usados para rodar testes dependendo do sistema operacional ou da versão do Java.  
Eles ajudam a garantir compatibilidade entre diferentes ambientes.

### ✅ Testes realizados:
- `deveExecutarSomenteNoWindows()`  
  → Executa apenas se o sistema operacional for Windows.  
- `deveExecutarSomenteNoJava21()`  
  → Executa apenas se a versão do Java for 21.  

📊 **Resultado esperado:**  
✔️ Testes executados conforme o ambiente detectado.

---

## 💥 3. ExceptionTest
Os testes de **Exceptions** verificam se o código lança (ou não lança) uma exceção esperada.  

### ✅ Testes realizados:
- `deveLancarExcecaoAoDividirPorZero()`  
  → Verifica se ocorre uma exceção ao dividir por zero.  
- `naoDeveLancarExcecaoQuandoDivisaoValida()`  
  → Garante que nenhuma exceção é lançada em divisões normais.

📊 **Resultado esperado:**  
✔️ Testes passam se a exceção esperada for lançada corretamente.

---

## 🔢 4. OrderTest
Os testes com **ordenação** permitem controlar a sequência de execução, útil quando há dependência entre etapas.

### ✅ Testes realizados:
- `primeiroTeste()`  
- `segundoTeste()`  
- `terceiroTeste()`

Cada teste é executado **na ordem definida por anotações**, garantindo previsibilidade.

📊 **Resultado esperado:**  
✔️ Testes executados em ordem controlada.

---

## 🧩 Tecnologias utilizadas
- **Java 21**
- **JUnit 5 (Jupiter)**
- **Maven**
- **IntelliJ IDEA**


## 🌐 Meu Repositório
📦 GitHub: [github.com/YANES1957/advanced-junit-tests](https://github.com/YANES1957/advanced-junit-tests)  🚀




