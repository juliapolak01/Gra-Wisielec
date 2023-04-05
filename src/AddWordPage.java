import javax.swing.*;
import java.awt.*;

public class AddWordPage extends javax.swing.JFrame implements Runnable{
    GUIModel model;
    AddWordPage(GUIModel model) {
        this.model = model;
    }

    public void run() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    private void initComponents() {
        Font font =  new java.awt.Font("Comic Sans MS", Font.PLAIN, 14);
        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(new java.awt.Color(60, 59, 68));
        jPanel5.setFont(font); // NOI18N

        JTextField wordTextField = new JTextField();
        wordTextField.setBackground(new java.awt.Color(32, 32, 39));
        wordTextField.setFont(new java.awt.Font("Comic Sans MS", Font.PLAIN, 24)); // NOI18N
        wordTextField.setForeground(new java.awt.Color(255, 255, 255));
        wordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wordTextField.setText("Enter a word");

        JRadioButton easyRadio = new JRadioButton();
        easyRadio.setBackground(new java.awt.Color(51, 51, 51));
        easyRadio.setFont(font); // NOI18N
        easyRadio.setForeground(new java.awt.Color(255, 255, 255));
        easyRadio.setSelected(true);
        easyRadio.setText("Easy Word");

        JRadioButton hardRadio = new JRadioButton();
        hardRadio.setBackground(new java.awt.Color(51, 51, 51));
        hardRadio.setFont(font); // NOI18N
        hardRadio.setForeground(new java.awt.Color(255, 255, 255));
        hardRadio.setText("Hard Word");

        JRadioButton mediumRadio = new JRadioButton();
        mediumRadio.setBackground(new java.awt.Color(51, 51, 51));
        mediumRadio.setFont(font); // NOI18N
        mediumRadio.setForeground(new java.awt.Color(255, 255, 255));
        mediumRadio.setText("Medium Word");
        mediumRadio.setActionCommand("Medium Word");

        JLabel infoLabel = new JLabel();
        infoLabel.setBackground(new java.awt.Color(51, 51, 51));
        infoLabel.setFont(font); // NOI18N
        infoLabel.setForeground(new java.awt.Color(102, 255, 102));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Operation was... ");

        JButton confirmBtn = new JButton();
        confirmBtn.setBackground(new java.awt.Color(14, 14, 14));
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("Add word");

        ButtonGroup group = new ButtonGroup();
        group.add(easyRadio);
        group.add(mediumRadio);
        group.add(hardRadio);

        // Rozmieszczenie elementów zrealizowane przez program do tworzenia GUI
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(easyRadio)
                .addGap(66, 66, 66)
                .addComponent(mediumRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hardRadio)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(easyRadio)
                    .addComponent(hardRadio)
                    .addComponent(mediumRadio))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        confirmBtn.addActionListener(e -> {
            if (checkDifficulty(easyRadio.isSelected(), mediumRadio.isSelected(), hardRadio.isSelected(), wordTextField)){
                try {
                    if (saveToFile(easyRadio.isSelected(), mediumRadio.isSelected(), hardRadio.isSelected(), wordTextField)){
                        infoLabel.setForeground(Color.GREEN);
                        infoLabel.setText("Success");

                    }else{
                        infoLabel.setForeground(Color.RED);
                        infoLabel.setText("Faliure: duplicate or not a word");
                    }
                } catch (IllegalCharacterException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Illegal character detected!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,
                        """
                                word length for easy: < 6
                                word length for medium: 5<x<12
                                word length for hard: 11<x<16""",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            infoLabel.setVisible(true);
        });
    }


    private boolean saveToFile(boolean easySelected, boolean mediumSelected, boolean hardSelected, JTextField textField) throws IllegalCharacterException {
        return model.saveToFile(easySelected, mediumSelected, hardSelected, textField);
    }

    private boolean checkDifficulty(boolean easySelected, boolean mediumSelected, boolean hardSelected, JTextField textField) {
        return model.checkDifficulty(easySelected, mediumSelected, hardSelected, textField);
    }

}
