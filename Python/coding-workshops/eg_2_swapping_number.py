def swap(item1, item2):
    temp = item1
    item1 = item2
    item2 = temp
    
    # return item2,item1
def invoke_swap():

    number1 = 10
    number2 = 20
    print(number1)
    print(number2)

    print(f"before swap number 1 is {number1} and number 2 is {number2}")
    number1,number2 = swap(number1,number2)
    print(f"after swapping number1 {number1} and number2 is {number2}")
    print(number1)
    print(number2)

if __name__ == "__main__":
    invoke_swap()

