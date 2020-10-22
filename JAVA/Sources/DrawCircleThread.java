import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawCircleThread extends JFrame {
	DrawPane dPane;
	
	public DrawCircleThread() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		MenuPane mPane = new MenuPane();
		dPane = new DrawPane();
		add(mPane, BorderLayout.NORTH);
		add(dPane, BorderLayout.CENTER);
				
		setVisible(true);
	}
	
	class MenuPane extends JPanel {
		DrawThread dt;
		JToggleButton btnPause;
		
		public MenuPane() {
			setBackground(Color.LIGHT_GRAY);
			MyListener l = new MyListener();
			
			JButton btnStart = new JButton("Start");
			btnPause = new JToggleButton("Pause");
			JButton btnStop= new JButton("Stop");
				add(btnStart);
				add(btnPause);
				add(btnStop);
				btnStart.addActionListener(l);
				btnPause.addActionListener(l);
				btnStop.addActionListener(l);
				
			dt = new DrawThread();
		}
		
		class MyListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "Start" :
					if(!dt.isAlive() || dt==null) {
						dt = new DrawThread();
						dt.start();
					}
					dt.pause = false;
					break;
				case "Pause" :
					if(btnPause.isSelected())
						dt.pause=true;
					else
						dt.pause=false;
					break;
				case "Stop" :
					dt.mRun = false;
				}
			}
		}
	}
	
	class DrawThread extends Thread {
		boolean pause = false, mRun = true;
		@Override
		public void run() {
			while(mRun) {
				if(pause) continue;
				dPane.getParent().repaint();
			}
		}
	}
	
	class DrawPane extends JPanel {
		int x = 100, y = 100;
		@Override
		protected void paintComponent(Graphics g) {
			g.fillOval(x, y, 20, 20);
			x=(int)(Math.random()*300);
			y=(int)(Math.random()*300);
		}
	}
	
	public static void main(String[] args) {
		new DrawCircleThread();
	}
}
