// route containg 4direction  (east, west, north, south)
// find the shortest path to get the destination 

// for going to North (means upward direction) -- y+1
// for going to South (means downward direction) -- y-1
// for going to East (means right direction) -- x+1
//for going to West (means left direction) -- x-1


public class shortPath {
    public static float getShortestPath(String str) {
        int x =0, y=0;
        for (int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);

            // north
            if (dir == 'N') {
                y++;
            }
            // south
            else if (dir == 'S') {
                y--;
            }
            // East 
            else if (dir == 'E') {
                x++;
            }
            else {
                x--;
            }
            // west
            // if (dir == 'W') {
            //     x--;
            // }
        }
        int X2= x*x;
        int Y2= y*y;

        return (float)Math.sqrt(X2 + Y2);

    }
    public static void main (String args []) {
        String str = "WNEENESENNN";

        System.out.print(getShortestPath(str));

    }
    
}
