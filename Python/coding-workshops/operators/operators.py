def demonstrate_operators():
    print("Demonstrating Different Types of Operators in Python")
    def demonstrate_arithematic_operators():
        CountOfApples , CountOfMangoes = 10,3
        print("Arithematic Operators")
        answer = CountOfApples + CountOfMangoes
        
        print(f"Addition is : {CountOfApples} + {CountOfMangoes} =  { answer}")
        answer = CountOfApples - CountOfMangoes
        print(f"Subtraction is : {CountOfApples} - {CountOfMangoes} =  {answer}")
        answer = CountOfApples * CountOfMangoes
        print(f"Multiplication is : {CountOfApples} * {CountOfMangoes} =  { answer}")
        answer = CountOfApples / CountOfMangoes
        print(f"Division is : {CountOfApples} / {CountOfMangoes} =  { answer}")
        answer = CountOfApples // CountOfMangoes #Floor Division
        print(f"Floor Division is : {CountOfApples} // {CountOfMangoes} =  { answer}")
        answer = CountOfApples % CountOfMangoes
        print(f"Modulus is : {CountOfApples} % {CountOfMangoes} =  { answer}")
        answer = CountOfApples ** CountOfMangoes
        print(f"Exponentiation is : {CountOfApples} ** {CountOfMangoes} =  { answer}")

    def demonstrate_relational_operators():
        print("\nRelational Operators")
        CountOfApples , CountOfMangoes = 10,3
        answer = CountOfApples == CountOfMangoes
        print(f"Equal to : {CountOfApples} == {CountOfMangoes} ->  { answer}")
        answer = CountOfApples != CountOfMangoes
        print(f"Not Equal to : {CountOfApples} != {CountOfMangoes} ->  { answer}")
        answer = CountOfApples > CountOfMangoes
        print(f"Greater than : {CountOfApples} > {CountOfMangoes} ->  { answer}")
        answer = CountOfApples < CountOfMangoes
        print(f"Less than : {CountOfApples} < {CountOfMangoes} ->  { answer}")
        answer = CountOfApples >= CountOfMangoes
        print(f"Greater than or Equal to : {CountOfApples} >= {CountOfMangoes} ->  { answer}")
        answer = CountOfApples <= CountOfMangoes
        print(f"Less than or Equal to : {CountOfApples} <= {CountOfMangoes} ->  { answer}")

    def demonstrate_logical_operators():
        print("\nLogical Operators")
        isReady,isGood = True,False
        answer = isReady & isGood
        print(f"Logical AND : {isReady} and {isGood} ->  { answer}")
        answer = isReady or isGood
        print(f"Logical OR : {isReady} or {isGood} ->  { answer}")
        answer = not isReady
        print(f"Logical NOT : not {isReady} ->  { answer}")
        answer = not isGood
        print(f"Logical NOT : not {isGood} ->  { answer}")  
    def demonstarte_bitwise_operators():
        print("\nBitwise Operators")
        redteamscore , whiteteamscore = 5,2
        answer = redteamscore & whiteteamscore
        print(f"Bitwise AND : {redteamscore} & {whiteteamscore} ->  { answer}")
        answer = redteamscore | whiteteamscore
        print(f"Bitwise OR : {redteamscore} | {whiteteamscore} ->  { answer}")
        answer = redteamscore ^ whiteteamscore
        print(f"Bitwise XOR : {redteamscore} ^ {whiteteamscore} ->  { answer}")
        answer = ~ whiteteamscore
        print(f"Bitwise NOT : ~ {redteamscore} ->  { answer}")
        answer = redteamscore << 2
        print(f"Bitwise Left Shift : {redteamscore} << 2 ->  { answer}")
        answer = redteamscore >> 2
        print(f"Bitwise Right Shift : {redteamscore} >> 2 ->  { answer}")
    def demonstrate_assignment_operators():
        print("\nAssignment Operators")
        TotalScore = 5
        TotalScore += 2
        print(f"Add AND Assign : TotalScore += 2 -> {TotalScore}")
        TotalScore -= 2
        print(f"Subtract AND Assign : TotalScore -= 2 -> {TotalScore}")
        TotalScore *= 2
        print(f"Multiply AND Assign : TotalScore *= 2 -> {TotalScore}")
        TotalScore /= 2
        print(f"Divide AND Assign : TotalScore /= 2 -> {TotalScore}")
        TotalScore //= 2
        print(f"Floor Divide AND Assign : TotalScore //= 2 -> {TotalScore}")
        TotalScore %= 3
        print(f"Modulus AND Assign : TotalScore %= 2 -> {TotalScore}")
        TotalScore **= 2
        print(f"Exponent AND Assign : TotalScore **= 2 -> {TotalScore}")
        # TotalScore &= 2
        # print(f"Bitwise AND AND Assign : TotalScore &= 2 -> {TotalScore}") #gives error
        # TotalScore |= 2
        # print(f"Bitwise OR AND Assign : TotalScore |= 2 -> {TotalScore}")
        # TotalScore ^= 2
        # print(f"Bitwise XOR AND Assign : TotalScore ^= 2 -> {TotalScore}") #commented opertaors giving errors type error
        # TotalScore >>= 2
        # print(f"Bitwise Right Shift AND Assign : TotalScore >>= 2 -> {TotalScore}")
        # TotalScore <<= 2
        # print(f"Bitwise Left Shift AND Assign : TotalScore <<= 2 -> {TotalScore}")

    demonstrate_arithematic_operators()
    demonstrate_relational_operators()
    demonstrate_logical_operators()
    demonstarte_bitwise_operators()
    demonstrate_assignment_operators()
demonstrate_operators()
