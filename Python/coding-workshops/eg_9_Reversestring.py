def Reverse_String(string):
    length = len(string)
    # middle = int(length / 2)

    # for start,end in zip(range(0,length,1), range(length-1,-1,-1)):
    #     # string[start],string[end] = string[end],string[start]  #string is immutable
    #     print(f"start:{start} end:{end}")
    # for start in range(0, middle,1):
    #     print(start)
    # for end in range(length-1, middle,-1):
    #     print(end)
    reversed_string = ""
    for end in range(length-1,-1,-1):
        reversed_string += string[end]
    return reversed_string


print(Reverse_String("abc"))
