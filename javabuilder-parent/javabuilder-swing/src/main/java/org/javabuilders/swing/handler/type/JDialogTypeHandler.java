/**
 * 
 */
package org.javabuilders.swing.handler.type;

import java.util.Map;
import java.util.Set;

import javax.swing.JDialog;
import javax.swing.JMenuBar;

import org.javabuilders.BuildException;
import org.javabuilders.BuildProcess;
import org.javabuilders.BuilderConfig;
import org.javabuilders.Node;
import org.javabuilders.handler.ITypeHandlerFinishProcessor;

/**
 * Handles JDialogs
 * @author Jacek Furmankiewicz
 *
 */
public class JDialogTypeHandler implements ITypeHandlerFinishProcessor {

	private static final JDialogTypeHandler singleton = new JDialogTypeHandler();
	
	/**
	 * @return Singleton
	 */
	public static JDialogTypeHandler getInstance() {return singleton;}
	
	/* (non-Javadoc)
	 * @see org.javabuilders.handler.ITypeHandlerFinishProcessor#finish(org.javabuilders.BuilderConfig, org.javabuilders.BuildProcess, org.javabuilders.Node, java.lang.String, java.util.Map)
	 */
	public void finish(BuilderConfig config, BuildProcess process,
			Node current, String key, Map<String, Object> typeDefinition)
			throws BuildException {

		JDialog dialog = (JDialog) current.getMainObject();
		Set<Node> menus = current.getChildNodes(JMenuBar.class);
		for(Node node : menus) {
			JMenuBar bar = (JMenuBar) node.getMainObject();
			dialog.setJMenuBar(bar);
			break; //if there are more than one defined, just take the first one
		}

	}

}
