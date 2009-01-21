/*
Generated with Xtext
*/

package org.eclipse.emf.mwe.di;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ui.common.editor.contentassist.impl.IContentAssistInvocationHandler;
import org.eclipse.xtext.ui.common.xtend.AbstractXtendService;
import org.eclipse.xtext.ui.common.xtend.NoSuchExtensionException;

/**
 * A {@link IContentAssistInvocationHandler} that calls Xtend extensions.
 * 
 * @author Jan K�hnlein - Initial contribution and API
 */
public class MWEXtendContentAssistInvoker extends AbstractXtendService implements IContentAssistInvocationHandler {

	private static final Logger log = Logger.getLogger(MWEXtendContentAssistInvoker.class);

	@Override
	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}
	
	@Override
	protected String getMasterXtendFileName() {
		// TODO fix in template: use once generated xtend file 
		return "org::eclipse::emf::mwe::di::MWEProposalProvider";
	}
	
	@SuppressWarnings("unchecked")
	public List<? extends ICompletionProposal> invoke(String functionName, List<Class<?>> parameterTypes,
			List<?> parameterValues) {
		try {
			Object result = invokeExtension(functionName, parameterValues);
			List<ICompletionProposal> proposals = (List<ICompletionProposal>) result;
			return proposals;
		}
		catch(NoSuchExtensionException nsee) {
			return null;
		}
		catch(ClassCastException cce) {
			log.error("Extension " + functionName + " must return a Collection of ICompletionProposals.", cce);
		}
		catch(Throwable e) {
			log.error("Error invoking extension " + functionName, e);
		}
		return null;
	}
}
