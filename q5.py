# Question 5: Animal Farm
from abc import ABCMeta, abstractmethod
class Pet(object):
    __metaclass__ = ABCMeta

    def __init__(self, name, age, sex):
        self.name = name
        self.age = age
        self.sex = sex

    def get_age(self):
        return self.age

    def get_name(self):
        return self.name

    def get_sex(self):
        return self.sex

    def speak(self):
        pass

    def get_type(self):
        pass

class Dog(Pet):

    def speak(self):
        return "Bark Bark!"

    def get_type(self):
        return "Dog"


class Cat(Pet):
    def speak(self):
        return "Meow!"

    def get_type(self):
        return "Cat"
