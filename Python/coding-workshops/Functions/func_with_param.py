def print_student_details(name: str, age: int, cgpa: float) -> int:
    print("name:", name)
    print("age:", age)
    print("cgpa:", cgpa)
    return name, age, cgpa

name,age,cgpa = print_student_details("Ashrith", 20, 9.5)
print(name,age,cgpa)

def print_student_details_simple(name,age,cgpa):
    print("name:", name)
    print("age:", age)
    print("cgpa:", cgpa) 
    return name,age,cgpa   
name1,age ,cgpa= print_student_details_simple("Ashrith_2", 20, 9.4)
print(name1)  # None
print(age)
print(cgpa)