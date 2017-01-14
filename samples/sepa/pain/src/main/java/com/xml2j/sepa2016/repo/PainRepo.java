package com.xml2j.sepa2016.repo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoOperations;

public class PainRepo {
//	"file:src/main/Beans.xml"
	final static String path = new ClassPathResource("spring-config.xml").getPath();
	static ClassPathXmlApplicationContext context = null; 
	static MongoOperations operations = null;

	public static void initialize() {
		context = new ClassPathXmlApplicationContext(path);
		operations = (MongoOperations) context.getBean("mongoTemplate");
	}
	
	public static void close() {
		context.close();
	}
	
	public static boolean isActive() {
		return context.isActive();
	}
	
	public static MongoOperations operations() {
		return operations;
	}

	public static SequenceRepo getSequenceRepo() {
		assert(context != null);
		return context.getBean(SequenceRepo.class);
	}

	public static CustomerCreditTransferInitiationV07Repo getCustomerCreditTransferInitiationV07Repo() {
		assert(context != null);
		return context.getBean(CustomerCreditTransferInitiationV07Repo.class);
	}
	
	public static PaymentInstructionRepo getPaymentInstructionRepo() {
		assert(context != null);
		return context.getBean(PaymentInstructionRepo.class);
	}

	public static CreditTransferTransaction26Repo getCreditTransferTransaction26Repo() {
		assert(context != null);
		return context.getBean(CreditTransferTransaction26Repo.class);
	}

}
