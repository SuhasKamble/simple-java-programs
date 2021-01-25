import os

list_dirir = os.listdir()
filter_files = [file for file in list_dirir if file.endswith('.class')]

for file in filter_files:
    os.remove(file)

print("All class files are deleted...")
