package ontology;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.reasoner.Node;

public class OntoClass extends OntoEntity {

    private OWLClass owlClass;

    public OntoClass() {
        super();
        owlClass = ontoModel.getFactory().getOWLThing();
    }

    public OntoClass(String id) { //id da classe - set new iri passando a iri da classe que quer
        super();
        IRI iri = IRI.create(id);
        owlClass = ontoModel.getFactory().getOWLClass(iri);
    }

    public OntoClass(OWLClass cls) {
        super();
        owlClass = cls;
    }

    public String getIdentifier() {
        return getIdentifier(owlClass);
    }

    public String getLabel() {
        return getLabel(owlClass);
    }

    public String getComment() {
        return getComment(owlClass);
    }

    public List<OntoClass> getSuperClasses() {
        if (!owlClass.isTopEntity()) {
            List<OntoClass> classList = new ArrayList<OntoClass>();
            Set<Node<OWLClass>> superClasses = ontoModel.getReasoner().getSuperClasses(owlClass, true).getNodes();
            for (Node<OWLClass> node : superClasses) {
                String key = node.getRepresentativeElement().toStringID();
                classList.add(new OntoClass(key));
            }
            return classList;
        } else {
            return null;
        }
    }

    public List<OntoClass> getSubClasses() {
        if (!owlClass.isBottomEntity()) {
            List<OntoClass> classList = new ArrayList<OntoClass>();
            Set<Node<OWLClass>> subClasses = ontoModel.getReasoner().getSubClasses(owlClass, true).getNodes();
            for (Node<OWLClass> node : subClasses) {
                String key = node.getRepresentativeElement().toStringID();
                classList.add(new OntoClass(key));
            }
            return classList;
        } else {
            return null;
        }

    }

    public List<OntoIndividual> getIndividuals() {
        List<OntoIndividual> individualList = new ArrayList<OntoIndividual>();
        Set<OWLIndividual> individuals = owlClass.getIndividuals(ontoModel.getOntology());
        for (OWLIndividual ind : individuals) {
            individualList.add(new OntoIndividual(ind));
        }
        return individualList;
    }

    public Object getOntologies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OWLOntology createOntology() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}