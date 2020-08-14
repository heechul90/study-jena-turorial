package tutorial;

import org.apache.jena.rdf.model.Model;

public class HelloRDFWorld11 {
	
	// Operations on Models
	
	// read the RDF/XML files
	model1.read(new InputStreamReader(in1), "");
	model2.read(new InputStreamReader(in2), "");
	 
	// merge the Models
	Model model = model1.union(model2);
	 
	// print the Model as RDF/XML
	model.write(system.out, "RDF/XML-ABBREV");

}
