package com.lyk.wechart.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaperRepository extends MongoRepository<Paper, Long> {
    Paper findPaperByName(String name);
}
