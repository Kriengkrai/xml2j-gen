package com.xml2j.sepa2016.repo;

import org.springframework.data.repository.CrudRepository;

import com.xml2j.mongo.sequence.Sequence;

public interface SequenceRepo extends CrudRepository<Sequence, String> {}
