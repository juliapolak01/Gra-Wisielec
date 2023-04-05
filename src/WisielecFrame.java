import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;


public class WisielecFrame extends javax.swing.JFrame implements Runnable {
    GUIModel model;

    // Elementy globalne
    private javax.swing.JLabel picLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField textField;
    private final LinkedList<JButton> btnCollection = new LinkedList<>();

    public WisielecFrame() {
        this.model = new GUIModel();
        chooseLevel();
    }

    public void run() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setResizable(false);
    }


    private void initComponents() {
        // Panel główny
        mainPanel = new javax.swing.JPanel();
        mainPanel.setBackground(new java.awt.Color(39, 39, 39));
        mainPanel.setBorder(new javax.swing.border.MatteBorder(null));
        mainPanel.setForeground(new java.awt.Color(23, 23, 23));

        // Tworzenie miejsca na wyświeltenie rysunków wisielca
        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(new java.awt.Color(60, 59, 68));
        picLabel = new javax.swing.JLabel();


        // Tworzenie panelu do wyświwietlania słowa
        JPanel textPanel = new JPanel();
        textPanel.setBackground(new java.awt.Color(60, 59, 68));

        textField = new javax.swing.JTextField();
        textField.setBackground(new java.awt.Color(32, 32, 39));
        textField.setFont(new java.awt.Font("Comic sans", Font.ITALIC, 24)); // NOI18N
        textField.setForeground(new java.awt.Color(255, 255, 255));
        textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField.setText(setWord());
        textField.setEditable(false);


        // Tworzenie panelu do wyświetlenia loga
        JLabel logoLabel = new JLabel();
        ImageIcon icon = new ImageIcon("logo.png");
        logoLabel.setIcon(icon);

        // Tworzenie przyciskiów na klawiaturze
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setBackground(new java.awt.Color(60, 59, 68));
        JButton aBtn = new JButton();
        JButton cBtn = new JButton();
        JButton bBtn = new JButton();
        JButton dBtn = new JButton();
        JButton eBtn = new JButton();
        JButton fBtn = new JButton();
        JButton gBtn = new JButton();
        JButton hBtn = new JButton();
        JButton iBtn = new JButton();
        JButton jBtn = new JButton();
        JButton kBtn = new JButton();
        JButton lBtn = new JButton();
        JButton mBtn = new JButton();
        JButton nBtn = new JButton();
        JButton oBtn = new JButton();
        JButton pBtn = new JButton();
        JButton qBtn = new JButton();
        JButton rBtn = new JButton();
        JButton sBtn = new JButton();
        JButton tBtn = new JButton();
        JButton uBtn = new JButton();
        JButton vBtn = new JButton();
        JButton wBtn = new JButton();
        JButton xBtn = new JButton();
        JButton yBtn = new JButton();
        JButton zBtn = new JButton();

        // Panel boczny klawiaury
        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(new java.awt.Color(60, 59, 68));
        JButton btnAddWord = new JButton();
        JButton btnGuessWord = new JButton();
        JButton btnRestart = new JButton();
        Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 15);


        aBtn.setBackground(new java.awt.Color(14, 14, 14));
        aBtn.setFont(btnFont); // NOI18N
        aBtn.setForeground(new java.awt.Color(255, 255, 255));
        aBtn.setText("A");
        aBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(aBtn);

        cBtn.setBackground(new java.awt.Color(14, 14, 14));
        cBtn.setFont(btnFont); // NOI18N
        cBtn.setForeground(new java.awt.Color(255, 255, 255));
        cBtn.setText("C");
        cBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(cBtn);


        bBtn.setBackground(new java.awt.Color(14, 14, 14));
        bBtn.setFont(btnFont); // NOI18N
        bBtn.setForeground(new java.awt.Color(255, 255, 255));
        bBtn.setText("B");
        bBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(bBtn);


        dBtn.setBackground(new java.awt.Color(14, 14, 14));
        dBtn.setFont(btnFont); // NOI18N
        dBtn.setForeground(new java.awt.Color(255, 255, 255));
        dBtn.setText("D");
        dBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(dBtn);


        eBtn.setBackground(new java.awt.Color(14, 14, 14));
        eBtn.setFont(btnFont); // NOI18N
        eBtn.setForeground(new java.awt.Color(255, 255, 255));
        eBtn.setText("E");
        eBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(eBtn);

        fBtn.setBackground(new java.awt.Color(14, 14, 14));
        fBtn.setFont(btnFont); // NOI18N
        fBtn.setForeground(new java.awt.Color(255, 255, 255));
        fBtn.setText("F");
        fBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(fBtn);


        gBtn.setBackground(new java.awt.Color(14, 14, 14));
        gBtn.setFont(btnFont); // NOI18N
        gBtn.setForeground(new java.awt.Color(255, 255, 255));
        gBtn.setText("G");
        gBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(gBtn);


        hBtn.setBackground(new java.awt.Color(14, 14, 14));
        hBtn.setFont(btnFont); // NOI18N
        hBtn.setForeground(new java.awt.Color(255, 255, 255));
        hBtn.setText("H");
        hBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(hBtn);


        iBtn.setBackground(new java.awt.Color(14, 14, 14));
        iBtn.setFont(btnFont); // NOI18N
        iBtn.setForeground(new java.awt.Color(255, 255, 255));
        iBtn.setText("I");
        iBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(iBtn);

        jBtn.setBackground(new java.awt.Color(14, 14, 14));
        jBtn.setFont(btnFont); // NOI18N
        jBtn.setForeground(new java.awt.Color(255, 255, 255));
        jBtn.setText("J");
        jBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(jBtn);


        kBtn.setBackground(new java.awt.Color(14, 14, 14));
        kBtn.setFont(btnFont); // NOI18N
        kBtn.setForeground(new java.awt.Color(255, 255, 255));
        kBtn.setText("K");
        kBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(kBtn);


        lBtn.setBackground(new java.awt.Color(14, 14, 14));
        lBtn.setFont(btnFont); // NOI18N
        lBtn.setForeground(new java.awt.Color(255, 255, 255));
        lBtn.setText("L");
        lBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(lBtn);


        mBtn.setBackground(new java.awt.Color(14, 14, 14));
        mBtn.setFont(btnFont); // NOI18N
        mBtn.setForeground(new java.awt.Color(255, 255, 255));
        mBtn.setText("M");
        mBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(mBtn);

        nBtn.setBackground(new java.awt.Color(14, 14, 14));
        nBtn.setFont(btnFont); // NOI18N
        nBtn.setForeground(new java.awt.Color(255, 255, 255));
        nBtn.setText("N");
        nBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(nBtn);


        oBtn.setBackground(new java.awt.Color(14, 14, 14));
        oBtn.setFont(btnFont); // NOI18N
        oBtn.setForeground(new java.awt.Color(255, 255, 255));
        oBtn.setText("O");
        oBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(oBtn);


        pBtn.setBackground(new java.awt.Color(14, 14, 14));
        pBtn.setFont(btnFont); // NOI18N
        pBtn.setForeground(new java.awt.Color(255, 255, 255));
        pBtn.setText("P");
        pBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(pBtn);


        qBtn.setBackground(new java.awt.Color(14, 14, 14));
        qBtn.setFont(btnFont); // NOI18N
        qBtn.setForeground(new java.awt.Color(255, 255, 255));
        qBtn.setText("Q");
        qBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(qBtn);

        rBtn.setBackground(new java.awt.Color(14, 14, 14));
        rBtn.setFont(btnFont); // NOI18N
        rBtn.setForeground(new java.awt.Color(255, 255, 255));
        rBtn.setText("R");
        rBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(rBtn);


        sBtn.setBackground(new java.awt.Color(14, 14, 14));
        sBtn.setFont(btnFont); // NOI18N
        sBtn.setForeground(new java.awt.Color(255, 255, 255));
        sBtn.setText("S");
        sBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(sBtn);


        tBtn.setBackground(new java.awt.Color(14, 14, 14));
        tBtn.setFont(btnFont); // NOI18N
        tBtn.setForeground(new java.awt.Color(255, 255, 255));
        tBtn.setText("T");
        tBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(tBtn);


        uBtn.setBackground(new java.awt.Color(14, 14, 14));
        uBtn.setFont(btnFont); // NOI18N
        uBtn.setForeground(new java.awt.Color(255, 255, 255));
        uBtn.setText("U");
        uBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        uBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(uBtn);


        vBtn.setBackground(new java.awt.Color(14, 14, 14));
        vBtn.setFont(btnFont); // NOI18N
        vBtn.setForeground(new java.awt.Color(255, 255, 255));
        vBtn.setText("V");
        vBtn.setToolTipText("");
        vBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(vBtn);


        wBtn.setBackground(new java.awt.Color(14, 14, 14));
        wBtn.setFont(btnFont); // NOI18N
        wBtn.setForeground(new java.awt.Color(255, 255, 255));
        wBtn.setText("W");
        wBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(wBtn);


        xBtn.setBackground(new java.awt.Color(14, 14, 14));
        xBtn.setFont(btnFont); // NOI18N
        xBtn.setForeground(new java.awt.Color(255, 255, 255));
        xBtn.setText("X");
        xBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(xBtn);


        yBtn.setBackground(new java.awt.Color(14, 14, 14));
        yBtn.setFont(btnFont); // NOI18N
        yBtn.setForeground(new java.awt.Color(255, 255, 255));
        yBtn.setText("Y");
        yBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(yBtn);


        zBtn.setBackground(new java.awt.Color(14, 14, 14));
        zBtn.setFont(btnFont); // NOI18N
        zBtn.setForeground(new java.awt.Color(255, 255, 255));
        zBtn.setText("Z");
        zBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        zBtn.setMargin(new Insets(0, 0, 0, 0));
        btnCollection.add(zBtn);


        btnAddWord.setBackground(new java.awt.Color(14, 14, 14));
        btnAddWord.setFont(btnFont); // NOI18N
        btnAddWord.setForeground(new java.awt.Color(255, 255, 255));
        btnAddWord.setText("Add a word");
        btnAddWord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnGuessWord.setBackground(new java.awt.Color(14, 14, 14));
        btnGuessWord.setFont(btnFont); // NOI18N
        btnGuessWord.setForeground(new java.awt.Color(255, 255, 255));
        btnGuessWord.setText("Guess Word");
        btnGuessWord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRestart.setBackground(new java.awt.Color(14, 14, 14));
        btnRestart.setFont(btnFont); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 255, 255));
        btnRestart.setText("Restart");
        btnRestart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        /// Rozmieszczenie elementów realizowane przez program do tworzenia GUI ///
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(btnAddWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGuessWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuessWord, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddWord, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(keyboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
                imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(imagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addContainerGap())
        );
        imagePanelLayout.setVerticalGroup(
                imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(imagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
                textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
        );
        textPanelLayout.setVerticalGroup(
                textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );


        javax.swing.GroupLayout keyboardPanelLayout = new javax.swing.GroupLayout(keyboardPanel);
        keyboardPanel.setLayout(keyboardPanelLayout);
        keyboardPanelLayout.setHorizontalGroup(
                keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                                .addComponent(iBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(kBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(mBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(oBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                                .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(gBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                                                .addComponent(yBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(zBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                                                .addComponent(qBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(rBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(tBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(wBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(xBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        keyboardPanelLayout.setVerticalGroup(
                keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(iBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(qBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(wBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(yBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(zBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();


        //Obsluga guzikow

        ActionListener btnListener = e -> {
            for (JButton btn : btnCollection) {
                if (e.getSource() == btn) {
                    char c = btn.getText().toLowerCase().charAt(0);
                    addLetter(c);
                    btn.setEnabled(false);
                    setLives(c);
                }
            }
            displayString(checkWord());
            setPicture(picLabel);
            checkGameState();
        };

        for (JButton btn : btnCollection) {
            btn.addActionListener(btnListener);
        }

        btnRestart.addActionListener(e -> reset());

        // Obsluga przycisku zgadywania hasla
        btnGuessWord.addActionListener(e -> {
            String guessedWord = JOptionPane.showInputDialog(mainPanel, "Guess word");
            guessCheck(guessedWord);
        });

        btnAddWord.addActionListener(e -> model.openAddWordPage());


    }

    private String checkWord() {
        return model.checkWord();
    }

    private void displayString(String word) {
        textField.setText(word);
    }

    private boolean isWinner() {
        return model.isWinner();
    }

    private boolean isLooser() {
        return model.isLooser();
    }

    private String setWord() {
        return model.setWord();
    }

    private void setPicture(JLabel label) {
        try{
            BufferedImage newPic = ImageIO.read(new File(model.getLives() + ".png"));
            label.setIcon(new ImageIcon(newPic));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(mainPanel,
                    "Could not find a picture",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void setLives(char c) {
        model.setLives(c);
    }

    private void addLetter(Character letter) {
        model.addLetter(letter);
    }

    private void disposeWindow() {
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }

    private void guessCheck(String word) {
        if (word.toLowerCase().equals(model.getRandomWord())) {
            JOptionPane.showMessageDialog(mainPanel,
                    "You were right. The word was: " + model.getRandomWord(),
                    "You win! Congratulations!",
                    JOptionPane.WARNING_MESSAGE);
            disposeWindow();
        }else{
            if (model.checkDuplicateGuess(word.toLowerCase())){
                model.setLives(model.getLives()-1);
                setPicture(picLabel);
            }else{
                JOptionPane.showMessageDialog(mainPanel,
                        "You have already tried this word",
                        "Warning duplicate",
                        JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private void chooseLevel() {
        String[] options = {"Easy", "Medium", "Hard"};

        int n = JOptionPane.showOptionDialog(mainPanel,
                "The difficulty of a word should be...",
                "Choose difficulty",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        model.chooseLevel(n);
    }

    private void reset() {
        chooseLevel();
        model.reset();
        for (JButton button : btnCollection){
            button.setEnabled(true);
        }
        displayString(setWord());
        setPicture(picLabel);
    }

    private void checkGameState() {
        if (isWinner()) {
            JOptionPane.showMessageDialog(mainPanel,
                    "You were right. The word was: " + model.getRandomWord(),
                    "You win! Congratulations!",
                    JOptionPane.WARNING_MESSAGE);
            disposeWindow();
        } else if (isLooser()) {
            JOptionPane.showMessageDialog(mainPanel,
                    "The word was: " + model.getRandomWord(),
                    "You lost!",
                    JOptionPane.ERROR_MESSAGE);
            disposeWindow();
        }
    }

}

