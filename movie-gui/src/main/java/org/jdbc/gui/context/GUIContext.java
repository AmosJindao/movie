package org.jdbc.gui.context;

import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author amos
 * @date Sep 12, 2016
 * @version V0.1
 */
public class GUIContext {
	private Display display;
	private Shell shell;
	private CTabFolder mainTabFolder;
	private CTabItem mainItem;

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public CTabFolder getMainTabFolder() {
		return mainTabFolder;
	}

	public void setMainTabFolder(CTabFolder mainTabFolder) {
		this.mainTabFolder = mainTabFolder;
	}

	public CTabItem getMainItem() {
		return mainItem;
	}

	public void setMainItem(CTabItem mainItem) {
		this.mainItem = mainItem;
	}
	
}
