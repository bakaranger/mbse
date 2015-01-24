/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.erschema.generator;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status; 
import org.eclipse.emf.common.util.EList; 
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.EObject; 
import org.eclipse.emf.ecore.util.EcoreUtil; 

import de.tu_bs.cs.isf.mbse.erschema.Entity;
import de.tu_bs.cs.isf.mbse.erschema.Model;
import de.tu_bs.cs.isf.mbse.erschema.db.TestDB;
import de.tu_bs.cs.isf.mbse.erschema.resource.erm.IErmBuilder;
import de.tu_bs.cs.isf.mbse.erschema.resource.erm.mopp.ErmResource;
 

public class ErmBuilder implements IErmBuilder {
	
	public boolean isBuildingNeeded(URI uri) {
		return true;
	}
	
	@Override
	public IStatus build(ErmResource resource, IProgressMonitor monitor) {
		// get contents and create copy 
	    final EList<EObject> contents = resource.getContents(); 
	    final Collection<EObject> contentsCopy = EcoreUtil.copyAll(contents); 
	 
	    // create new resource 
	    final URI sqlUri = URI.createURI(resource.getURI().lastSegment() + ".sql").resolve(resource.getURI()); 
	    final StringBuilder sqlContent = new StringBuilder();
	    String modelName;
	    
	    for (final EObject obj : contentsCopy) {
	    	if (obj instanceof Model) {
	    		modelName = ((Model) obj).getName();
	    	} else if (obj instanceof Entity) {
	    		
	    	}
	    }
	    	    
	    TestDB.query(sqlContent.toString());	    
	    return Status.OK_STATUS; 
	}
	
	/**
	 * Handles the deletion of the given resource.
	 */
	public IStatus handleDeletion(URI uri, IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}	
}
