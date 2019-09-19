package br.bruno.tictactoegamegraphic;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WelcomeTicTacToe extends JFrame {
	
	private JButton startButton;
    private JLabel title;
    private JLabel labelnamePlayerOne;
    private JLabel labelnamePlayerTwo;
    private JPanel screen;
    private JPanel playersName;
    private JTextField namePlayerOne;
    private JTextField namePlayerTwo;

    public WelcomeTicTacToe() {
        initComponents();
    }
                             
    private void initComponents() {

        screen = new JPanel();
        title = new JLabel();
        playersName = new JPanel();
        labelnamePlayerOne = new JLabel();
        labelnamePlayerTwo = new JLabel();
        namePlayerOne = new JTextField();
        namePlayerTwo = new JTextField();
        startButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to TicTacToe!");
        setResizable(false);

        title.setFont(new java.awt.Font("Ubuntu", 1, 24));
        title.setText("TicTacToe");
        playersName.setBorder(javax.swing.BorderFactory.createTitledBorder("Name of players"));
        labelnamePlayerOne.setText("Player One:");
        labelnamePlayerTwo.setText("Player Two:");

        javax.swing.GroupLayout playersNameLayout = new javax.swing.GroupLayout(playersName);
        playersName.setLayout(playersNameLayout);
        playersNameLayout.setHorizontalGroup(
            playersNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playersNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playersNameLayout.createSequentialGroup()
                        .addComponent(labelnamePlayerTwo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namePlayerTwo))
                    .addGroup(playersNameLayout.createSequentialGroup()
                        .addComponent(labelnamePlayerOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namePlayerOne)))
                .addContainerGap())
        );
        playersNameLayout.setVerticalGroup(
            playersNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersNameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(playersNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnamePlayerOne)
                    .addComponent(namePlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(playersNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnamePlayerTwo)
                    .addComponent(namePlayerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout screenLayout = new javax.swing.GroupLayout(screen);
        screen.setLayout(screenLayout);
        screenLayout.setHorizontalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(108, 108, 108))
            .addGroup(screenLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(playersName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(screenLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screenLayout.setVerticalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playersName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }                                 
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.getLabelPlayerOne().setText(namePlayerOne.getText());
        ticTacToe.getLabelPlayerTwo().setText(namePlayerTwo.getText());
        ticTacToe.initMatch();
        ticTacToe.setVisible(true);
        this.dispose();
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeTicTacToe().setVisible(true);
            }
        });
    }                      
}
