
def add(f_number,s_number):
    return f_number + s_number

def subtract(f_number,s_number):
    return f_number - s_number    

def multiply(f_number,s_number):
    return f_number * s_number 

def divide(f_number,s_number):
    return f_number / s_number 
    
print("Welcome to the python calculator")
print("You can input the numbers using the keypad in the form:")
print("First Number <space> Operator <Space> Second Number <Enter>")
first_number,operator,second_number = input("").split()
if operator == '+':
    print (f"{first_number} {operator} {second_number} = {add(int(first_number),int(second_number))}")
elif operator == '-':
    print (f"{first_number} {operator} {second_number} = {subtract(int(first_number),int(second_number))}")
elif operator == '*':
    print (f"{first_number} {operator} {second_number} = {multiply(int(first_number),int(second_number))}")
elif operator == '/':
    print (f"{first_number} {operator} {second_number} = {divide(int(first_number),int(second_number))}")
else:
    print("Operator Not Defined")
    
    
    