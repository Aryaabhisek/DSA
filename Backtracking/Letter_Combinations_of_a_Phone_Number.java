/* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = "2"
Output: ["a","b","c"] */





class Solution {
    static void solve(String digits,int index,String[] mapping,List<String> result,StringBuilder output){
        
        //base case
        if (index >= digits.length()){
            result.add(output.toString());
            return;
        }
        //processing
        int value = digits.charAt(index) - '0';//to covert it to number
        String mappedString = mapping[value];

        for (int i = 0; i < mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            //r.r
            solve(digits,index+1,mapping,result,output);
            //backtracking step
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
       String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       List<String> result = new ArrayList<>();
       int index = 0;
       StringBuilder output = new StringBuilder();
       solve(digits, index, mapping, result, output);
       return result; 
    }
}