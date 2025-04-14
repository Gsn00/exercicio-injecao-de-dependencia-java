package teste.services;

import java.util.Calendar;
import java.util.Date;

import teste.entities.Contract;
import teste.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public ContractService(OnlinePaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double amount = contract.getTotalValue() / months;
		
		for (int i=1; i<=months; i++) {
			
			Date dueDate = contract.getDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dueDate);
			cal.add(Calendar.MONTH, i);
			dueDate = cal.getTime();
			
			
			double value = amount + paymentService.interest(amount, i);
			value += paymentService.paymentFee(value);
			
			Installment installment = new Installment(dueDate, value);
			contract.getInstallments().add(installment);
		}
	}
}
