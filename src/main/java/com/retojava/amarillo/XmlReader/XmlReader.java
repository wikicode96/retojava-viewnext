package com.retojava.amarillo.XmlReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class XmlReader {
    public static <T> T fileReader(String filePath, Class<T> xmlObject) throws IOException {
        File fileXml = new File(filePath);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(fileXml, xmlObject);
    }
}
