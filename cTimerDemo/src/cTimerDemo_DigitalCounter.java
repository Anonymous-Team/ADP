import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author KTTH
 *
 */
public class cTimerDemo_DigitalCounter extends JFrame {
	JLabel lblCounter= new JLabel("Counter");
	JButton btnStart = new JButton("start"),
			btnStop  = new JButton("stop");
	Timer timCounter = null;
	int c =0;
	public cTimerDemo_DigitalCounter(){
		setTitle("Label Demo with image!");
		setSize( 300, 200);
		setLayout(null);
		
		add(lblCounter);
		add( btnStart);
		add( btnStop);
		
		btnStart.setBounds(10, 40, 80, 25);
		lblCounter.setBounds(10, 10, 80, 25);
		
		timCounter = new Timer(500, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				lblCounter.setText(""+ c);
				c++;
			}
		});
		
		btnStart.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timCounter.start();
				btnStart.setText( "stop");
				if( timCounter.isRunning() == true){
					// is running
				}
				else{
					// is stop
				}
			}
		});
		
		
		
		
	//	timCounter.start();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cTimerDemo_DigitalCounter mainwindow = new cTimerDemo_DigitalCounter();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	
	}

}
