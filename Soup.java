//Tyler Skibo
// September 
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "";
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

    //input a string to be added to the string letters
    public void add(String word){
        letters += word;
    }
    //the string letters now contains the word inputted

    //the string letters must have a value
    public String randomLetter(){
        int index = (int)(Math.random()*(letters.length()));
        String randomLetter= letters.substring (index, index + 1);
        return (randomLetter);
    }
    //returns a random letter from the string letters

    //must have a non null company name
    public String companyCentered(){
        company = getCompany();
        int middleIndex = (letters.length()/2);
        letters = letters.substring(0,middleIndex) + company + 
            letters.substring(middleIndex,letters.length());
        return (letters);
    }
    //the company name is now in the middle of the string letters

    //The string letters must have a value, and for this to be effective must contain a vowel
    public void removeFirstVowel(){
        letters = (letters.replaceFirst("[aeiouAEIOU]", ""));
    }
    //the string letters is returned without the first vowel

    //num must be an int that is not longer than the length of the string
    public void removeSome(int num){
        int startIndex = (int)(Math.random()*letters.length());
        letters = (letters.substring(0,startIndex)) + letters.substring((startIndex + num), letters.length());
    }
    //the string is returned what "num" character removed from a random index

    //word must be a string
    public void removeWord(String word){
        int index = letters.indexOf(word);
        letters = (letters.substring(0, index) + letters.substring((index+word.length()), letters.length()));
    }
    //if "word" was in the string it wa sremoved and letters is returned, if not, letters is the same
}
