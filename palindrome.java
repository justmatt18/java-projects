public class Palindrome {

    public static void main(String[] args) {
        String word = "LevEl";
        int startPos = 0;
        int endPos = word.length() - 1;
        boolean isPalindrome= true;

        while (startPos < endPos) {
            String startLetter = word.substring(startPos, startPos+1);
            String endLetter = word.substring(endPos, endPos+1);

            if(startLetter.equalsIgnoreCase(endLetter)){
                isPalindrome = false;
                break;
            }
            startPos++; endPos++;
        } 

        if(isPalindrome){
            System.out.println("The "+word+ " is a Palindrome!");
        }else{
            System.out.println("The "+word+" is not a Palindrome!");
        }
        
    }
}