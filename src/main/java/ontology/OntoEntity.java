package ontology;

import java.util.Set;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLLiteral;

public abstract class OntoEntity {
    
    protected OntoModel ontoModel;
    
    protected OntoEntity() {
        ontoModel = OntoModel.getInstance("file:///C:/Users/isado/Desktop/mavenproject1/owl/vulnerabilidadesFinal.owl", "pt");
    }
    
    protected String getIdentifier(OWLEntity entity) {
        return entity.toStringID();
    }
    
    protected String getLabel(OWLEntity entity) {
        String label = null;
        Set<OWLAnnotation> annotationSet = entity.getAnnotations(ontoModel.getOntology());
        for (OWLAnnotation annotation : annotationSet) {
            if (annotation.containsEntityInSignature(ontoModel.getFactory().getRDFSLabel())) {
                if (annotation.getValue() instanceof OWLLiteral) {
                    OWLLiteral value = (OWLLiteral) annotation.getValue();
                    if (value.hasLang(ontoModel.getLanguage())) {
                        label = value.getLiteral();
                    }
                }
            }
        }
        return label;
    }
    
    protected String getComment(OWLEntity entity) {
        String comment = null;
        Set<OWLAnnotation> annotationSet = entity.getAnnotations(ontoModel.getOntology());
        for (OWLAnnotation annotation : annotationSet) {
            if (annotation.containsEntityInSignature(ontoModel.getFactory().getRDFSComment())) {
                if (annotation.getValue() instanceof OWLLiteral) {
                    OWLLiteral value = (OWLLiteral) annotation.getValue();
                    if (value.hasLang(ontoModel.getLanguage())) {
                        comment = value.getLiteral();
                    }
                }
            }
        }
        return comment;
    }
    
}
