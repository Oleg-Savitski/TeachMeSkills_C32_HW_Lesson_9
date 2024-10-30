package com.teachmeskills.lesson_9.fabric;

import com.teachmeskills.lesson_9.document_parser.IParser;
import com.teachmeskills.lesson_9.document_parser.impl.DocxDocumentParser;
import com.teachmeskills.lesson_9.document_parser.impl.PdfDocumentParser;
import com.teachmeskills.lesson_9.document_parser.impl.TxtDocumentParser;

/** постарался исправить замечания с прошлого домашнего задания.
 * 1. Добавил проверку на наличие расширения.
 * 2. Извлёк расширение, что позволит избежать ошибок если в имени файла будут доп. точки.
 * 3. В ApplicationRunner будет доработан код, который сможет выбросить исключение,
 * если будет неподдерживаемый формат или расширение.
 * 4. Конструкцию Switch оставил прежней, так как она оказалась наиболее подходящей для этого класса.(Моё мнение):
 * читаемость, легко добавить новый формат, эффективность, поддержка различных типов данных.
 */

public class ParserFabric {

    public static IParser createParser(String fileName) {
        if (fileName == null || !fileName.contains(".")) {
            throw new IllegalArgumentException("File name must contain an extension: " + fileName);
        }
        String fileExtension = fileName.substring(fileName.lastIndexOf(".")).toLowerCase();
        return switch (fileExtension) {
            case ".docx" -> new DocxDocumentParser();
            case ".pdf" -> new PdfDocumentParser();
            case ".txt" -> new TxtDocumentParser();
            default -> throw new IllegalArgumentException("Unsupported file format: " + fileExtension);
        };
    }
}