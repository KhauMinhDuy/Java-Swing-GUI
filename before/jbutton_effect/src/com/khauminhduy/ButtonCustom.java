package com.khauminhduy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class ButtonCustom extends JButton {

    private AnimationStyle animationHover;
    private AnimationStyle animationPress;
    private ButtonStyle buttonStyle = ButtonStyle.PRIMARY;
    private ButtonColor currentStyle = new ButtonColor(buttonStyle);
    private int round = 5;

    public ButtonCustom() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(8, 8, 8, 8));
        setForeground(Color.WHITE);
        initAnimation();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                animationHover.start(currentStyle.backgroundHover, buttonStyle.backgroundHover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                animationHover.start(currentStyle.backgroundHover, buttonStyle.background);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                animationPress.start(currentStyle.background, buttonStyle.backgroundPress);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                animationPress.start(currentStyle.background, buttonStyle.background);
            }

        });
    }

    public ButtonStyle getButtonStyle() {
        return buttonStyle;
    }

    public void setButtonStyle(ButtonStyle buttonStyle) {
        if(this.buttonStyle != buttonStyle) {
            this.buttonStyle = buttonStyle;
            animationHover.stop();
            animationPress.stop();
            currentStyle.changeStyle(buttonStyle);
            setForeground(buttonStyle.foreground);
        }
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }

    private void initAnimation() {
        animationHover = new AnimationStyle(300, currentStyle, "backgroundHover");
        animationHover.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                repaint();
            }
        });

        animationPress = new AnimationStyle(200, currentStyle, "background");
        animationPress.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(currentStyle.background);
        g2.fill(area);
        area.subtract(new Area(new RoundRectangle2D.Double(x, y, width, height - height, round, round)));
        g2.setColor(currentStyle.backgroundHover);
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }

    public enum ButtonStyle {
        PRIMARY(new Color(0, 172, 126), new Color(238, 238, 238), new Color(2, 11, 82), new Color(4, 205, 151)),
        SECONDARY(new Color(203, 209, 219), new Color(58, 70, 81), new Color(81, 92, 108), new Color(230, 239, 255)),
        DESTRUCTIVE(new Color(255, 138, 48), new Color(238, 238, 238), new Color(198, 86, 0), new Color(155, 161, 90));

        private ButtonStyle(Color background, Color foreground, Color backgroundHover, Color backgroundPress) {
            this.background = background;
            this.foreground = foreground;
            this.backgroundHover = backgroundHover;
            this.backgroundPress = backgroundPress;
        }

        private final Color background;
        private final Color foreground;
        private final Color backgroundHover;
        private final Color backgroundPress;

    }

    protected class ButtonColor {

        private Color background;
        private Color foreground;
        private Color backgroundHover;
        private Color backgroundPress;

        public ButtonColor(ButtonStyle buttonStyle) {
            changeStyle(buttonStyle);
        }

        public Color getBackground() {
            return background;
        }

        public void setBackground(Color background) {
            this.background = background;
        }

        public Color getForeground() {
            return foreground;
        }

        public void setForeground(Color foreground) {
            this.foreground = foreground;
        }

        public Color getBackgroundHover() {
            return backgroundHover;
        }

        public void setBackgroundHover(Color backgroundHover) {
            this.backgroundHover = backgroundHover;
        }

        public Color getBackgroundPress() {
            return backgroundPress;
        }

        public void setBackgroundPress(Color backgroundPress) {
            this.backgroundPress = backgroundPress;
        }

        public void changeStyle(ButtonStyle buttonStyle) {
            this.background = buttonStyle.background;
            this.foreground = buttonStyle.foreground;
            this.backgroundHover = buttonStyle.backgroundHover;
            this.backgroundPress = buttonStyle.backgroundPress;
        }

    }

    private class AnimationStyle {

        private final Animator animator;
        private final ButtonColor buttonColor;
        private final String property;
        private TimingTarget timingTarget;

        public AnimationStyle(int duration, ButtonColor buttonColor, String property) {
            this.buttonColor = buttonColor;
            this.property = property;
            this.animator = new Animator(duration);
            this.animator.setResolution(1);
        }

        public void start(Color... colors) {
            stop();
            animator.removeTarget(timingTarget);
            timingTarget = new PropertySetter(buttonColor, property, colors);
            animator.addTarget(timingTarget);
            animator.start();
        }

        public void addTarget(TimingTarget timingTarget) {
            animator.addTarget(timingTarget);
        }

        public void stop() {
            if (animator.isRunning()) {
                animator.stop();
            }
        }

    }

}