def getStringLen(string) -> int :
    if string != None:
        counter = 0
        for _ in string:
            counter = counter + 1
        return counter

input = None
print(f"length of string {input} is {getStringLen(input)}")

input1 = " "
print(f"length of string {input1} is {getStringLen(input1)}")

input2 = "abc"
print(f"length of string {input2} is {getStringLen(input2)}")