package edu.bu.datastructures.xmlreader;

import java.io.File;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File fXmlFile = new File("c://tmp//x.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);

		// optional, but recommended
		// read this -
		// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("node");
		for (int i = 0; i < nList.getLength(); i++) {
			Node item = nList.item(i);
			if (item.getNodeType() == Node.ELEMENT_NODE)
				System.out.println(((Element) item).getAttribute("id") + " " + ((Element) item).getAttribute("lat"));
			// ((Element) item).getElementsByTagName("firstname").item(0).getTextContent());
		}

		NodeList ways = doc.getElementsByTagName("way");
		for (int i = 0; i < ways.getLength(); i++) {
			Node wayItem = ways.item(i);
			NodeList wayNodes = ((Element) wayItem).getElementsByTagName("nd");
			System.out.println("new way");
			for (int j = 0; j < wayNodes.getLength(); j++) {
				Node wayNode = wayNodes.item(j);
				if (wayItem.getNodeType() == Node.ELEMENT_NODE)
					System.out.println(((Element) wayNode).getAttribute("ref"));

			}

			NodeList tags = ((Element) wayItem).getElementsByTagName("tag");
			for (int j = 0; j < tags.getLength(); j++) {
				if (((Element) tags.item(j)).getAttribute("k").equals("name")) {
					System.out.println(((Element) tags.item(j)).getAttribute("v"));
				}
			}
			// ((Element) item).getElementsByTagName("firstname").item(0).getTextContent());
		}
	}

}
