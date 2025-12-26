
function isUpperCase(letter){
 if (letter >= 'A' && letter <= 'Z')
    return true
  return false
}

function isLowerCase(letter){
 if (letter >= 'a' && letter <= 'z')
    return true
  return false
}


function cipherEncript(words, key){
    let password = ""
    for (var letter of words){
        if(isUpperCase(letter)){
            let cipher = "" + String.fromCharCode(65 + ((letter.charCodeAt() - 65) + key) % 26)
            password += cipher
        }  
        else if (isLowerCase(letter)){
            cipher = "" + String.fromCharCode(97 + ((letter.charCodeAt() - 97) + key) % 26)
            password += cipher
        }       
        else password += letter
    }
    
    return password

}

function cipherDecript(words, key){
    let password = ""
    for (var letter of words){
        if(isUpperCase(letter)){
            let cipher = "" + String.fromCharCode(65 + ((letter.charCodeAt() - 65) - key) % 26)
            password += cipher
        }  
        else if (isLowerCase(letter)){
            cipher = "" + String.fromCharCode(97 + ((letter.charCodeAt() - 97) - key) % 26)
            password += cipher
        }       
        else password += letter
    }
    
    return password

}

console.log(cipherEncript("Samuel..",3))
console.log(cipherDecript("Vdpxho..",3))

