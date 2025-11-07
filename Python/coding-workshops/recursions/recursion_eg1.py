def increment_and_print(count : int):
    if count >= 2:
        return 
    count = count + 1
    print(f"{count}")
    increment_and_print(count) #RECURSION
    print(f"{count}")
    # increment_and_print(count)
    # print(f"{count}")

increment_and_print(0)