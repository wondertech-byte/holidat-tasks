class CipherMachine{


    public char[] toArray(String message){
       char[] letters = message.toCharArray();
        return letters;
    }
 

    public char[] cipher(char[] letters, int key){
        int index = 0;
        char[] cipher = new char[letters.length];
        for(char letter: letters){
            if(Character.isUpperCase(letter)){
                cipher[index++] = (char) ( 'A' + (letter - 'A' + key) % 26); 
            }  
            else if (Character.isLowerCase(letter)){
                cipher[index++] = (char) ( 'a' + (letter - 'a' + key) % 26); 
            }
            else { cipher[index++]= letter;}
        }
        return cipher;
    }


     public char[] decipher(char[] letters, int key){
       int index = 0;
       char[] cipher = new char[letters.length];
        for(char letter: letters){
            if(Character.isUpperCase(letter)){
                cipher[index++] = (char) ( 'A' + (letter - 'A' - key) % 26); 
            }  
            else if (Character.isLowerCase(letter)){
                cipher[index++] = (char) ( 'a' + (letter - 'a' - key) % 26); 
            }
            else { cipher[index++]= letter;}
        }
        return cipher;
    }

    
}
