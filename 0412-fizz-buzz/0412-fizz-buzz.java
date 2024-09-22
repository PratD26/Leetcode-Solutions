class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();

        for(int i=1;i<=n;i++){
            
            res.add(
                i%15 == 0 ? "FizzBuzz":
                i%3 == 0 ? "Fizz":
                i%5 == 0 ? "Buzz":
                Integer.toString(i)
            );
        }
        return res;
    }
}