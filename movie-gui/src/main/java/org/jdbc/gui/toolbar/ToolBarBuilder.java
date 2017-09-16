package org.jdbc.gui.toolbar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

/**
 * @author amos
 * @date Aug 15, 2016
 * @version V0.1
 */
public class ToolBarBuilder {
	private ToolBarBuilder() {
	}

	private static volatile ToolBarBuilder instance = null;

	public static ToolBarBuilder getInstance() {
		if (instance == null) {
			synchronized (ToolBarBuilder.class) {
				if (instance == null) {
					instance = new ToolBarBuilder();
				}
			}
		}

		return instance;
	}

	public void createToolBar(Shell shell,Object LayoutData){
//		SWT.BORDER | SWT.VERTICAL
		ToolBar toolBar = new ToolBar(shell, SWT.FLAT | SWT.BORDER);
		toolBar.setLayoutData(LayoutData);
		ToolItem newItem = new ToolItem(toolBar,SWT.PUSH);
		//新建了一个ToolItem
		newItem.setImage(new Image(newItem.getDisplay(), "images/new.png"));
		//为这个ToolItem 设置一个图标
		newItem.setToolTipText("新建");//设置鼠标放在Item上时提示的语句；
//		newItem.addSelectionListener(new MenuItemListener(shell));
		//添加监听事件，MenuItemListener(shell)应该是继承
//		SelectionAdapter或者是SelectionListener的；
		new ToolItem(toolBar,SWT.SEPARATOR);//建立一个分隔符；
		
		ToolItem newItem1 = new ToolItem(toolBar,SWT.PUSH);
		//新建了一个ToolItem
//		newItem1.setImage(new Image(newItem.getDisplay(),"images//new.gif"));
		//为这个ToolItem 设置一个图标
		newItem1.setToolTipText("run");//设置鼠标放在Item上时提示的语句；
//		newItem.addSelectionListener(new MenuItemListener(shell));
		//添加监听事件，MenuItemListener(shell)应该是继承
//		SelectionAdapter或者是SelectionListener的；
		new ToolItem(toolBar,SWT.SEPARATOR);//建立一个分隔符；
		
	    toolBar.pack();
	}

}
