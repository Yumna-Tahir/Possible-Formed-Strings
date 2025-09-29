package characters;

import java.util.ArrayList;

public class characterCounter{
    private String inputText;
    private ArrayList<characterEntry> characterList;

    public characterCounter(String inputText){
        this.inputText= inputText;
        this.characterList= new ArrayList<>();
    }

    public void permutations(){
        permute("", inputText);
    }
    public void permute(String prefix, String remaining){
        if(remaining.length()==0){
            characterList.add(new characterEntry(prefix));
        }
        else{
            for(int i=0; i< remaining.length(); i++){
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
                permute(newPrefix, newRemaining);
            }
        }
    }

    public void printPermutations(){
        for(characterEntry entry: characterList){
            System.out.println(entry.character);
        }
    }
    
}