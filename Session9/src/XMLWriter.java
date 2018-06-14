import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLWriter {

	public static void main(String[] args) {
		
		// Objects of Employee
		// Shall be created in the RAM area which is temporary
		Employee e1 = new Employee(101, "George", 30000);
		Employee e2 = new Employee(201, "Fionna", 40000);
		
		System.out.println(e1);
		System.out.println(e2);
		
		// XML File which will store the data of Employee Objects
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Represents an XML File
			
			Element rootElm = document.createElement("employees");
			
			Element empElm = document.createElement("employee");
			
			Element eidElm = document.createElement("eid");
			Element nameElm = document.createElement("name");
			Element salaryElm = document.createElement("salary");
			
			Text eidTxt = document.createTextNode(String.valueOf(e1.eid));
			Text nameTxt = document.createTextNode(e1.name);
			Text salaryTxt = document.createTextNode(String.valueOf(e1.salary));
			
			// Put the data into tags
			eidElm.appendChild(eidTxt);
			nameElm.appendChild(nameTxt);
			salaryElm.appendChild(salaryTxt);
			
			empElm.appendChild(eidElm);
			empElm.appendChild(nameElm);
			empElm.appendChild(salaryElm);
			
			rootElm.appendChild(empElm);
			
			document.appendChild(rootElm); // Defining XML's root element
			
			// Source | From where we will create our XML File
			DOMSource source = new DOMSource(document); 
			
			// Result | Final Destination
			File file = new File("/Users/ishantkumar/Downloads/edurekaemployees.xml");
			FileOutputStream fos = new FileOutputStream(file);
			StreamResult result = new StreamResult(fos); // Write data into XML
			
			// This will convert DOMSource into StreamResult
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);

			System.out.println(file.getName()+" Created with XML Data !!");
		
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
	}

}
