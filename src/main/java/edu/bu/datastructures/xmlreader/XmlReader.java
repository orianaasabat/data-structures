package edu.bu.datastructures.xmlreader;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlReader {

	public static void main(String[] args) throws Exception {
		File xmlFile = new File("c://tmp//bethlehemSmall.osm");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("node");
		for (int i = 0; i < nList.getLength(); i++) {
			Element elementNode = (Element) nList.item(i);
			System.out.println("node id " + elementNode.getAttribute("id") + " at lat,lon "
					+ elementNode.getAttribute("lat") + "," + elementNode.getAttribute("lon"));
		}
		
		NodeList ways = doc.getElementsByTagName("way");
		for (int i = 0; i < ways.getLength(); i++) {
			Element elementWay = (Element) ways.item(i);
			NodeList wayNodes = elementWay.getElementsByTagName("nd");
			System.out.println("new way");
			for (int j = 0; j < wayNodes.getLength(); j++) {
				Element wayNodeElement = (Element) wayNodes.item(j);
				System.out.println("way node " + wayNodeElement.getAttribute("ref"));

			}
			NodeList tags = elementWay.getElementsByTagName("tag");
			for (int j = 0; j < tags.getLength(); j++) {
				Element wayTagItem = (Element) tags.item(j);
				if (wayTagItem.getAttribute("k").equals("name") || wayTagItem.getAttribute("k").equals("highway")) {
					System.out.println(wayTagItem.getAttribute("v"));
				}
			}
		}
	}

}
