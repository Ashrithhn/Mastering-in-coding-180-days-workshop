values = range(10)
for value in values:
    print(value)

for value in range(10):
    print(value)

for value in range(10,100,5):
    print(value)

for value in range(12,1,-1):
    print(value)

Teachers = ["Mahesh", "sangeetha" ]
for teacher in Teachers:
    print(teacher)  
    if teacher == "Mahesh":
        continue
    print(teacher)
    print(teacher.upper()  )

squares = [number ** 2 for number in range(8)]
print(squares)

numbers = [2, 4, 3, 5, 7]
for number in numbers:
    print(number)
    if number == 3               :
        print("number 3 found so breaking")
        break
else:
    print("number 3 not found")
