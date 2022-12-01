import java.io.*;

public class main {
    public static int nearestValidPoint(int x, int y, int[][] points){
        int minlength = Integer.MAX_VALUE;
        int p = -1;
        for (int i = 0; i<points.length; ++i){
            int ai = points[i][0];
            int bi = points[i][1];
            if (ai == x){
                int minlength_cache = Math.abs(bi-y);
                if (minlength > minlength_cache){
                    minlength = minlength_cache;
                    p = i;
                }
            } else if(bi == y){
                int minlength_cache = Math.abs(ai-x);
                if (minlength > minlength_cache){
                    minlength = minlength_cache;
                    p = i;
                }
            }
        }
        return p;
    }
    public static void main(String []args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("x = ");
        int x = Integer.parseInt(bufferReader.readLine());
        System.out.print("y = ");
        int y = Integer.parseInt(bufferReader.readLine());
        System.out.print("points = ");
        String string = bufferReader.readLine();
        String []strings = string.substring(1, string.length()-1).split("],|]");
        int [][]points = new int[strings.length][2];
        for (int i = 0; i<strings.length; i++){
            strings[i] = strings[i].substring(1);
            String[] s = strings[i].split(",");
            points[i][0] = Integer.parseInt(s[0]);
            points[i][1] = Integer.parseInt(s[1]);
        }
        System.out.println(nearestValidPoint(x,y,points));
    }
}
