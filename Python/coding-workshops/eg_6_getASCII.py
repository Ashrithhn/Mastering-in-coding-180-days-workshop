def getASCII_value_anyString(string) -> int :

    for character in string:
        # ascii_value = ord(character)
        print(f"{character} = {ord(character)}")
        # print("it like aanother")
        # print(f"{character} = {ascii_value}")
getASCII_value_anyString("abc")
getASCII_value_anyString("ABC")
getASCII_value_anyString("123")
getASCII_value_anyString("!@#$%^&*()_+")