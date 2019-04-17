package ontology;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;

public class OntoIndividual extends OntoEntity {

    private OWLNamedIndividual owlIndividual;

    public OntoIndividual(OWLIndividual individual) {
        super();
        owlIndividual = individual.asOWLNamedIndividual();
    }

    public OntoIndividual(String id) {
        super();
        IRI iri = IRI.create(id);
       // ArrayList<String> individuos = new ArrayList<String> ();
        owlIndividual = ontoModel.getFactory().getOWLNamedIndividual(iri);
    } 

    public String getIdentifier() {
        return owlIndividual.toStringID();
    }
    
    public String getLabel() {
        return getLabel(owlIndividual);
    }
    
    public String getComment() {
        return getComment(owlIndividual);
    }
    
    public List<OntoClass> getTypes() {
        List<OntoClass> typeList = new ArrayList<OntoClass>();
        Set<OWLClassExpression> types = owlIndividual.getTypes(ontoModel.getOntology());
        for(OWLClassExpression cls : types) {
            String key = cls.asOWLClass().toStringID();
            typeList.add(new OntoClass(key));
        }
       return typeList;
    }

    public List<OntoObjectProperty> getObjectProperty() {
        List<OntoObjectProperty> properties = new ArrayList<OntoObjectProperty>();
        Map<OWLObjectPropertyExpression, Set<OWLIndividual>> objectPropertyValues
                = owlIndividual.getObjectPropertyValues(ontoModel.getOntology());
        for (Map.Entry<OWLObjectPropertyExpression, Set<OWLIndividual>> entry : objectPropertyValues.entrySet()) {
            properties.add(new OntoObjectProperty(entry));
        }
        return properties;
    }

    public List<OntoDataProperty> getDataProperty() {
        List<OntoDataProperty> properties = new ArrayList<OntoDataProperty>();
        Map<OWLDataPropertyExpression, Set<OWLLiteral>> dataPropertyValues 
                = owlIndividual.getDataPropertyValues(ontoModel.getOntology());
        for(Map.Entry<OWLDataPropertyExpression, Set<OWLLiteral>> entry : dataPropertyValues.entrySet()) {
            properties.add(new OntoDataProperty(entry));
        }
        return properties;
    }

}