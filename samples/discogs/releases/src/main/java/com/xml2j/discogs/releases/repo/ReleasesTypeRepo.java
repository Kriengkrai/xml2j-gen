package com.xml2j.discogs.releases.repo;

import com.xml2j.discogs.releases.ReleaseType;
import org.springframework.data.repository.CrudRepository;

public interface ReleasesTypeRepo extends CrudRepository<ReleaseType, Long> {}
