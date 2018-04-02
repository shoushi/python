package com.iecas.label.service;

import com.iecas.label.model.Paragraph;
import com.iecas.label.model.Qa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class paragraphServiceTest {
    @Autowired
    ParagraphService paragraphService;
    @Test
    public void save() {
        Paragraph paragraph=new Paragraph();
        Qa qa=new Qa();
        qa.setId(0L);
        qa.setAnswer("glq");
        qa.setQuestion("who is gfq`s husband?");
        qa.setAnswer_start(6);
        List<Qa> list=new ArrayList<>();
        list.add(qa);
        paragraph.setId(0L);
        paragraph.setQas(list);
        paragraph.setContext("adsfasdads");
        paragraphService.save(paragraph);
        System.out.println(paragraphService.find(0L));
    }

    @Test
    public void find() {
    }
}