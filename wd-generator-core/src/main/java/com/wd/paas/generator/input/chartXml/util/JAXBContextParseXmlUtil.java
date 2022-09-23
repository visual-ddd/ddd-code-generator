package com.wd.paas.generator.input.chartXml.util;

import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 * JAXB操作XML工具类
 *
 * @author 佟蕊
 */
public class JAXBContextParseXmlUtil {

    /**
     * 通过Recource文件方式获取对象
     *
     * @param inputStream 文件流
     * @param cls         对象类
     * @param <T>         实例类型
     * @return returnInstance 返回实例
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static <T> T xml2javaFromRecource(InputStream inputStream, Class<T> cls)
        throws Exception {
        Unmarshaller uma = getUnmarshaller(JAXBContext.newInstance(cls));
        XMLReader xmlReader = getXmlReader();
        Source source = new SAXSource(xmlReader, new InputSource(inputStream));
        // 把XML文件解析为对象
        return (T) uma.unmarshal(source);
    }

    /**
     * 从上下文中获取Unmarshaller对象
     *
     * @param jaxbContext
     * @return Unmarshaller
     * @throws JAXBException
     */
    private static Unmarshaller getUnmarshaller(JAXBContext jaxbContext) throws JAXBException {
        return jaxbContext.createUnmarshaller();
    }

    /**
     * 获取XMLReader
     *
     * @return
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    private static XMLReader getXmlReader() throws SAXException, ParserConfigurationException {
        SAXParserFactory sax = SAXParserFactory.newInstance();
        sax.setNamespaceAware(false);
        return sax.newSAXParser().getXMLReader();
    }

}
