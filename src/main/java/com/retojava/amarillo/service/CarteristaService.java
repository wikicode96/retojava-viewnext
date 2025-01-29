package com.retojava.amarillo.service;

import com.retojava.amarillo.XmlReader.XmlReader;
import com.retojava.amarillo.model.CarteristaXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CarteristaService {

    @Autowired
    private XmlReader xmlReader;

    public CarteristaXml readCarteristaXml() throws IOException {
        String path = "";

        return xmlReader.fileReader(path, CarteristaXml.class);
    }
}
