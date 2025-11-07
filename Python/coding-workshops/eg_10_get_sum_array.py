def getSum(numbers) -> int:
      sum = 0

      for number in numbers:
            sum = sum + number 
      return sum
def getSum_V2(numbers:list) -> int:
      sum1 = 0
      length = len(numbers)
      for index in range(0,length,1):
            sum1 += numbers[index]
      return sum1
numbers = [1,2,3,4]
print(getSum_V2(numbers))