package com.lzu.lesson06_abstract_factory.sprint3_simulate;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlApplicationContext implements BeanFactory {
    private Map<String, Object> map = new HashMap<>();

    //通过构造函数进行xml文件名称的解析
    public ClassPathXmlApplicationContext(String file) throws JDOMException, IOException {
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(file);
        Element element = doc.getRootElement();
        List vehicle = element.getChildren("bean");

        System.out.println(vehicle.size());

        for (int i = 0; i < vehicle.size(); i++) {
            Element element1 = (Element) vehicle.get(i);
            String name = element1.getAttributeValue("name");
            String clazz = element1.getAttributeValue("class");

            try {
                Object o = Class.forName(clazz).newInstance();
                map.put(name, o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Object getBean(String id) {
        if (!map.containsKey(id)) {
            return null;
        }
        return map.get(id);
    }


}
