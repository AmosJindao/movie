package org.movie.gui;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

/**
 * start here
 *
 */
public class Start {
	public static void main(String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("hello world! Window");
		
		Menu menu = new Menu(shell);
//		Button  button = new Button(shell,1);
//		
//		button.setForeground(new Color(display,255,255,0));
//		
//		button.setBounds(3, 3, 20,20);
		
//		menu.setDefaultItem();
		
		new MenuItem(menu,0);
		
		menu.setVisible(true);
		menu.setLocation(5, 5);
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
