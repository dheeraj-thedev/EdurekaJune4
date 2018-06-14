import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {

	public static void main(String[] args) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/edurekaemployees.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Represents an XML File
			
			System.out.println("Root Element: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println("Size of NodeList is "+nodeList.getLength());
			
			ArrayList<Employee> empList = new ArrayList<Employee>();
			int eid=0,salary=0;
			String name="";
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				//System.out.println("Current Node is: "+node.getNodeName());
				
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element element = (Element)node; // Downcasting
					System.out.println("EID: "+element.getElementsByTagName("eid").item(0).getTextContent());
					System.out.println("NAME: "+element.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("SALARY: "+element.getElementsByTagName("salary").item(0).getTextContent());
					System.out.println("------------------------");
					
					eid = Integer.parseInt(element.getElementsByTagName("eid").item(0).getTextContent());
					name = element.getElementsByTagName("name").item(0).getTextContent();
					salary = Integer.parseInt(element.getElementsByTagName("salary").item(0).getTextContent());
					
					Employee emp = new Employee(eid,name,salary);
					empList.add(emp); // ArrayList of Employee Objects with data parsed from XML
				}
			}
			
			for(Employee emp : empList){
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
