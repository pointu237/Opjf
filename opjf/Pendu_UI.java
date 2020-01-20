/**
 * Code du Projet : OPJF
 * Titre du Projet : :e jeu du pendu
 * Instructeur : Francois Dion
 * no Étudiant : 645-241108
 * Nom Étudiant : Nathan Lapointe
 */
package opjf;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import static opjf.OPJF.clavierState;
import static opjf.OPJF.getIndexDeSelection;
import static opjf.OPJF.gui;
import static opjf.OPJF.initGame;
import static opjf.OPJF.mot;

/**
 * Pendu_UI
 * Interface ulisateur pour le jeu du Pendu
 */
public class Pendu_UI extends javax.swing.JFrame implements KeyListener{
    
    // Creation du l'interface utilisateur
    public Pendu_UI() {
        initComponents();
        reinitgame();
    }
    
    //Fonction pour ré-initialiser le keylistener et remettre le focus sur le panel du claivier
    public void reinitgame(){
        clavierPanel.addKeyListener(this);
        clavierPanel.setFocusable(true);
        clavierPanel.requestFocusInWindow();
    }
    
    @Override
    public void keyPressed(KeyEvent e){
    }
       
    @Override
    public void keyTyped(KeyEvent e) {
    }

    // Gestion des touche clavier appuyer / sur évenement keyReleased
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == 81 && QButton.isEnabled()){
            getIndexDeSelection("q");
            QButton.setEnabled(false);
        }

        if (key == 87 && WButton.isEnabled()){
            getIndexDeSelection("w");
            WButton.setEnabled(false);
        }
        
        if (key == 69 && EButton.isEnabled()){
            getIndexDeSelection("e");
            EButton.setEnabled(false);
        }
                
        if (key == 82 && RButton.isEnabled()){
            getIndexDeSelection("r");
            RButton.setEnabled(false);
        }
        
        if (key == 84 && TButton.isEnabled()){
            getIndexDeSelection("t");
            TButton.setEnabled(false);
        }

        if (key == 89 && YButton.isEnabled()){
            getIndexDeSelection("y");
            YButton.setEnabled(false);
        }

        if (key == 85 && UButton.isEnabled()){
            getIndexDeSelection("u");
            UButton.setEnabled(false);
        }
        
        if (key == 73 && IButton.isEnabled()){
            getIndexDeSelection("i");
            IButton.setEnabled(false);
        }        

        if (key == 79 && OButton.isEnabled()){
            getIndexDeSelection("o");
            OButton.setEnabled(false);
        }

        if (key == 80 && PButton.isEnabled()){
            getIndexDeSelection("p");
            PButton.setEnabled(false);
        }

        if (key == 65 && AButton.isEnabled()){
            getIndexDeSelection("a");
            AButton.setEnabled(false);
        }        
        
        if (key == 83 && SButton.isEnabled()){
            getIndexDeSelection("s");
            SButton.setEnabled(false);
        }
        
        if (key == 68 && DButton.isEnabled()){
            getIndexDeSelection("d");
            DButton.setEnabled(false);
        }
        
        if (key == 70 && FButton.isEnabled()){
            getIndexDeSelection("f");
            FButton.setEnabled(false);
        }    
        
        if (key == 71 && GButton.isEnabled()){
            getIndexDeSelection("g");
            GButton.setEnabled(false);
        }
        
        if (key == 72 && HButton.isEnabled()){
            getIndexDeSelection("h");
            HButton.setEnabled(false);
        }

        if (key == 74 && JButton.isEnabled()){
            getIndexDeSelection("j");
            JButton.setEnabled(false);
        }

        if (key == 75 && KButton.isEnabled()){
            getIndexDeSelection("k");
            KButton.setEnabled(false);
        }

        if (key == 76 && LButton.isEnabled()){
            getIndexDeSelection("l");
            LButton.setEnabled(false);
        }        

        if (key == 90 && ZButton.isEnabled()){
            getIndexDeSelection("z");
            ZButton.setEnabled(false);
        }       

        if (key == 88 && XButton.isEnabled()){
            getIndexDeSelection("x");
            XButton.setEnabled(false);
        }       

        if (key == 67 && CButton.isEnabled()){
            getIndexDeSelection("c");
            CButton.setEnabled(false);
        }       

        if (key == 86 && VButton.isEnabled()){
            getIndexDeSelection("v");
            VButton.setEnabled(false);
        }               

        if (key == 66 && BButton.isEnabled()){
            getIndexDeSelection("b");
            BButton.setEnabled(false);
        }       

        if (key == 78 && NButton.isEnabled()){
            getIndexDeSelection("n");
            NButton.setEnabled(false);
        }       

        if (key == 77 && MButton.isEnabled()){
            getIndexDeSelection("m");
            MButton.setEnabled(false);
        }    
    }
    /**

     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ActeurPendu = new javax.swing.JLabel();
        clavierPanel = new javax.swing.JPanel();
        QButton = new javax.swing.JButton();
        WButton = new javax.swing.JButton();
        EButton = new javax.swing.JButton();
        RButton = new javax.swing.JButton();
        TButton = new javax.swing.JButton();
        YButton = new javax.swing.JButton();
        UButton = new javax.swing.JButton();
        IButton = new javax.swing.JButton();
        OButton = new javax.swing.JButton();
        PButton = new javax.swing.JButton();
        AButton = new javax.swing.JButton();
        SButton = new javax.swing.JButton();
        DButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        GButton = new javax.swing.JButton();
        HButton = new javax.swing.JButton();
        JButton = new javax.swing.JButton();
        KButton = new javax.swing.JButton();
        LButton = new javax.swing.JButton();
        ZButton = new javax.swing.JButton();
        XButton = new javax.swing.JButton();
        CButton = new javax.swing.JButton();
        VButton = new javax.swing.JButton();
        BButton = new javax.swing.JButton();
        NButton = new javax.swing.JButton();
        MButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        motCourant = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NouveauMotbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreRestant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        partieGagner = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        poucentageGager = new javax.swing.JTextField();
        partieJouer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JoueurTextbox = new javax.swing.JLabel();
        Score = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        XButton1.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pendu"));

        ActeurPendu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opjf/ressources/0.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ActeurPendu)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ActeurPendu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        clavierPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Clavier"));

        QButton.setText("Q");
        QButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QButtonActionPerformed(evt);
            }
        });

        WButton.setText("W");
        WButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WButtonActionPerformed(evt);
            }
        });

        EButton.setText("E");
        EButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EButtonActionPerformed(evt);
            }
        });

        RButton.setText("R");
        RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButtonActionPerformed(evt);
            }
        });

        TButton.setText("T");
        TButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButtonActionPerformed(evt);
            }
        });

        YButton.setText("Y");
        YButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YButtonActionPerformed(evt);
            }
        });

        UButton.setText("U");
        UButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UButtonActionPerformed(evt);
            }
        });

        IButton.setText("I");
        IButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IButtonActionPerformed(evt);
            }
        });

        OButton.setText("O");
        OButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButtonActionPerformed(evt);
            }
        });

        PButton.setText("P");
        PButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PButtonActionPerformed(evt);
            }
        });

        AButton.setText("A");
        AButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AButtonActionPerformed(evt);
            }
        });

        SButton.setText("S");
        SButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SButtonActionPerformed(evt);
            }
        });

        DButton.setText("D");
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });

        FButton.setText("F");
        FButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FButtonActionPerformed(evt);
            }
        });

        GButton.setText("G");
        GButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GButtonActionPerformed(evt);
            }
        });

        HButton.setText("H");
        HButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HButtonActionPerformed(evt);
            }
        });

        JButton.setText("J");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });

        KButton.setText("K");
        KButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KButtonActionPerformed(evt);
            }
        });

        LButton.setText("L");
        LButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButtonActionPerformed(evt);
            }
        });

        ZButton.setText("Z");
        ZButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZButtonActionPerformed(evt);
            }
        });

        XButton.setText("X");
        XButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButtonActionPerformed(evt);
            }
        });

        CButton.setText("C");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });

        VButton.setText("V");
        VButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VButtonActionPerformed(evt);
            }
        });

        BButton.setText("B");
        BButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BButtonActionPerformed(evt);
            }
        });

        NButton.setText("N");
        NButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NButtonActionPerformed(evt);
            }
        });

        MButton.setText("M");
        MButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clavierPanelLayout = new javax.swing.GroupLayout(clavierPanel);
        clavierPanel.setLayout(clavierPanelLayout);
        clavierPanelLayout.setHorizontalGroup(
            clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clavierPanelLayout.createSequentialGroup()
                .addGroup(clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clavierPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(QButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PButton))
                    .addGroup(clavierPanelLayout.createSequentialGroup()
                        .addGroup(clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clavierPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(AButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clavierPanelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(ZButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clavierPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AButton, BButton, CButton, DButton, EButton, FButton, GButton, HButton, IButton, JButton, KButton, LButton, MButton, NButton, OButton, PButton, QButton, RButton, SButton, TButton, UButton, VButton, WButton, XButton, YButton, ZButton});

        clavierPanelLayout.setVerticalGroup(
            clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clavierPanelLayout.createSequentialGroup()
                .addGroup(clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QButton)
                    .addComponent(WButton)
                    .addComponent(EButton)
                    .addComponent(RButton)
                    .addComponent(TButton)
                    .addComponent(YButton)
                    .addComponent(UButton)
                    .addComponent(IButton)
                    .addComponent(OButton)
                    .addComponent(PButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AButton)
                    .addComponent(SButton)
                    .addComponent(DButton)
                    .addComponent(FButton)
                    .addComponent(GButton)
                    .addComponent(HButton)
                    .addComponent(JButton)
                    .addComponent(KButton)
                    .addComponent(LButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clavierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZButton)
                    .addComponent(XButton)
                    .addComponent(CButton)
                    .addComponent(VButton)
                    .addComponent(BButton)
                    .addComponent(NButton)
                    .addComponent(MButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        clavierPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AButton, BButton, CButton, DButton, EButton, FButton, GButton, HButton, IButton, JButton, KButton, LButton, MButton, NButton, OButton, PButton, QButton, RButton, SButton, TButton, UButton, VButton, WButton, XButton, YButton, ZButton});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mot rechercher"));

        motCourant.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        motCourant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motCourant.setText("_ _ _ _ _ _ _ _ _ _ _ ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(motCourant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(motCourant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistique et Options"));

        NouveauMotbutton.setText("Nouveau mot");
        NouveauMotbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NouveauMotbuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Essaie restant");

        NombreRestant.setEditable(false);
        NombreRestant.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        NombreRestant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreRestant.setText("7");

        jLabel2.setText("Pourcentage de victoire:");

        partieGagner.setEditable(false);
        partieGagner.setText("0");
        partieGagner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partieGagnerActionPerformed(evt);
            }
        });

        jLabel4.setText("victoire:");

        jLabel5.setText("Partie joués");

        poucentageGager.setEditable(false);
        poucentageGager.setText("0%");
        poucentageGager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poucentageGagerActionPerformed(evt);
            }
        });

        partieJouer.setEditable(false);
        partieJouer.setText("0");
        partieJouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partieJouerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NombreRestant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(poucentageGager))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partieGagner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partieJouer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(NouveauMotbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NombreRestant, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(poucentageGager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(partieGagner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partieJouer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(NouveauMotbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Joueur"));

        JoueurTextbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Score.setEditable(false);
        Score.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Score.setText("0");

        jLabel3.setText("Pointage :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JoueurTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(JoueurTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Fichier");

        jMenuItem1.setText("Instruction");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Quitter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Le Pendu");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("A Propos de");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clavierPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clavierPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //
    //Gestion des bouton du clavier / activation par la souris
    //
    private void WButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WButtonActionPerformed
        getIndexDeSelection("w");
        WButton.setEnabled(false);
    }//GEN-LAST:event_WButtonActionPerformed

    private void EButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EButtonActionPerformed
        getIndexDeSelection("e");
        EButton.setEnabled(false);
    }//GEN-LAST:event_EButtonActionPerformed

    private void RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButtonActionPerformed
        getIndexDeSelection("r");
        RButton.setEnabled(false);
    }//GEN-LAST:event_RButtonActionPerformed

    private void TButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButtonActionPerformed
        getIndexDeSelection("t");
        TButton.setEnabled(false);
    }//GEN-LAST:event_TButtonActionPerformed

    private void YButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YButtonActionPerformed
       getIndexDeSelection("y");
       YButton.setEnabled(false);
    }//GEN-LAST:event_YButtonActionPerformed

    private void UButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UButtonActionPerformed
        getIndexDeSelection("u");
        UButton.setEnabled(false);
    }//GEN-LAST:event_UButtonActionPerformed

    private void IButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IButtonActionPerformed
        getIndexDeSelection("i");
        IButton.setEnabled(false);
    }//GEN-LAST:event_IButtonActionPerformed

    private void OButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButtonActionPerformed
        getIndexDeSelection("o");
        OButton.setEnabled(false);
    }//GEN-LAST:event_OButtonActionPerformed

    private void PButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PButtonActionPerformed
        getIndexDeSelection("p");
        PButton.setEnabled(false);
    }//GEN-LAST:event_PButtonActionPerformed

    private void partieGagnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partieGagnerActionPerformed
        
    }//GEN-LAST:event_partieGagnerActionPerformed

    private void poucentageGagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poucentageGagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poucentageGagerActionPerformed

    private void partieJouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partieJouerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partieJouerActionPerformed

    private void QButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QButtonActionPerformed
        getIndexDeSelection("q");
        QButton.setEnabled(false);
    }//GEN-LAST:event_QButtonActionPerformed

    private void AButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AButtonActionPerformed
        getIndexDeSelection("a");
        AButton.setEnabled(false);
    }//GEN-LAST:event_AButtonActionPerformed

    private void SButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SButtonActionPerformed
        getIndexDeSelection("s");
        SButton.setEnabled(false);
    }//GEN-LAST:event_SButtonActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        getIndexDeSelection("d");
        DButton.setEnabled(false);
    }//GEN-LAST:event_DButtonActionPerformed

    private void FButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FButtonActionPerformed
        getIndexDeSelection("f");
        FButton.setEnabled(false);
    }//GEN-LAST:event_FButtonActionPerformed

    private void HButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HButtonActionPerformed
        getIndexDeSelection("h");
        HButton.setEnabled(false);
    }//GEN-LAST:event_HButtonActionPerformed

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
        getIndexDeSelection("j");
        JButton.setEnabled(false);
    }//GEN-LAST:event_JButtonActionPerformed

    private void KButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KButtonActionPerformed
        getIndexDeSelection("k");
        KButton.setEnabled(false);
    }//GEN-LAST:event_KButtonActionPerformed

    private void LButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButtonActionPerformed
        getIndexDeSelection("l");
        LButton.setEnabled(false);
    }//GEN-LAST:event_LButtonActionPerformed

    private void ZButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZButtonActionPerformed
        getIndexDeSelection("z");
        ZButton.setEnabled(false);
    }//GEN-LAST:event_ZButtonActionPerformed

    private void XButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButtonActionPerformed
        getIndexDeSelection("x");
        XButton.setEnabled(false);
    }//GEN-LAST:event_XButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        getIndexDeSelection("c");
        CButton.setEnabled(false);
    }//GEN-LAST:event_CButtonActionPerformed

    private void VButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VButtonActionPerformed
        getIndexDeSelection("v");
        VButton.setEnabled(false);
    }//GEN-LAST:event_VButtonActionPerformed

    private void BButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BButtonActionPerformed
        getIndexDeSelection("b");
        BButton.setEnabled(false);
    }//GEN-LAST:event_BButtonActionPerformed

    private void NButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NButtonActionPerformed
        getIndexDeSelection("n");
        NButton.setEnabled(false);
    }//GEN-LAST:event_NButtonActionPerformed

    private void MButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MButtonActionPerformed
        getIndexDeSelection("m");
        MButton.setEnabled(false);
    }//GEN-LAST:event_MButtonActionPerformed

    private void NouveauMotbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NouveauMotbuttonActionPerformed
        //JOptionPane.showMessageDialog(null, "Nouveau mot ici");
        initGame();
    }//GEN-LAST:event_NouveauMotbuttonActionPerformed

    private void GButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GButtonActionPerformed
        getIndexDeSelection("g");
        GButton.setEnabled(false);
    }//GEN-LAST:event_GButtonActionPerformed
    // Instruction du jeux
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(OPJF.gui, "Seléctionnez les lettres avec la souris ou le clavier pour déviné le mot caché.\n Si la lettre ce trouve dans le mot celle si apparaitera, sinon un morceux du pendu sera placé, \nsi vous devinnez avant que le bonhomme soit pendu vous Gagnez!!! sinon c'est la défaite\n\nPour démmaré une nouvelle partie appuyer sur le bouton Nouveau Mot"
                , "Instruction du jeux" ,JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(OPJF.gui, "Projet Java - OPJF - Jeux le Pendu.\n "
                + "par Nathan.l - 645-241108\n"
                , "A Propos de" ,JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AButton;
    public javax.swing.JLabel ActeurPendu;
    private javax.swing.JButton BButton;
    private javax.swing.JButton CButton;
    private javax.swing.JButton DButton;
    private javax.swing.JButton EButton;
    private javax.swing.JButton FButton;
    private javax.swing.JButton GButton;
    private javax.swing.JButton HButton;
    private javax.swing.JButton IButton;
    private javax.swing.JButton JButton;
    public javax.swing.JLabel JoueurTextbox;
    private javax.swing.JButton KButton;
    private javax.swing.JButton LButton;
    private javax.swing.JButton MButton;
    private javax.swing.JButton NButton;
    public javax.swing.JTextField NombreRestant;
    private javax.swing.JButton NouveauMotbutton;
    private javax.swing.JButton OButton;
    private javax.swing.JButton PButton;
    private javax.swing.JButton QButton;
    private javax.swing.JButton RButton;
    private javax.swing.JButton SButton;
    public javax.swing.JTextField Score;
    private javax.swing.JButton TButton;
    private javax.swing.JButton UButton;
    private javax.swing.JButton VButton;
    private javax.swing.JButton WButton;
    private javax.swing.JButton XButton;
    private javax.swing.JButton XButton1;
    private javax.swing.JButton YButton;
    private javax.swing.JButton ZButton;
    public javax.swing.JPanel clavierPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JLabel motCourant;
    public javax.swing.JTextField partieGagner;
    public javax.swing.JTextField partieJouer;
    public javax.swing.JTextField poucentageGager;
    // End of variables declaration//GEN-END:variables

   
}
