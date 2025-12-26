
def cipher_encript(words, key):
    password = ""
    for letter in words:
        if letter.isupper():
            cipher = "" + chr(65 + ((ord(letter) - 65) + key) % 26)
            password += cipher
        elif letter.islower():
            cipher = "" + chr(97 + ((ord(letter) - 97) + key) % 26)
            password += cipher
        else:
            password += letter
    return password


def cipher_decript(words, key):
    password = ""
    for letter in words:
        if letter.isupper():
            cipher = "" + chr(65 + ((ord(letter) - 65) - key) % 26)
            password += cipher
        elif letter.islower():
            cipher = "" + chr(97 + ((ord(letter) - 97) - key) % 26)
            password += cipher
        else:
            password += letter
    return password



print(cipher_encript("Samuel..", 3))
print(cipher_decript("Vdpxho..", 3))

