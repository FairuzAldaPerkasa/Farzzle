import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.List;

public class GameStartScreen extends JFrame {
    private JButton startButton;
    private Puzzle puzzle;
    private Timer timer;
    private List<Cloud> clouds;
    private MusicPlayer musicPlayer;

    public GameStartScreen() {
        super("Farzzle");

        // Load background music
        musicPlayer = new MusicPlayer("Music.wav");
        musicPlayer.play();

        // Create a cool-looking font
        Font buttonFont = new Font("PixelFont", Font.PLAIN, 18);

        // Create a panel for the background image
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage = new ImageIcon("Background.jpg").getImage(); // Ganti dengan file gambar background Anda
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        setContentPane(backgroundPanel);

        // Create a title using an image
        JLabel titleLabel = new JLabel(new ImageIcon("Title.jpg"));
        titleLabel.setBounds(100, 50, 400, 100);
        backgroundPanel.add(titleLabel);

        // Create a start button using an image
        startButton = new JButton(new ImageIcon("Start.png"));
        startButton.setBounds(200, 200, 200, 100);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setFont(buttonFont);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                dispose();
                puzzle = new Puzzle();
                puzzle.setVisible(true);
            }
        });
        backgroundPanel.add(startButton);


        clouds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Cloud cloud = new Cloud();
            clouds.add(cloud);
        }

        timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveClouds();
                repaint();
            }
        });

        setLayout(null);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setResizable(false); // Disable resizing
        setVisible(true);


        startCloudAnimation();
    }

    private class MusicPlayer {
        private Clip clip;

        public MusicPlayer(String filePath) {
            loadMusic(filePath);
        }

        private void loadMusic(String filePath) {
            try {
                File audioFile = new File(filePath);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                clip = AudioSystem.getClip();
                clip.open(audioStream);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void play() {
            if (clip != null) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        }

        public void stop() {
            if (clip != null && clip.isRunning()) {
                clip.stop();
            }
        }
    }

    private void moveClouds() {
        for (Cloud cloud : clouds) {
            cloud.move();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Cloud cloud : clouds) {
            cloud.draw(g);
        }
    }

    private void startCloudAnimation() {
        timer.start();
    }

    public class Cloud {
        private int x;
        private int y;
        private int speed;

        public Cloud() {
            reset();
        }

        public void move() {
            x += speed;
            if (x > getWidth()) {
                reset();
            }
        }

        public void reset() {
            x = -100;
            y = (int) (Math.random() * 150) + 50;
            speed = (int) (Math.random() * 5) + 1;
        }

        public void draw(Graphics g) {
            g.setColor(new Color(255, 255, 255)); // White color
            g.fillOval(x, y, 100, 50);
            g.fillOval(x + 30, y - 20, 120, 70);
            g.fillOval(x + 80, y - 10, 100, 40);
        }

        private int getWidth() {
            return GameStartScreen.this.getWidth();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GameStartScreen();
        });
    }
}
