def getSum(number1, number2):
    return number1 + number2
def getSum_invoke():

    sum = getSum(10,20)
    print(f"sum of and is {sum}")

    sum2 = getSum (80.1,78.1)
    print(sum2)

    sum3 = getSum("namaskara", " bharatha")
    print(sum3)

    a = 2 
    b = 6
    # answer = a + b
    sum4 = getSum(a,b)
    print(f"the sum of {2} and {6} is {sum4}")

def getIntegerSum(number1 : int ,number2: int ) -> int:
    answer = number1 + number2
    return answer
def getIntegerSum_invoke():

    sum_int1 = getIntegerSum(20,13.1)
    print(sum_int1)

    sum_int2 = getIntegerSum(30,10)
    print(sum_int2)

getIntegerSum_invoke()
getSum_invoke()   