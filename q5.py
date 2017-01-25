# Question 5: Animal Farm
import abc


class Pet(object):
    __metaclass__ = abc.ABCMeta

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

    @abc.abstractmethod
    def speak(self):
        pass

    @abc.abstractmethod
    def get_type(self):
        pass


class Dog(Pet):
    def speak(self):
        print "Bark Bark!"

    def get_type(self):
        return "Dog"


class Cat(Pet):
    def speak(self):
        print "Meow!"

    def get_type(self):
        return "Cat"


cat = Cat("Nyan", 2, "female")
dog = Dog("Doge", 1, "male")


print "--------------------------------------------"
print "Name of the pet: "+dog.get_name()
print "Age of the pet: "+str(dog.get_age())
print "Sex of the pet: "+dog.get_sex()
print "Type of the pet: "+dog.get_type()
dog.speak()
print "--------------------------------------------"
print "Name of the pet: "+cat.get_name()
print "Age of the pet: "+str(cat.get_age())
print "Sex of the pet: "+cat.get_sex()
print "Type of the pet: "+cat.get_type()
cat.speak()
print "--------------------------------------------"
