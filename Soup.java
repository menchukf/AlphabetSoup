//Name: Joseph Fitzpatrick
// Date: 09/29/2026
// Description: This program contains various methods for modifying, removing, and concatenating strings in the Soup class. 



public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.


    //adds a word to the pool of letters known as "letters"
    //pre condition: word is not null
    //post condition: word added to letters
    public void add(String word){
        letters+=word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    // pre condition: letters.length() must be greater than 0 (at least one character)
    // post condition: returns one character from a randomly selected index in letters
    public char randomLetter(){
        
        int randLetterIndex = (int)( Math.random() * letters.length());
        return letters.charAt(randLetterIndex);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //pre condition: None
    //post condition: returns the concatenated strings of firstPart, company, and secondPart with company inserted in the center 
    public String companyCentered(){
            int middleIndex = letters.length() / 2;
                
            
            String firstPart = letters.substring(0,middleIndex);
            String secondPart = letters.substring(middleIndex, letters.length());


       return (firstPart + company + secondPart);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    // precondition: None
    // postcondition: removes the first vowel in letters. if no vowels are present, then letters remains the same
    public void removeFirstVowel(){
        String lettersLCVowel = letters.toLowerCase();
        for (int i = 0; i < letters.length(); i++)
        {
            if (lettersLCVowel.charAt(i) == 'a')
            {
                letters = letters.substring(0,i)+letters.substring(i+1);
                break;
            }
            if (lettersLCVowel.charAt(i) == 'e')
            {
                letters = letters.substring(0,i)+letters.substring(i+1);
                break;
            }
            if (lettersLCVowel.charAt(i) == 'i')
            {
                letters = letters.substring(0,i)+letters.substring(i+1);
                break;
            }
            if (lettersLCVowel.charAt(i) == 'o')
            {
                letters = letters.substring(0,i)+letters.substring(i+1);
                break;
            }
            if (lettersLCVowel.charAt(i) == 'u')
            {
                letters = letters.substring(0,i)+letters.substring(i+1);
                break;
            }
        }
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    // precondition: num is less than or equal to the length of letters and greater than or equal to 0
    // postcondition: removes num characters starting at a randomly selected index of letters
    
    public void removeSome(int num){
       
        int randLetterIndex = (int)( Math.random() * (letters.length()-num+1));
        letters = letters.substring(0,randLetterIndex) + letters.substring(randLetterIndex+num);
        
        
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precondition: word parameter is given an inputted non-null valid string
    //postcondition: removes word if present in letters. if word isn't present, letters remains the samee. 
    public void removeWord(String word){
        int indexWord = letters.indexOf(word);
        letters = letters.substring(0,indexWord) + letters.substring(indexWord+word.length());
    }
}
