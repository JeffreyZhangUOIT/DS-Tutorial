file = open("text.txt", "r")
for line in file:
    if "teaching assistant" in line:
        pos = line.find("teaching assistant")
        print line[:(pos+18)] + " is awesome" + line[(pos+18):]
    else:
        print line

file.close()
