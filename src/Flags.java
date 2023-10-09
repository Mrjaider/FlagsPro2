import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Flags {
    public static final int COLOR_YELLOW = new Color(250,201,20).getRGB();
    public static final int COLOR_BLUE = new Color(17,13,99).getRGB();
    public static final int COLOR_RED = new Color(196,0,15).getRGB();
    public static final int COLOR_BLACK = new Color(5,5,5).getRGB();
    public static final int COLOR_WHITE = new Color(255,255,255).getRGB();
    public static final int COLOR_GREEN = new Color(35,138,51).getRGB();

    public static void start() {
        int[][] flag = new int[12][10];

        flag = banderaCOL(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaVEN(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaPOL(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaPAN(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaCHL(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaUSA(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaCZE(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaDNK(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaFIN(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaNOR(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaKWT(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaZAF(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);

        flag = banderaCHE(12, 20);
        JOptionPaneArrays.showColorArray2D(null, flag);
    }

    public static int[][] banderaCOL(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;

        rowIni = 0;
        rowEnd = (int)(height*0.50);
        for (int i = 0; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_YELLOW;
            }
        }

        rowIni = (int)(height*0.50);
        rowEnd = (int)(height*0.75);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.75);
        rowEnd = flag.length;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] banderaVEN(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;

        rowIni = 0;
        rowEnd = (int)(height*0.33) + 1;
        for (int i = 0; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_YELLOW;
            }
        }

        rowIni = (int)(height*0.33) + 1;
        rowEnd = (int)(height*0.66) + 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.66) + 1;
        rowEnd = flag.length;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] banderaPOL(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;

        rowEnd = (int)(height*0.50);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] banderaPAN(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.50);
        collumnIni = 0; collumnEnd = (int)(width*0.50);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][width - 1 - j] = COLOR_WHITE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.50);
        collumnIni = (int)(width*0.50); collumnEnd = (int)(width*1);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[height - 1 - i][width - 1 - j] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] banderaCHL(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = 0; collumnEnd = (int)(width*0.3);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = (int)(width*0.3); collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] banderaUSA(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = 0; collumnEnd = (int)(width*0.3);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = (int)(width*0.3); collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i+=2) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[i+1][j] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.5); rowEnd = (int) (height*0.75) + 2;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i+=2) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[i+1][j] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] banderaCZE(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = 1; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_RED;
            }
            collumnIni++;
        }

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = 0; collumnEnd = 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
                flag[height - 1 - i][j] = COLOR_BLUE;
            }
            collumnEnd++;
        }

        return flag;
    }

    public static int[][] banderaDNK(int height, int width){
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5) - 1;
        collumnIni = 0; collumnEnd = (int)(width*0.3) - 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 1;
        collumnIni = (int)(width*0.3) + 1; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        rowIni = (int)(height*0.5) - 1; rowEnd = (int)(height*0.5) + 1;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 1;
        collumnIni = (int)(width*0.3) - 1; collumnEnd = (int)(width*0.3) + 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] banderaFIN(int height, int width){
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5) - 2;
        collumnIni = 0; collumnEnd = (int)(width*0.3) - 2;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 2;
        collumnIni = (int)(width*0.3) + 2; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.5) - 2; rowEnd = (int)(height*0.5) + 2;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 2;
        collumnIni = (int)(width*0.3) - 2; collumnEnd = (int)(width*0.3) + 2;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
                flag[height - 1 - i][j] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] banderaNOR(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5) - 2;
        collumnIni = 0; collumnEnd = (int)(width*0.3) - 2;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 2;
        collumnIni = (int)(width*0.3) + 2; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[height - 1 - i][j] = COLOR_RED;
            }
        }

        rowIni = (int)(height*0.5) - 2; rowEnd = (int)(height*0.5) + 2;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i+=2) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[i+1][j] = COLOR_BLUE;
            }
        }

        rowIni = (int)(height*0.5) - 2; rowEnd = (int)(height*0.5) + 2;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 2;
        collumnIni = (int)(width*0.3) - 2; collumnEnd = (int)(width*0.3) + 2;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.5) - 1; rowEnd = (int)(height*0.5) + 1;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
            }
        }

        rowIni = 0; rowEnd = (int)(height*0.5) - 1;
        collumnIni = (int)(width*0.3) - 1; collumnEnd = (int)(width*0.3) + 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLUE;
                flag[height - 1 - i][j] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] banderaKWT(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.5);
        collumnIni = 0; collumnEnd = 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_BLACK;
                flag[height - 1 - i][j] = COLOR_BLACK;
            }
            collumnEnd++;
        }

        rowIni = 0; rowEnd = (int)(height*0.3) + 1;
        collumnIni = 1; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_GREEN;
                flag[height - 1 - i][j] = COLOR_RED;
            }
            collumnIni++;
        }

        rowIni = (int)(height*0.3) + 1; rowEnd = (int)(height*0.6) + 1;
        collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] banderaZAF(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = (int)(height*0.3) + 1;
        collumnIni = 2; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
                flag[height - 1 - i][j] = COLOR_BLUE;
            }
            collumnIni += 1;
        }

        rowIni = 0; rowEnd = (int)(height*0.3) + 2;
        collumnIni = 1; collumnEnd = 2;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
            collumnIni++; collumnEnd++;
        }

        rowIni = (int)(height*0.3) + 1; rowEnd = (int)(height*0.3)+ 2;
        collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.3) + 2; rowEnd = (int)(height*0.6) - 2;
        collumnEnd = width;
        for (int i = rowIni; i <= rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_GREEN;
                flag[height - 1 - i][j] = COLOR_GREEN;
            }
        }

        rowIni = 1; rowEnd = (int)(height*0.5);
        collumnIni = 0; collumnEnd = 2;
        flag[0][0] = COLOR_GREEN;
        flag[height - 1][0] = COLOR_GREEN;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_GREEN;
                flag[height - 1 - i][j] = COLOR_GREEN;
            }
            collumnIni++; collumnEnd++;
        }

        rowIni = 2; rowEnd = (int)(height*0.5);
        collumnIni = 0; collumnEnd = 1;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_YELLOW;
                flag[height - 1 - i][j] = COLOR_YELLOW;
            }
            collumnIni++; collumnEnd++;
        }

        return flag;
    }

    public static int[][] banderaCHE(int height, int width) {
        int[][] flag = new int[height][width];
        int rowEnd = 0, rowIni = 0;
        int collumnEnd = 0, collumnIni = 0;

        rowIni = 0; rowEnd = height;
        collumnIni = 0; collumnEnd = width;
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_RED;
            }
        }

        rowIni = (int)(height*0.1); rowEnd = (int)(height*0.3) + 1;
        collumnIni = (int)(width*0.4); collumnEnd = (int)(width*0.6);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        rowIni = (int)(height*0.4); rowEnd = (int)(height*0.6);
        collumnIni = (int)(width*0.2) + 1; collumnEnd = (int)(width*0.78);
        for (int i = rowIni; i < rowEnd; i++) {
            for (int j = collumnIni; j < collumnEnd; j++) {
                flag[i][j] = COLOR_WHITE;
                flag[height - 1 - i][j] = COLOR_WHITE;
            }
        }

        return flag;
    }
}



