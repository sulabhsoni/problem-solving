
    static ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {
        // Write your code here.
        int b = 0;
        int g = -1;
        int r = -1;
        while(b < balls.size()) {
            if(balls.get(b) != 'B'){
                ++g;
                //swap B and G
                Character temp = balls.get(b);
                balls.set(b, balls.get(g));
                balls.set(g, temp);
                
                if(balls.get(g) != 'G') {
                    r++;
                    //swap r and g
                    temp = balls.get(g);
                    balls.set(g, balls.get(r));
                    balls.set(r, temp);
                
                }
            }
            
            b++;
        }
        return balls;
    }
