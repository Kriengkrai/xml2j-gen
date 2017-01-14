package com.xml2j.sepa2016.pain.processor;

import com.xml2j.mongo.sequence.SequenceService;

import com.xml2j.sepa2016.pain.*;
import com.xml2j.sepa2016.repo.*;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:45 CET 2017 

******************************************************************************/
	
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.MessageProcessor;
import com.xml2j.xml.core.ProcessorException;
import com.xml2j.xml.core.XMLEvent;


/**
 *	This class processes events that are sent by the XML2J framework.
 */
public class CustomerCreditTransferInitiationV07Processor implements MessageProcessor {
	
	CustomerCreditTransferInitiationV07Repo msgRepo = PainRepo.getCustomerCreditTransferInitiationV07Repo();
	PaymentInstructionRepo paymentInstructionRepo = PainRepo.getPaymentInstructionRepo();
	CreditTransferTransaction26Repo crdtTrfrTxRepo = PainRepo.getCreditTransferTransaction26Repo();
	
	private long msgId = 0L;
	private long pmtInfId = 0L;
	
	@Override
	public void process(XMLEvent evt, ComplexDataType data)
			throws ProcessorException {

		if (evt == XMLEvent.START) {
			if (data instanceof CustomerCreditTransferInitiationV07) {
				msgId = SequenceService.getNextMessageId();
			} else if (data instanceof PaymentInstruction20) {
				pmtInfId = SequenceService.getNextPaymentInstructionId();
			} 
		}

		if (evt == XMLEvent.END) {
			if (data instanceof CustomerCreditTransferInitiationV07) {
				process((CustomerCreditTransferInitiationV07)data);
				
			} else if (data instanceof GroupHeader48) {
				process((GroupHeader48)data);
				
			} else if (data instanceof PaymentInstruction20) {
				process((PaymentInstruction20)data);
				
			} else if (data instanceof CreditTransferTransaction26) {
				process((CreditTransferTransaction26)data);

			}
		}
	}

	private void process(CustomerCreditTransferInitiationV07 data) {
		data.setKeyMessageId(msgId);
		msgRepo.save(data);
	}

	private void process(GroupHeader48 data) {
		// header is contained within message
	}

	private void process(PaymentInstruction20 data) {
		data.setKeyPmtInfId(pmtInfId);
		data.setKeyMsgId(msgId);
		paymentInstructionRepo.save(data);
	}

	private void process(CreditTransferTransaction26 data) {
		long cdtTrfTxInfId = SequenceService.getNextCreditTransferTransctionId();
		data.setKeyCdtTrfTxInf(cdtTrfTxInfId);
		data.setKeyPmtInfId(pmtInfId);
		crdtTrfrTxRepo.save(data);
	}
}
