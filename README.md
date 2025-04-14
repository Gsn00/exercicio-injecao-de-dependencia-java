# Sobre o projeto

Este é um exercício de fixação sobre interfaces, inversão de controle e injeção de dependência em Java. O exercício foi proposto pelo professor Nélio Alves no curso **Java COMPLETO Programação Orientada a Objetos** da Udemy.

# Proposta de solução

Uma empresa deseja automatizar o processamento de seus contratos. O processamento deum contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base nonúmero de meses desejado. <br><br>
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxapor pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplicajuros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%. <br><br>
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,e valor total do contrato). Em seguida, o programa deve ler o número de meses paraparcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela doismeses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.

## Exemplo de input
Entre os dados do contrato:
```
Numero: 8028
Data (dd/MM/yyyy): 25/06/2018
Valor do contrato: 600.00
Entre com o numero de parcelas: 3
```
## Exemplo de output
```
Parcelas:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12
```
