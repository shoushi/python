package com.iecas.label.respository;

import com.iecas.label.model.Paragraph;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParagraphRespository extends MongoRepository<Paragraph,Long> {
}
