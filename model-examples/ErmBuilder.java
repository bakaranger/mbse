package de.tu_bs.cs.isf.mbse.erschema.resource.erm.mopp;

import java.util.Collection; 

import org.eclipse.core.runtime.IProgressMonitor; 
import org.eclipse.core.runtime.IStatus; 
import org.eclipse.core.runtime.Status; 
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.EObject; 
import org.eclipse.emf.ecore.util.EcoreUtil; 

import de.tu_bs.cs.isf.mbse.erschema.Model;
import de.tu_bs.cs.isf.mbse.erschema.resource.erm.IErmBuilder;
 

public class ErmBuilder implements IErmBuilder {
	
	public boolean isBuildingNeeded(final URI uri) {
		return true;
	}
	
	public IStatus build(final ErmResource resource, final IProgressMonitor monitor) {
 	     
		final Collection<EObject> content = EcoreUtil.copyAll(resource.getContents()); 
	 
	    final Model model = getModel(content);
	    
	    if (model == null)
	    	return Status.CANCEL_STATUS;
	     
	    final URI sqlUri = URI.createURI(resource.getURI().lastSegment() + ".sql").resolve(resource.getURI()); 
	    
	    
	    return Status.OK_STATUS; 
	}
	
	public Model getModel(final Collection<EObject> content) {
		for (final EObject obj : content)
			if (obj instanceof Model)
				return (Model)obj;
		return null;
	}
	
	/**
	 * Handles the deletion of the given resource. Nothing happens here.
	 */
	public IStatus handleDeletion(final URI uri, final IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}	
}
