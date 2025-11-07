def isDigit(number):
    isInteger = True
    for everycharacter in number:
        if(everycharacter >= '0' and everycharacter <= '9'):
            continue
        else:
            isInteger = False
            break
    return isInteger
    #     if(everycharacter < '0' and everycharacter > '9'):
    #         # continue
    #         return False
    # # else:
    # return True
result = isDigit("124")
print(result)