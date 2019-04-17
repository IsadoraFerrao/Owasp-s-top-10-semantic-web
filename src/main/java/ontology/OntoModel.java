package ontology;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.ConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

public class OntoModel {

    private String language;
    private OWLDataFactory factory;
    private OWLOntology ontology;
    private OWLOntologyManager manager;
    private OWLReasoner reasoner;
    
    private static OntoModel instance;
    
    private OntoModel(String url, String lang){
        IRI iri = IRI.create(url);
        language = lang;
        manager = OWLManager.createOWLOntologyManager();
        factory = manager.getOWLDataFactory();
        try {
            ontology = manager.loadOntologyFromOntologyDocument(iri);
        } catch (OWLOntologyCreationException ex) {
            Logger.getLogger(OntoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
        ConsoleProgressMonitor progressMonitor = new ConsoleProgressMonitor();
        OWLReasonerConfiguration config = new SimpleConfiguration(progressMonitor);
        reasoner = reasonerFactory.createReasoner(ontology, config);
        reasoner.precomputeInferences();  
    }
    
    public static OntoModel getInstance(String url, String lang){
        if(instance == null){
            instance = new OntoModel(url, lang);
        }
        return instance;
    }
    
    public String getLabel() {
        String label = null;
        Set<OWLAnnotation> annotationSet = instance.getOntology().getAnnotations();
        for (OWLAnnotation annotation : annotationSet) {
            if (annotation.containsEntityInSignature(instance.getFactory().getRDFSLabel())) {
                if (annotation.getValue() instanceof OWLLiteral) {
                    OWLLiteral value = (OWLLiteral) annotation.getValue();
                    if (value.hasLang(instance.getLanguage())) {
                        label = value.getLiteral();
                    }
                }
            }
        }
        return label;
    }
    
    public String getComment() {
        String comment = null;
        Set<OWLAnnotation> annotationSet = instance.getOntology().getAnnotations();
        for (OWLAnnotation annotation : annotationSet) {
            if (annotation.containsEntityInSignature(instance.getFactory().getRDFSComment())) {
                if (annotation.getValue() instanceof OWLLiteral) {
                    OWLLiteral value = (OWLLiteral) annotation.getValue();
                    if (value.hasLang(instance.getLanguage())) {
                        comment = value.getLiteral();
                    }
                }
            }
        }
        return comment;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public OWLDataFactory getFactory() {
        return factory;
    }

    public OWLOntology getOntology() {
        return ontology;
    }

    public OWLOntologyManager getManager() {
        return manager;
    }

    public OWLReasoner getReasoner() {
        return reasoner;
    }
    
}