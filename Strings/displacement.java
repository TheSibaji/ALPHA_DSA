package Strings;

public class displacement {

    // method for get displacement or shortest path
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++){
            char direction = path.charAt(i);    //checking each element
            if(direction == 'E'){
                x++;
            }
            else if(direction == 'W'){
                x--;
            }
            else if(direction == 'N'){
                y++;
            }
            else if(direction == 'S'){
                y--;
            }
        }
        
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args){
        String str = "WNEENESENNN";

        System.out.println(getShortestPath(str));
    }
}
