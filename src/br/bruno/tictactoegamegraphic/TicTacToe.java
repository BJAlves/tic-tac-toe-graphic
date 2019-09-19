package br.bruno.tictactoegamegraphic;

import br.bruno.tictactoegamelogic.Match;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TicTacToe extends JFrame {
	
	private JLabel jLabelPlayerOne;
    private JLabel jLabelPlayerTwo;
    private JLabel jLabelSymbolPlayerOne;
    private JLabel jLabelSymbolPlayerTwo;
    private JPanel jPanelBoard;
    private JPanel jPanelPlayerInformation;
    private JPanel jPanelGameLog;
    private JScrollPane jScrollPane;
    private JTextArea gameLog;
    private JLabel labelPlayerOne;
    private JLabel labelPlayerTwo;
    private JButton square00;
    private JButton square01;
    private JButton square02;
    private JButton square10;
    private JButton square11;
    private JButton square12;
    private JButton square20;
    private JButton square21;
    private JButton square22;
    private Match match;

    public TicTacToe() {
        initComponents();
    }
    
    public void initMatch() {
    	this.match = new Match(this);
    }
       
    private void initComponents() {
        jPanelBoard = new JPanel();
        square00 = new JButton();
        square01 = new JButton();
        square02 = new JButton();
        square10 = new JButton();
        square11 = new JButton();
        square12 = new JButton();
        square20 = new JButton();
        square21 = new JButton();
        square22 = new JButton();
        jPanelPlayerInformation = new JPanel();
        jLabelPlayerOne = new JLabel();
        jLabelPlayerTwo = new JLabel();
        labelPlayerOne = new JLabel();
        labelPlayerTwo = new JLabel();
        jLabelSymbolPlayerOne = new JLabel();
        jLabelSymbolPlayerTwo = new JLabel();
        jPanelGameLog = new JPanel();
        jScrollPane = new JScrollPane();
        gameLog = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanelBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        square00.addActionListener(match);
        square01.addActionListener(match);
        square02.addActionListener(match);
        square10.addActionListener(match);
        square11.addActionListener(match);
        square12.addActionListener(match);
        square20.addActionListener(match);
        square21.addActionListener(match);
        square22.addActionListener(match);

        javax.swing.GroupLayout jPanelBoardLayout = new javax.swing.GroupLayout(jPanelBoard);
        jPanelBoard.setLayout(jPanelBoardLayout);
        jPanelBoardLayout.setHorizontalGroup(
            jPanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBoardLayout.createSequentialGroup()
                        .addComponent(square00, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(square01, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(square02, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBoardLayout.createSequentialGroup()
                        .addComponent(square20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(square21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(square22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBoardLayout.createSequentialGroup()
                        .addComponent(square10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(square11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(square12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelBoardLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {square00, square01, square02, square10, square11, square12, square20, square21, square22});

        jPanelBoardLayout.setVerticalGroup(
            jPanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(square01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(square00, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBoardLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {square00, square01, square02, square10, square11, square12, square20, square21, square22});

        jPanelPlayerInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Players' information"));

        jLabelPlayerOne.setText("Player one:");

        jLabelPlayerTwo.setText("Player two:");

        jLabelSymbolPlayerOne.setText("Symbol: X");

        jLabelSymbolPlayerTwo.setText("Symbol: O");

        javax.swing.GroupLayout jPanelPlayerInformationLayout = new javax.swing.GroupLayout(jPanelPlayerInformation);
        jPanelPlayerInformation.setLayout(jPanelPlayerInformationLayout);
        jPanelPlayerInformationLayout.setHorizontalGroup(
            jPanelPlayerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlayerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlayerInformationLayout.createSequentialGroup()
                        .addComponent(jLabelPlayerOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSymbolPlayerOne))
                    .addGroup(jPanelPlayerInformationLayout.createSequentialGroup()
                        .addComponent(jLabelPlayerTwo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPlayerTwo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSymbolPlayerTwo)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanelPlayerInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelPlayerOne, jLabelPlayerTwo, labelPlayerOne, labelPlayerTwo});

        jPanelPlayerInformationLayout.setVerticalGroup(
            jPanelPlayerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerInformationLayout.createSequentialGroup()
                .addGroup(jPanelPlayerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPlayerOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPlayerOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSymbolPlayerOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPlayerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlayerInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPlayerTwo)
                        .addComponent(labelPlayerTwo))
                    .addComponent(jLabelSymbolPlayerTwo))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanelPlayerInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelPlayerOne, jLabelPlayerTwo, labelPlayerOne, labelPlayerTwo});

        jPanelGameLog.setBorder(javax.swing.BorderFactory.createTitledBorder("Game's log"));

        gameLog.setEditable(false);
        gameLog.setColumns(20);
        gameLog.setRows(5);
        jScrollPane.setViewportView(gameLog);

        javax.swing.GroupLayout jPanelGameLogLayout = new javax.swing.GroupLayout(jPanelGameLog);
        jPanelGameLog.setLayout(jPanelGameLogLayout);
        jPanelGameLogLayout.setHorizontalGroup(
            jPanelGameLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        jPanelGameLogLayout.setVerticalGroup(
            jPanelGameLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameLogLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGameLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelPlayerInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPanelPlayerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelGameLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                        
    
    public void setLabelPlayerOne(javax.swing.JLabel labelPlayerOne) {
		this.labelPlayerOne = labelPlayerOne;
	}
    
    public javax.swing.JLabel getLabelPlayerOne() {
		return labelPlayerOne;
	}
    
    public void setLabelPlayerTwo(javax.swing.JLabel labelPlayerTwo) {
		this.labelPlayerTwo = labelPlayerTwo;
	}
    
    public javax.swing.JLabel getLabelPlayerTwo() {
		return labelPlayerTwo;
	}
    
    public javax.swing.JTextArea getGameLog() {
		return gameLog;
	}
    
    public javax.swing.JButton getSquare00() {
		return square00;
	}
    
    public javax.swing.JButton getSquare01() {
		return square01;
	}
    
    public javax.swing.JButton getSquare02() {
		return square02;
	}
    
    public javax.swing.JButton getSquare10() {
		return square10;
	}
    
    public javax.swing.JButton getSquare11() {
		return square11;
	}
    
    public javax.swing.JButton getSquare12() {
		return square12;
	}
    
    public javax.swing.JButton getSquare20() {
		return square20;
	}
    
    public javax.swing.JButton getSquare21() {
		return square21;
	}
    
    public javax.swing.JButton getSquare22() {
		return square22;
	}
    
    public void restartGame() {
    	WelcomeTicTacToe welcomeTicTacToe = new WelcomeTicTacToe();
    	welcomeTicTacToe.setVisible(true);
    	this.dispose();
    }
}

