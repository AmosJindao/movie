package org.jdbc.gui.mainarea;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

/**
 * @author amos
 * @date Aug 16, 2016
 * @version V0.1
 */
public final class MainAreaBuilder {

	private MainAreaBuilder() {
	}

	private static volatile MainAreaBuilder instance = null;

	public static MainAreaBuilder getInstance() {
		if (instance == null) {
			synchronized (MainAreaBuilder.class) {
				if (instance == null) {
					instance = new MainAreaBuilder();
				}
			}
		}

		return instance;
	}

	public void createMainArea(Composite parent) {
		 final TabFolder tabFolder = new TabFolder(parent, SWT.BOTTOM);
		
		 tabFolder.setLayout(new FillLayout());
		
		 TabItem item = new TabItem(tabFolder, SWT.NONE);
		 item.setText("选项卡 ");
		
		 Text t = new Text(tabFolder, SWT.MULTI);
		 t.setText("这是第 1 页");
		 item.setControl(t);
		
		 tabFolder.pack();
		
		createCFolder(parent);
	}
	
	private void createCFolder(Composite shell){
//		final CTabFolder tabFolder = new CTabFolder(shell, SWT.TOP | SWT.CLOSE | SWT.BORDER);
		final CTabFolder tabFolder = new CTabFolder(shell, SWT.TOP | SWT.BORDER);
		tabFolder.setTabHeight(20);
		tabFolder.setLayout(new FillLayout());
		tabFolder.marginHeight = 10;
		tabFolder.marginWidth = 10;
		// 显示“最大化、最小化”按钮
		tabFolder.setMaximizeVisible(true);
		tabFolder.setMinimizeVisible(true);

		CTabItem item = new CTabItem(tabFolder, SWT.NONE);
		item.setText("选项卡c ");
		Text t = new Text(tabFolder, SWT.MULTI);
		t.setBounds(5, 5, 150, 150);
		t.setText("这是第 1 页");
		item.setControl(t);
		tabFolder.pack();
	}
}
