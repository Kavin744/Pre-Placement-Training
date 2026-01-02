import re

def strong(p):
    return (len(p)>=8 and
            re.search("[A-Z]",p) and
            re.search("[a-z]",p) and
            re.search("[0-9]",p) and
            re.search("[@#$]",p))

print(strong("Abc@1234"))
