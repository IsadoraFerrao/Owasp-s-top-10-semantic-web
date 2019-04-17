package ontology;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLLiteral;

public class OntoDataProperty extends OntoEntity {
    
    private OWLDataProperty dataProperty;
    private Set<OWLLiteral> values;
    
    public OntoDataProperty(Map.Entry<OWLDataPropertyExpression, Set<OWLLiteral>> entry) {
        super();
        dataProperty = entry.getKey().asOWLDataProperty();
        values = entry.getValue();
    }
    
    public String getIdentifier() {
        return getIdentifier(dataProperty);
    }
    
    public String getLabel() {
        return getLabel(dataProperty);
    }
    
    public String getComment() {
        return getComment(dataProperty);
    }
    
    public List<String> getValues() {
        List<String> literalList = new ArrayList<String>();
        for(OWLLiteral val: values) {
            literalList.add(val.getLiteral());
        }
        return literalList;
    }
    
}