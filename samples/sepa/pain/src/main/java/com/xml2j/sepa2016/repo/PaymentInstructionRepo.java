package com.xml2j.sepa2016.repo;

import org.springframework.data.repository.CrudRepository;

import com.xml2j.sepa2016.pain.PaymentInstruction20;

public interface PaymentInstructionRepo extends CrudRepository<PaymentInstruction20, String> {}
