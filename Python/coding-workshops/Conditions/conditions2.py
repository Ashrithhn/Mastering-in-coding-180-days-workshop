def getClassPercentageForResults(percentage : float) -> str:
    if (percentage >= 75):
        return "Distinction"
    elif (percentage >= 60):
        return "First Class"
    elif (percentage >= 50):
        return "Second Class" 
    elif (percentage >= 35):
        return "Pass Class"
    else:
        return "Failed"
student_1_percentage = 80
result = getClassPercentageForResults(student_1_percentage)
print(result)
# print(getClassPercentageForResults(student_1_percentage))