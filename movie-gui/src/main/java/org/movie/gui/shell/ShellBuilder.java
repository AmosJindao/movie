package org.movie.gui.shell;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;

/**
 * @author amos
 * @date Aug 13, 2016
 * @version V0.1
 */
public class ShellBuilder {

	private ShellBuilder() {
	}

	public static ShellBuilder getInstance() {
		return ShellbuilderSingletonHolder.shellBuilder;
	}

	private static class ShellbuilderSingletonHolder {
		public static final ShellBuilder shellBuilder = new ShellBuilder();
	}

	public Shell getShell() {
		Display display = new Display();
		Shell shell = new Shell(display,SWT.SHELL_TRIM);
		return shell;
	}

	public void decorateShell(Shell shell,Layout rowLayout) {
		Display display = shell.getDisplay();

		int locationX = 100;
		int locationY = 100;
		shell.setLocation(locationX, locationY);

		Rectangle area = Display.getDefault().getClientArea();
		int fullScreenWidth = area.width;
		int fullScreemHeight = area.height;

		int shellWidth = fullScreenWidth - 2 * locationX;
		int shellHeight = fullScreemHeight - 2 * locationY;
		shell.setSize(shellWidth, shellHeight);

		shell.setText("amos tools");
		shell.setImage(new Image(display, "images/toolbox.png"));

		shell.setLayout(rowLayout);
		
//		GridLayout gridLayout = new GridLayout();
//		gridLayout.numColumns = 1;
//		gridLayout.

		// shell.setBackground(new Color(display, SWTRGBs.BLUE));
	}
}
