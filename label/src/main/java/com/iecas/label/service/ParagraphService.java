package com.iecas.label.service;

import com.iecas.label.model.Paragraph;
import com.iecas.label.respository.ParagraphRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParagraphService {
    @Autowired
    ParagraphRespository paragraphRespository;

    public void save(Paragraph paragraph){
        paragraphRespository.save(paragraph);
        return;
    }

    public Paragraph find(Long id){
        return paragraphRespository.findOne(id);
    }
}
