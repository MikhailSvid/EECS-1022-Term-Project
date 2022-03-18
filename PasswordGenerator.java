import java.util.ArrayList;
import java.util.Random;
public class PasswordGenerator {
    int length;
    boolean numbers;
    boolean lettersUpper;
    boolean lettersLower;
    boolean specialChar;
    String label;
    String [] nums = new String [10];
    String [] lettersUp = new String [26];
    String [] lettersLow = new String [26];
    String [] specialChars = new String [29];
    ArrayList<String> passwordList = new ArrayList<>();
    String password;


    public PasswordGenerator(String label, int length, boolean numbers, boolean lettersUpper, boolean lettersLower, boolean specialChar){
        this.label = label;
        this.length = length;
        this.numbers = numbers;
        this.lettersLower = lettersLower;
        this.lettersUpper = lettersUpper;
        this.specialChar = specialChar;
        fillPasswordList();
        password = "";
    }

    public void fillNums(){
        for (int i = 0; i <= 9; i++){
            nums[i] = String.format("%d", i);
        }
    }
    public void fillLettersUp(){
        int ctr = 0;
        for (int i = 65; i <= 90; i++){
            lettersUp[ctr] = Character.toString(i);
            ctr += 1;
        }
    }

    public void fillLettersLow(){
        int ctr = 0;
        for (int i = 97; i <= 122; i++){
            lettersLow[ctr] = Character.toString(i);
            ctr += 1;
        }
    }

    public void fillSpecialChars(){
        int ctr = 0;
        for (int i = 32; i <= 47; i++){
            specialChars[ctr] = Character.toString(i);
            ctr += 1;
        }
        for (int i = 58; i <= 64; i++){
            specialChars[ctr] = Character.toString(i);
            ctr += 1;
        }
        for (int i = 91; i <= 96; i++){
            specialChars[ctr] = Character.toString(i);
            ctr += 1;
        }
    }

    public void fillPasswordList(){
        if (numbers){
            fillNums();
            for (int i = 0; i <= 9; i++){
                passwordList.add(nums[i]);
            }
        }
        if (lettersUpper){
            fillLettersUp();
            for (int i = 0; i < 26; i++){
                passwordList.add(lettersUp[i]);
            }
        }
        if (lettersLower){
            fillLettersLow();
            for (int i = 0; i < 26; i++){
                passwordList.add(lettersLow[i]);
            }
        }
        if (specialChar){
            fillSpecialChars();
            for (int i = 0; i < 29; i++){
                passwordList.add(specialChars[i]);
            }
        }
    }

    public void generatePassword(){
        Random rand = new Random ();
        for (int i = 0; i < length; i++){
            int index = rand.nextInt(passwordList.size());
            password = password + passwordList.get(index);
        }
    }

    public String getPassword(){
        return password;
    }

    public String getLabel(){
        return label;
    }
}
