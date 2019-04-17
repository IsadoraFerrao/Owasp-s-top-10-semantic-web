package ontology;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;

public class OntoObjectProperty extends OntoEntity {

    private OWLObjectProperty objectProperty;
    private Set<OWLIndividual> values;
    
    public OntoObjectProperty(Map.Entry<OWLObjectPropertyExpression, Set<OWLIndividual>> entry) {
        super();
        objectProperty = entry.getKey().asOWLObjectProperty();
        values = entry.getValue();
    }
    
    public String getIdentifier() {
        return getIdentifier(objectProperty);
    }
    
    public String getLabel() {
        return getLabel(objectProperty);
    }
    
    public String getComment() {
        return getComment(objectProperty);
    }
    
    public List<OntoIndividual> getValues() {
        List<OntoIndividual> individualList = new ArrayList<OntoIndividual>();
        for(OWLIndividual ind : values) {
            individualList.add(new OntoIndividual(ind));
        }
        return individualList;
    }
    
}