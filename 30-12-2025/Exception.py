class InvalidAge(Exception):
    pass

age = 15
if age < 18:
    raise InvalidAge("Not eligible")
