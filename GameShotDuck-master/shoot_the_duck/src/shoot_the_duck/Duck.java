package shoot_the_duck;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * The duck class.
 * 
 * @author PRINCE D. TOAD
 */

public class Duck {
    /**
     * Thời gian để tạo ra một con vịt mới
     */
    public static long timeBetweenDucks = Framework.secInNanosec / 2;
    /**
     * Thời gian qua khi con vịt đã được tạo ra.
     */
    public static long lastDuckTime = 0;
    
    /**
     * Duck lines.
     * vị trí bắt đầu cho con vịt
     * Tốc độ của vịt
     * Điểm
     */
    public static int[][] duckLines = {
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.60), -1, 20},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.65), -2, 30},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.70), -3, 40},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.78), -4, 50}
                                      };
    /**
     * Dòng vit tiếp theo
     */
    public static int nextDuckLines = 0;
    
    
    /**
     * tọa độ x của vịt (hoành độ).
     */
    public int x;
    /**
     * tọa độ y của vịt (tung độ).
     */
    public int y;
    
    /**
     * Speed
     */
    private int speed;
    
    /**
     * Điểm khi bắn trúng vịt.
     */
    public int score;
    
    /**
     * Ảnh vịt.
     */
    private BufferedImage duckImg;
    
    
    /**
     * Tạo 1 con vịt mới.
     * 
     * @param x Bắt đầu với tọa độ x.
     * @param y Bắt đầu với tọa độ y.
     * @param speed Tốc độ của vịt.
     * @param score điểm khi bắn trúng vịt
     * @param duckImg Ảnh vịt.
     */
    public Duck(int x, int y, int speed, int score, BufferedImage duckImg)
    {
        this.x = x;
        this.y = y;
        
        this.speed = speed;
        
        this.score = score;
        
        this.duckImg = duckImg;        
    }
    
    
    /**
     * Di chuyển vịt.
     */
    public void Update()
    {
        x += speed;
    }
    
    /**
     * Vẽ vịt lên màn hình.
     * @param g2d Graphics2D
     */
    public void Draw(Graphics2D g2d)
    {
        g2d.drawImage(duckImg, x, y, null);
    }
}
