package Main;

import FacadeDP.AnimalFacade;
import CommandDP.PlayMusic;
import CommandDP.StopMusic;
import CommandDP.MusicManager;
import CommandDP.MusicClipSetup;
import CommandDP.BackgroundMusic;
import FactoryMethodDP.CatFactory;
import FactoryMethodDP.BirdFactory;
import FactoryMethodDP.AnimalFactory;
import FactoryMethodDP.Animal;
import StrategyDP.Zebra;
import StrategyDP.Horse;
import StrategyDP.Equus;
import java.net.URL;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import StrategyDP.Donkey;

@SuppressWarnings("serial")
public class Zoo extends javax.swing.JFrame {

    public Zoo() {
    	zooFrame();
    }
    //@SuppressWarnings("unchecked")
    public void zooFrame() {

        jPanel = new javax.swing.JPanel();
        donkey = new javax.swing.JLabel();
        swan = new javax.swing.JLabel();
        tiger = new javax.swing.JLabel();
        horse = new javax.swing.JLabel();
        swanButton = new javax.swing.JButton();
        lion = new javax.swing.JLabel();
        donkeyButton = new javax.swing.JButton();
        backgroundMusicButton = new javax.swing.JButton();
        duckButton = new javax.swing.JButton();
        zebraButton = new javax.swing.JButton();
        allButton = new javax.swing.JButton();
        lionButton = new javax.swing.JButton();
        tigerButton = new javax.swing.JButton();
        horseButton = new javax.swing.JButton();
        duck = new javax.swing.JLabel();
        zebra = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(null);
        jPanel.add(donkey);
        donkey.setBounds(370, 220, 150, 150);

        jPanel.add(swan);
        swan.setBounds(630, 260, 150, 150);
        
        jPanel.add(tiger);
        tiger.setBounds(270, 370, 150, 150);

        jPanel.add(horse);
        horse.setBounds(450, 380, 150, 150);

        jPanel.add(zebra);
        zebra.setBounds(210, 200, 150, 150);

        jPanel.add(lion);
        lion.setBounds(10, 380, 150, 150);
        
        jPanel.add(duck);
        duck.setBounds(570, 270, 150, 150);
        
        swanButton.setBackground(new java.awt.Color(0, 0, 0));
        swanButton.setFont(new java.awt.Font("Courier", 1, 18));
        swanButton.setForeground(new java.awt.Color(255, 255, 255));
        swanButton.setText("Swan");
        swanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        swanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                swanImage(animalEvent);
            }
        });
        jPanel.add(swanButton);
        swanButton.setBounds(558, 560, 80, 30);

        donkeyButton.setBackground(new java.awt.Color(0, 0, 0));
        donkeyButton.setFont(new java.awt.Font("Courier", 1, 18));
        donkeyButton.setForeground(new java.awt.Color(255, 255, 255));
        donkeyButton.setText("Donkey");
        donkeyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        donkeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                donkeyImage(animalEvent);
            }
        });
        jPanel.add(donkeyButton);
        donkeyButton.setBounds(455, 560, 100, 30);

        backgroundMusicButton.setBackground(new java.awt.Color(255, 255, 255));
        backgroundMusicButton.setFont(new java.awt.Font("Courier", 1, 18));
        backgroundMusicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/soundoff.png"))); // NOI18N
        backgroundMusicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                soundbtnActionPerformed(animalEvent);
            }
        });
        jPanel.add(backgroundMusicButton);
        backgroundMusicButton.setBounds(10, 10, 40, 33);

        duckButton.setBackground(new java.awt.Color(0, 0, 0));
        duckButton.setFont(new java.awt.Font("Courier", 1, 18));
        duckButton.setForeground(new java.awt.Color(255, 255, 255));
        duckButton.setText("Duck");
        duckButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        duckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                duckImage(animalEvent);
            }
        });
        jPanel.add(duckButton);
        duckButton.setBounds(10, 560, 75, 30);

        zebraButton.setBackground(new java.awt.Color(0, 0, 0));
        zebraButton.setFont(new java.awt.Font("Courier", 1, 18));
        zebraButton.setForeground(new java.awt.Color(255, 255, 255));
        zebraButton.setText("Zebra");
        zebraButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zebraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                zebraImage(animalEvent);
            }
        });
        jPanel.add(zebraButton);
        zebraButton.setBounds(184, 560, 90, 30);

        allButton.setBackground(new java.awt.Color(0, 0, 0));
        allButton.setFont(new java.awt.Font("Courier", 1, 18));
        allButton.setForeground(new java.awt.Color(255, 255, 255));
        allButton.setText("All Animals");
        allButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                allImage(animalEvent);
            }
        });
        jPanel.add(allButton);
        allButton.setBounds(640, 560, 155, 30);

        lionButton.setBackground(new java.awt.Color(0, 0, 0));
        lionButton.setFont(new java.awt.Font("Courier", 1, 18));
        lionButton.setForeground(new java.awt.Color(255, 255, 255));
        lionButton.setText("Lion");
        lionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                jaguarImage(animalEvent);
            }
        });
        jPanel.add(lionButton);
        lionButton.setBounds(87, 560, 90, 30);

        tigerButton.setBackground(new java.awt.Color(0, 0, 0));
        tigerButton.setFont(new java.awt.Font("Courier", 1, 18));
        tigerButton.setForeground(new java.awt.Color(255, 255, 255));
        tigerButton.setText("Tiger");
        tigerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tigerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
                tigerImage(animalEvent);
            }
        });
        jPanel.add(tigerButton);
        tigerButton.setBounds(281, 560, 85, 30);

        horseButton.setBackground(new java.awt.Color(0, 0, 0));
        horseButton.setFont(new java.awt.Font("Courier", 1, 18));
        horseButton.setForeground(new java.awt.Color(255, 255, 255));
        horseButton.setText("Horse");
        horseButton.setActionCommand("Horse");
        horseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        horseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent animalEvent) {
            	horseImage(animalEvent);
            }
        });
        jPanel.add(horseButton);
        horseButton.setBounds(368, 560, 85, 30);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Background1.png"))); // NOI18N
        jPanel.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 800, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        pack();
    }

    int tigerClicked = 0;
    private void tigerImage(java.awt.event.ActionEvent animalEvent) {
        horse.setVisible(false);
        duck.setVisible(false);
        donkey.setVisible(false);
        lion.setVisible(false);
        swan.setVisible(false);
        zebra.setVisible(false);
        horseClicked = 0;
        duckClicked = 0;
        donkeyClicked = 0;
        swanClicked = 0;
        lionClicked = 0;
        zebraClicked = 0;
        allAnimalsClicked = 0;

        AnimalFactory catfactory = new CatFactory();
        Animal tigerObject = catfactory.callAnimal("tiger");

        if (tigerClicked == 0) {
            tiger.setIcon(tigerObject.appear());
            tiger.setVisible(true);
            tigerClicked = 1;
        } else if (tigerClicked == 1) {
        	tiger.setIcon(tigerObject.disappear());
        	tiger.setVisible(true);
            tigerClicked = 0;
        }
        tiger.revalidate();  
    }
    
    int lionClicked = 0;
    private void jaguarImage(java.awt.event.ActionEvent animalEvent) {
        horse.setVisible(false);
        tiger.setVisible(false);
        donkey.setVisible(false);
        duck.setVisible(false);
        swan.setVisible(false);
        zebra.setVisible(false);
        tigerClicked = 0;
        horseClicked = 0;
        duckClicked = 0;
        donkeyClicked = 0;
        swanClicked = 0;
        zebraClicked = 0;
        allAnimalsClicked = 0;
        
        AnimalFactory catfactory = new CatFactory();
        Animal lionObject = catfactory.callAnimal("lion");

        if (lionClicked == 0) {
            lion.setIcon(lionObject.appear());
            lion.setVisible(true);
            lionClicked = 1;
        } else if (lionClicked == 1) {
        	lion.setIcon(lionObject.disappear());
        	lion.setVisible(true);
            lionClicked = 0;
        }
        lion.revalidate();    

        }
    
    int duckClicked = 0;
    private void duckImage(java.awt.event.ActionEvent animalEvent) {
        horse.setVisible(false);
        swan.setVisible(false);
        lion.setVisible(false);
        zebra.setVisible(false);
        tiger.setVisible(false);
        donkey.setVisible(false);
        tigerClicked = 0;
        horseClicked = 0;
        donkeyClicked = 0;
        swanClicked = 0;
        lionClicked = 0;
        zebraClicked = 0;
        allAnimalsClicked = 0;

        AnimalFactory birdfactory = new BirdFactory();
        Animal duckObject = birdfactory.callAnimal("duck");

        if (duckClicked == 0) {
            duck.setIcon(duckObject.appear());
            duck.setVisible(true);
            duckClicked = 1;
        } else if (duckClicked == 1) {
        	duck.setIcon(duckObject.disappear());
        	duck.setVisible(true);
            duckClicked = 0;
        }
        duck.revalidate();    
    }
    
    int swanClicked = 0;
    private void swanImage(java.awt.event.ActionEvent animalEvent) {
        horse.setVisible(false);
        tiger.setVisible(false);
        donkey.setVisible(false);
        duck.setVisible(false);
        lion.setVisible(false);
        zebra.setVisible(false);
        tigerClicked = 0;
        horseClicked = 0;
        duckClicked = 0;
        donkeyClicked = 0;
        lionClicked = 0;
        zebraClicked = 0;
        allAnimalsClicked = 0;

        AnimalFactory birdfactory = new BirdFactory();
        Animal swanObject = birdfactory.callAnimal("swan");

        if (swanClicked == 0) {
            swan.setIcon(swanObject.appear());
            swan.setVisible(true);
            swanClicked = 1;
        } else if (swanClicked == 1) {
        	swan.setIcon(swanObject.disappear());
        	swan.setVisible(true);
            swanClicked = 0;
        }
        swan.revalidate();  
        }

    int horseClicked = 0;
    private void horseImage(java.awt.event.ActionEvent animalEvent) {
        tiger.setVisible(false);
        duck.setVisible(false);
        lion.setVisible(false);
        donkey.setVisible(false);;
        zebra.setVisible(false);
        swan.setVisible(false);
        tigerClicked = 0;
        duckClicked = 0;
        donkeyClicked = 0;
        swanClicked = 0;
        lionClicked = 0;
        zebraClicked = 0;
        allAnimalsClicked = 0;

        Equus horseEquus = new Horse(horse);

        if (horseClicked == 0) {
        	horseEquus.displayBehaviour();
            horseClicked = 1;
        } else if (horseClicked == 1) {
        	horseEquus.hideBehaviour();
            horseClicked = 0;
        }
    }

    int donkeyClicked = 0;
    private void donkeyImage(java.awt.event.ActionEvent animalEvent) {
        horse.setVisible(false);
        tiger.setVisible(false);
        duck.setVisible(false);
        swan.setVisible(false);
        lion.setVisible(false);
        zebra.setVisible(false); 
        tigerClicked = 0;
        horseClicked = 0;
        duckClicked = 0;
        swanClicked = 0;
        lionClicked = 0;
        zebraClicked = 0;
        allAnimalsClicked = 0;
        
        Equus donkeyEquus = new Donkey(donkey);

        if (donkeyClicked == 0) {
        	donkeyEquus.displayBehaviour();
            donkeyClicked = 1;

        } else if (donkeyClicked == 1) {
        	donkeyEquus.hideBehaviour();
            donkeyClicked = 0;
        }
    }

    int zebraClicked = 0;
    private void zebraImage(java.awt.event.ActionEvent animalEvent) {
        horse.setVisible(false);
        tiger.setVisible(false);
        donkey.setVisible(false);
        duck.setVisible(false);
        swan.setVisible(false);
        lion.setVisible(false);
        tigerClicked = 0;
        horseClicked = 0;
        duckClicked = 0;
        donkeyClicked = 0;
        swanClicked = 0;
        lionClicked = 0;
        allAnimalsClicked = 0;

        Equus zebraEquus = new Zebra(zebra);

        if (zebraClicked == 0) {
        	zebraEquus.displayBehaviour();
            zebraClicked = 1;
        } else if (zebraClicked == 1) {
        	zebraEquus.hideBehaviour();
            zebraClicked = 0;
        }
        zebra.revalidate();    
        }
    
    int allAnimalsClicked = 0;
    private void allImage(java.awt.event.ActionEvent animalEvent) {
    	zebra.setVisible(false);
        lion.setVisible(false);
        swan.setVisible(false);
        donkey.setVisible(false);
        duck.setVisible(false);
        horse.setVisible(false);
        tiger.setVisible(false);
        tigerClicked = 0;
        horseClicked = 0;
        duckClicked = 0;
        donkeyClicked = 0;
        swanClicked = 0;
        lionClicked = 0;
        zebraClicked = 0;
        Equus horseEquus = new Horse(horse);
        Equus zebraEquus = new Zebra(zebra);
        Equus donkeyEquus = new Donkey(donkey);
        AnimalFactory catfactory = new CatFactory();
        AnimalFactory birdfactory = new BirdFactory();
        
        Animal lion1 = catfactory.createAnimal("lion"); //changed the variable name by adding string "1" so that it differ from JLabel name
        Animal tiger1 = catfactory.createAnimal("tiger"); //changed the variable name by adding string "1" so that it differ from JLabel name
        Animal duck1 = birdfactory.createAnimal("duck"); //changed the variable name by adding string "1" so that it differ from JLabel name
        Animal swan1 = birdfactory.createAnimal("swan"); //changed the variable name by adding string "1" so that it differ from JLabel name
        //-------------------------------------------Facade Pattern----------------------------------------------

        AnimalFacade animals = new AnimalFacade(horseEquus, duck1, donkeyEquus, swan1, zebraEquus, tiger1, lion1);

        if (allAnimalsClicked == 0) {
        	animals.clickAll(swan,duck,lion,tiger); //send JLabel of these animals to facade class to avoid the use of zoo instance
            allAnimalsClicked = 1;

        } else if (allAnimalsClicked == 1) {
        	animals.unclickAll(swan,duck,lion,tiger);//send JLabel of these animals to facade class to avoid the use of zoo instance
            allAnimalsClicked = 0;
        }
    }

    int zooMusic = 0;
    MusicClipSetup scs = new MusicClipSetup();
    
    Clip backgroundSound = scs.createClip();
    
    private void soundbtnActionPerformed(java.awt.event.ActionEvent evt) {
    	MusicManager sm = new MusicManager();
        BackgroundMusic sound = new BackgroundMusic(backgroundSound);
        URL urlMusicOn = getClass().getResource("/Image/soundon.png");
        URL urlMusicOff = getClass().getResource("/Image/soundoff.png");
        ImageIcon MusicOnIcon = new ImageIcon(urlMusicOn);
        ImageIcon MusicOffIcon = new ImageIcon(urlMusicOff);
        
        PlayMusic soc = new PlayMusic(sound);
        StopMusic sfc = new StopMusic(sound);
        
        if (zooMusic == 0) {
            sm.setCommand(soc);
            sm.buttonWasPressed();
        	backgroundMusicButton.setIcon(MusicOnIcon);
        	backgroundMusicButton.setVisible(true);
        	backgroundMusicButton.revalidate();
            zooMusic++;
        } else if (zooMusic == 1) {
            
            sm.setCommand(sfc);
            sm.buttonWasPressed();
            backgroundMusicButton.setIcon(MusicOffIcon);
            backgroundMusicButton.setVisible(true);
            backgroundMusicButton.revalidate();
            zooMusic--;
        }
    }

    private javax.swing.JButton allButton;
    private javax.swing.JLabel zebra;
    private javax.swing.JButton zebraButton;
    private javax.swing.JLabel swan;
    private javax.swing.JButton swanButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel duck;
    private javax.swing.JButton duckButton;
    private javax.swing.JButton tigerButton;
    private javax.swing.JLabel tiger;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lion;
    private javax.swing.JButton lionButton;
    private javax.swing.JLabel donkey;
    private javax.swing.JButton horseButton;
    private javax.swing.JLabel horse;
    private javax.swing.JButton donkeyButton;
    private javax.swing.JButton backgroundMusicButton;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Zoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	Zoo zoo = new Zoo();
            	zoo.setVisible(true);
            }
        });
    }
}
