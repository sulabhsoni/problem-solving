
    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Write your code here.
        int p1 = first.size()-1;
        int p2 = first.size()-1;
        int p3 = second.size()-1;
        while(p1 >= 0 && p2 >= 0)
        {
            if(first.get(p1) >= second.get(p2))
            {
                second.set(p3, first.get(p1));
                p1--;
            }
            else {
                second.set(p3, second.get(p2));
                p2--;
            }
            p3--;
        }
        while(p1 >= 0){
            second.set(p3, first.get(p1));
            p1--;
            p3--;
        }
        return second;
    }
