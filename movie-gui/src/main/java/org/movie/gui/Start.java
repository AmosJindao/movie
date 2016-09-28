package org.movie.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.jdbc.gui.menu.MenuBuilder;
import org.jdbc.gui.toolbar.ToolBarBuilder;
import org.movie.gui.shell.ShellBuilder;

/**
 * start here
 *
 */
public final class Start {
	public static void main(String[] args) {
		ShellBuilder shellBuilder = ShellBuilder.getInstance();

		Shell shell = shellBuilder.getShell();
		
		GridLayout shellGridLayout = new GridLayout(1,false);
		shellBuilder.decorateShell(shell,shellGridLayout);
//		| SWT.BORDER | SWT.CLOSE|SWT.TOP
		final CTabFolder mainFolder = new CTabFolder(shell, SWT.NONE );
		mainFolder.setLayout(new FillLayout());
//		mainFolder.marginHeight = 1;
//		mainFolder.marginWidth = 1;
//		mainFolder.setMaximizeVisible(true);
//		mainFolder.setMinimizeVisible(true);
		
		GridData leftFolderGridData = new GridData();
		leftFolderGridData.horizontalAlignment = SWT.FILL;
		leftFolderGridData.grabExcessHorizontalSpace = true;
		leftFolderGridData.verticalAlignment = GridData.FILL;
		leftFolderGridData.grabExcessVerticalSpace = true;
		
		mainFolder.setLayoutData(leftFolderGridData);
		
		CTabItem mainTab = new CTabItem(mainFolder, SWT.BOTTOM);
		mainTab.setText("主页");
//		| SWT.WRAP SWT.BORDER |
//		Text leftFolderItem1Text = new Text(mainFolder,  SWT.WRAP | SWT.MULTI);
//		leftFolderItem1Text.setBounds(3,3, 150, 150);
//		leftFolderItem1Text.setText("这是第 1 页");
//		leftFolderItem1.setControl(leftFolderItem1Text);
		
//		build(shell);

		shell.open();
		shell.layout();
		Display display = shell.getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
	
	private static void build(Shell shell){
		MenuBuilder menuBuilder = MenuBuilder.getInstance();
		menuBuilder.buildMenu(shell);
		
		ToolBarBuilder toolbarBuilder = ToolBarBuilder.getInstance();
		
		GridData toolBarGridData = new GridData();
		toolBarGridData.horizontalAlignment = GridData.BEGINNING;
//		toolBarGridData.grabExcessHorizontalSpace = true;
		toolBarGridData.heightHint = 60;
		toolbarBuilder.createToolBar(shell,toolBarGridData);
		
//		smashFormj
		
//		SWT.ALL
		Composite mainPane = new Composite(shell,SWT.None);
		GridLayout mainPaneGridLayout = new GridLayout(3,false);
		mainPane.setLayout(mainPaneGridLayout);
		
		GridData mainPaneGridData = new GridData();
		mainPaneGridData.horizontalAlignment = SWT.FILL;
		mainPaneGridData.grabExcessHorizontalSpace = true;
		mainPaneGridData.verticalAlignment = GridData.FILL;
		mainPaneGridData.grabExcessVerticalSpace = true;
		mainPaneGridData.widthHint = 1;
		
		mainPane.setLayoutData(mainPaneGridData);
		
		final CTabFolder leftFolder = new CTabFolder(mainPane, SWT.TOP | SWT.BORDER| SWT.CLOSE);
		leftFolder.setLayout(new FillLayout());
		leftFolder.marginHeight = 3;
		leftFolder.marginWidth = 1;
		leftFolder.setMaximizeVisible(true);
		leftFolder.setMinimizeVisible(true);
		
		GridData leftFolderGridData = new GridData();
//		leftFolderGridData.horizontalAlignment = SWT.FILL;
//		leftFolderGridData.grabExcessHorizontalSpace = true;
		leftFolderGridData.verticalAlignment = GridData.FILL;
		leftFolderGridData.grabExcessVerticalSpace = true;
		
		leftFolder.setLayoutData(leftFolderGridData);

		CTabItem leftFolderItem1 = new CTabItem(leftFolder, SWT.BOTTOM);
		leftFolderItem1.setText("选项卡1");
//		| SWT.WRAP SWT.BORDER |
		Text leftFolderItem1Text = new Text(leftFolder,  SWT.WRAP | SWT.MULTI);
//		leftFolderItem1Text.setBounds(3,3, 150, 150);
		leftFolderItem1Text.setText("这是第 1 页");
		leftFolderItem1.setControl(leftFolderItem1Text);
		
		CTabItem leftFolderItem2 = new CTabItem(leftFolder, SWT.NONE);
		leftFolderItem2.setText("选项卡2");
		Text leftFolderItem2Text = new Text(leftFolder, SWT.BORDER | SWT.WRAP | SWT.MULTI);
//		leftFolderItem1Text.setBounds(3,3, 150, 150);
		leftFolderItem2Text.setText("这是第 2 页");
		leftFolderItem2.setControl(leftFolderItem2Text);
		
//		leftFolder.pack();
//		
		Composite middleComposite = new Composite(mainPane,SWT.BORDER);
		middleComposite.setLayout(new FillLayout());
		
		GridData middleCompositeGridData = new GridData();
		middleCompositeGridData.horizontalAlignment = SWT.FILL;
		middleCompositeGridData.grabExcessHorizontalSpace = true;
		middleCompositeGridData.verticalAlignment = GridData.FILL;
		middleCompositeGridData.grabExcessVerticalSpace = true;
		
		middleComposite.setLayoutData(middleCompositeGridData);
		
		final CTabFolder middleCompositeFolder = new CTabFolder(middleComposite, SWT.TOP | SWT.BORDER| SWT.CLOSE);
		middleCompositeFolder.setLayout(new FillLayout());
		middleCompositeFolder.marginHeight = 5;
		middleCompositeFolder.marginWidth = 5;
		middleCompositeFolder.setMaximizeVisible(true);
		middleCompositeFolder.setMinimizeVisible(true);
		
		CTabItem middleCompositeFolderItem1 = new CTabItem(middleCompositeFolder, SWT.NONE);
		middleCompositeFolderItem1.setText("middle选项卡2");
		
		Text middleCompositeFolderItem1Text = new Text(middleCompositeFolder, SWT.BORDER | SWT.WRAP | SWT.MULTI);
		middleCompositeFolderItem1Text.setText("middle 这是第 2 页");
		
		middleCompositeFolderItem1.setControl(middleCompositeFolderItem1Text);
//		
//		middleComposite.pack();
		
//		MainAreaBuilder mainAreaBuilder = MainAreaBuilder.getInstance();
//		mainAreaBuilder.createMainArea(mainPane);
//		
//		mainPane.pack();

//		shell.pack();
	}
	
	static RowLayout genRowLayout(){
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = false;
		rowLayout.pack = false;
		rowLayout.justify = true;
		rowLayout.type = SWT.VERTICAL;
		rowLayout.marginLeft = 5;
		rowLayout.marginTop = 5;
		rowLayout.marginRight = 5;
		rowLayout.marginBottom = 5;
		rowLayout.spacing = 0;
		
		return rowLayout;
	}
}
