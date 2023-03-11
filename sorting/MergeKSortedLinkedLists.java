
    /*
    For your reference:
    class LinkedListNode {
        Integer value;
        LinkedListNode next;

        LinkedListNode(Integer value) {
            this.value = value;
            this.next = null;
        }
    }
    */
    static LinkedListNode merge_k_lists(ArrayList<LinkedListNode> lists) {
        // Write your code here.
        if(lists == null || lists.size() == 0) {
             return null;
        }
        return mergeHelper(lists, 0, lists.size()-1);
    }
    
     static LinkedListNode mergeHelper(ArrayList<LinkedListNode> lists, int s, int e) {
        if (s == e) {
            return lists.get(s);
        }
        int  mid = s + (e-s)/2;
        LinkedListNode left =  mergeHelper(lists, s, mid);
        LinkedListNode right =  mergeHelper(lists, mid+1, e);
        return merge(left, right);
     }
        
    static LinkedListNode merge(LinkedListNode l, LinkedListNode r) {
        LinkedListNode result = new LinkedListNode(-1);
        LinkedListNode cur = result;
        while(l != null || r != null)
        {
            if(l == null)
            {
                cur.next=r;
                r = r.next;
            }
            else if(r == null)
            {
                cur.next = l;
                l = l.next;
            }
            else if(l.value < r.value)
            {
                cur.next = l;
                l = l.next;
            }
            else
            {
                cur.next = r;
                r = r.next;
            }
            cur = cur.next;
        }
       
        return result.next;
    }




