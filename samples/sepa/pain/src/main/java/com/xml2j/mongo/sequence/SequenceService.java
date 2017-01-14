package com.xml2j.mongo.sequence;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.xml2j.sepa2016.repo.PainRepo;
 
@Service
public class SequenceService {
	
	static final String PaymentInstruction = "PmtInf";
	static final String CreditTransferTransaction = "CdtTrfTxInf";
	static final String Message = "CstmrCdtTrfInitn";
	
	static private long getNextSequence(String collectionName) {
		Sequence counter = PainRepo.operations().findAndModify(query(where("_id").is(collectionName)), new Update().inc("sequence", 1),
				options().returnNew(true), Sequence.class);
		
		if (counter == null) {
			PainRepo.operations().save(new Sequence(collectionName, 1L));
			return 1L;
		}

		return counter.getSequence();
	}

	static public long getNextPaymentInstructionId() {
		return getNextSequence(PaymentInstruction);
	}
	static public long getNextCreditTransferTransctionId() {
		return getNextSequence(CreditTransferTransaction);
	}
	static public long getNextMessageId() {
		return getNextSequence(Message);
	}
}