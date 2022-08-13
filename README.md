


#  Injeção de dependência e inversão de controle - Java

Exercício do curso "**Java COMPLETO Programação Orientada a Objetos + Projetos**" pela Udemy, com o professor **Nélio Alves**:


>Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado. A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%. Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato). Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.


### O programa deveria ter o resultado similar ao abaixo:


    Enter contract data
    Number: 8028
    Date (dd/MM/yyyy): 25/06/2018
    Contract value: 600.00
    Enter number of installments: 3
    Installments:
    25/07/2018 - 206.04
    25/08/2018 - 208.08
    25/09/2018 - 210.12

---
### Classes criadas:

 - Programa
 - Contrato
 - Parcela
 - ServicoContrato
 - ServicoPagamento (Interface)
 - ServicoPaypal (Implementa ServicoPagamento)

---

### Resultado obtido:
	Número do contrato: 
	659
	Valor do contrato: 600
	Data [YYYY-MM-DD]: 2022-11-23
	Número de parcelas 3
	Parcelas: 
	23/12/2022 - 206.04
	23/01/2023 - 208.08
	23/02/2023 - 210.12

O tratamento de exceção foi feito de forma simplificada.

Ferramentas utilizadas: 
<p align="left">
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> 
 <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> 
