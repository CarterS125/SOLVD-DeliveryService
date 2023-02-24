package com.solvd.deliveryservice.XML;

import com.solvd.deliveryservice.models.DeliveryService;
import com.solvd.deliveryservice.models.Item;
import com.solvd.deliveryservice.models.Store;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DeliveryServiceStAXParser {

    static Logger logger = Logger.getLogger(DeliveryServiceStAXParser.class.getName());

    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream("deliveryService.xml"));

            DeliveryService deliveryService = new DeliveryService();
            List<Store> stores = new ArrayList<>();
            Store store = null;
            List<Item> items = new ArrayList<>();
            Item item = null;
            String tagContent = null;
            while (xmlStreamReader.hasNext()) {
                int event = xmlStreamReader.next();
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if ("store".equals(xmlStreamReader.getLocalName())) {
                            store = new Store();
                            store.setId(Integer.parseInt(xmlStreamReader.getAttributeValue(0)));
                        } else if ("item".equals(xmlStreamReader.getLocalName())) {
                            item = new Item();
                            item.setId(Integer.parseInt(xmlStreamReader.getAttributeValue(0)));
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        tagContent = xmlStreamReader.getText().trim();
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        switch (xmlStreamReader.getLocalName()) {
                            case "store":
                                stores.add(store);
                                break;
                            case "name":
                                store.setName(tagContent);
                                break;
                            case "item":
                                items.add(item);
                                break;
                            case "price":
                                item.setPrice(item.getPrice());
                                break;
                        }
                        break;
                }
            }
            deliveryService.setStores(stores);
            deliveryService.setItems(items);
        } catch (FileNotFoundException | XMLStreamException e) {
            logger.info("an error has occured");
        }
    }
}

