#question 4
file = open("input.txt", "r+")
for line in file.readline():
    if "teaching assistant" in line:
        print line + "is awesome"
    else:
        print line

file.close()
