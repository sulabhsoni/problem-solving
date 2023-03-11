
    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        PriorityQueue<ArrayList<Integer>> pq = 
            new PriorityQueue<ArrayList<Integer>>((a,b)-> a.get(0)-b.get(0));
        
        if(intervals.size() <=1)
        {
           return 1; 
        }
        for(int i = 0 ; i < intervals.size(); i++)
        {
            pq.add(intervals.get(i));
        }

        int prevClose = pq.poll().get(1);
        while(!pq.isEmpty())
        {
            if(pq.peek().get(0) < prevClose) {
                return 0;
            }
            else
            {
                prevClose = pq.poll().get(1);
            }
        }
        return 1;
    }
