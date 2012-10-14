package qiren.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import qiren.view.CalculatorView;

public class UIMain {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		
		try {
			for (UIManager.LookAndFeelInfo info : UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CalculatorView().setVisible(true);
			}
		});
	}
}
