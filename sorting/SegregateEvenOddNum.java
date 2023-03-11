
    static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
        int  n = numbers.size();
        int even = -1;
        int odd = 0;
        while(odd < n)
        {
            if(numbers.get(odd) % 2 == 0)
            {
               even++;
               int temp = numbers.get(odd);
               numbers.set(odd, numbers.get(even));
               numbers.set(even, temp);
            }
            odd++;
        }
        return numbers;
    }
