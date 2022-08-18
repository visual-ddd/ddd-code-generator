package com.wake.generator.application.generate.util;

import java.io.File;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import lombok.extern.slf4j.Slf4j;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 * JAXB操作XML工具类
 *
 * @author 佟蕊
 */
@Slf4j
public class JAXBContextParseXmlUtil {

    /**
     * 通过实体对象直接生成XML
     *
     * @param xmlFullPath 输出xml路径
     * @param t           要生成的对象
     * @return boolean true:成功 false：失败
     * @throws Exception
     */
    public static <T> boolean java2XML(String xmlFullPath, T t) throws Exception {
        File file = new File(xmlFullPath);
        // 根据cls类生成上下文对象
        JAXBContext jc = JAXBContext.newInstance(t.getClass());
        // 从上下文中获取Marshaller对象，用于把bean转换为xml
        Marshaller ma = jc.createMarshaller();
        // 以下是为生成xml做的一些配置
        // 格式化输出，即按标签自动换行，否则就是一行输出
        ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // 设置编码（默认编码就是utf-8）
        ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        // 是否省略xml头信息，默认不省略（false）
        ma.setProperty(Marshaller.JAXB_FRAGMENT, false);

        // 编组，把对象转换为xml
        ma.marshal(t, file);
        return true;
    }

    /**
     * 通过全路径方式获取对象
     *
     * @param xmlFullPath xml全路径
     * @param cls         对象类
     * @param <T>         实例类型
     * @return returnInstance 返回实例
     * @throws Exception
     */
    public static <T> T xml2javaFromFullPath(String xmlFullPath, Class<T> cls) throws Exception {
        // 从上下文中获取Unmarshaller对象
        Unmarshaller uma = getUnmarshaller(JAXBContext.newInstance(cls));

        // 把XML文件解析为对象
        File file = new File(xmlFullPath);
        T returnInstance = (T) uma.unmarshal(file);
        return returnInstance;
    }

    /**
     * 通过Recource文件方式获取对象
     *
     * @param inputStream 文件流
     * @param cls         对象类
     * @param <T>         实例类型
     * @return returnInstance 返回实例
     * @throws Exception
     */
    public static <T> T xml2javaFromRecource(InputStream inputStream, Class<T> cls)
        throws Exception {
        Unmarshaller uma = getUnmarshaller(JAXBContext.newInstance(cls));
        XMLReader xmlReader = getXmlReader();
        Source source = new SAXSource(xmlReader, new InputSource(inputStream));
        // 把XML文件解析为对象
        T returnInstance = (T) uma.unmarshal(source);
        return returnInstance;
    }

    /**
     * 从上下文中获取Unmarshaller对象
     *
     * @param jaxbContext
     * @return Unmarshaller
     * @throws JAXBException
     */
    private static Unmarshaller getUnmarshaller(JAXBContext jaxbContext) throws JAXBException {
        JAXBContext jc = jaxbContext;
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return unmarshaller;
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
