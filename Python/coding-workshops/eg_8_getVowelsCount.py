def getVowelsCount(string) -> int :
    counter = 0
    if string is not None:
    # if string != None:
        for character in string:
            if (character == 'a' or 
                character == 'e' or 
                character == 'i' or 
                character == 'o' or 
                character == 'u' or
                character == 'A' or
                character == 'E' or
                character == 'I' or
                character == 'O' or
                character == 'U' ):
            

                counter = counter +   1
        return counter
    else:
        return 0  
print(getVowelsCount(None))


            
