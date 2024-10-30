package com.teachmeskills.lesson_9.document_parser.impl;

import com.teachmeskills.lesson_9.document_parser.IParser;

public class DocxDocumentParser implements IParser {

    @Override
    public void parseFile(String fileName) {
        System.out.println("Get data from a docx document.");
    }
}
