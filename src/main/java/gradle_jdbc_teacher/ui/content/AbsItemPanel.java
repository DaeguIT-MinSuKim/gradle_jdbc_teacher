package gradle_jdbc_teacher.ui.content;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbsItemPanel<T> extends JPanel {

	public abstract T getItem();
	
	public abstract void setItem(T item);
	
	public abstract void clearTf();

	public abstract void validCheck();
}
