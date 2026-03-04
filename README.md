💱 Conversor de Moedas - Challenge Alura Next One

Aplicação Java desenvolvida como parte do Challenge da Alura Next One.
O projeto realiza conversão de moedas em tempo real consumindo uma API externa de câmbio.

🚀 Tecnologias Utilizadas

Java 17

Maven

HttpClient (java.net.http)

Gson (para desserialização JSON)

Dotenv (para variáveis de ambiente)

📦 Estrutura do Projeto
org.ConversorApp
│
├── dto
│   ├── ConversionRequest
│   └── ConversionResponse
│
├── connection
│   └── HttpApiConnection
│
└── Main
📌 Padrões utilizados

DTO para requisição e resposta

Separação de responsabilidade (HTTP isolado da lógica)

Uso de variáveis de ambiente para segurança da API Key

🔑 Configuração da API Key

O projeto utiliza variável de ambiente para proteger a chave da API.

1️⃣ Crie um arquivo .env na raiz do projeto:

API_KEY=SUA_CHAVE_AQUI

2️⃣ Adicione ao .gitignore:

.env


▶️ Como Executar
Via IntelliJ

Abrir o projeto Maven

Atualizar dependências

Executar a classe Main

Via Terminal
mvn compile
mvn exec:java
🔄 Como Funciona

O usuário escolhe:

Moeda base

Moeda destino

Valor

A aplicação:

Monta a URL dinamicamente

Realiza requisição HTTP

Converte JSON em objeto Java usando Gson

Exibe o resultado formatado

🧠 Conceitos Aplicados

Records do Java

Uso de Locale para padronização dos resultados

Desserialização JSON → Objeto

Consumo de API REST

Boas práticas de organização de código

📌 Exemplo de Execução
Digite a moeda base: USD
Digite a moeda destino: BRL
Digite o valor: 100

Resultado: R$ 512.35
