package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import teste.entities.Contract;
import teste.entities.Installment;
import teste.services.ContractService;
import teste.services.PaypalService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		
		System.out.print("Número: ");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(sc.next());
		
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		System.out.print("Número de parcelas: ");
		int months = sc.nextInt();
		
		sc.close();
		
		Contract contract = new Contract(number, date, totalValue);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, months);
		
		for (Installment installment : contract.getInstallments()) {
			System.out.println(sdf.format(installment.getDueDate()) + " : "  + installment.getAmount());
		}

	} 

}
