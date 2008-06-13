package org.eclipse.emf.mwe.di;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.GeneratorFacade;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.ClassloaderClasspathUriResolver;

/**
 * Run this class in order to generate the Reference grammar.
 * 
 * @author Sven Efftinge - Initial contribution and API
 * @author Peter Friese
 */
public class mwe {
    private static final String PATH = "./src-gen";
    private static final String UI_PATH = "../org.eclipse.emf.mwe.di.ui_gen";

    public void generate() throws IOException {
        XtextStandaloneSetup.doSetup();

        GeneratorFacade.cleanFolder(PATH);

        String classpathUri = "classpath:/"+getClass().getName().replace('.', '/') + ".xtext";
        System.out.println("loading " + classpathUri);
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.createResource(new ClassloaderClasspathUriResolver().resolve(null, URI.createURI(classpathUri)));
        resource.load(null);
        Grammar grammarModel = (Grammar) resource.getContents().get(0);

        GeneratorFacade.generate(grammarModel, PATH, UI_PATH, "xtext", "mwe");
        System.out.println("Done.");
    }

    public static void main(String[] args) throws IOException {
        mwe generator = new mwe();
        generator.generate();
    }

}
