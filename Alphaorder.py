# Created by Hritik Gautam



user_input = input("Enter your name: ").lower()

alphabet = 'abcdefghijklmnopqrstuvwxyz'

arranged_name = []

for letter in alphabet:
    if letter in user_input:
        count = user_input.count(letter)
        if count == 1:
            arranged_name.append(letter)
        else:
            arranged_name.append(letter.upper())
            count -= 1
            while count > 0:
                arranged_name.append(letter.lower())
                count -= 1

print('Your name is =>', user_input.capitalize())

for i in range(len(arranged_name)):
    print('line', i+1, '=>', arranged_name[i], '-', user_input.replace(' ', '')[len(arranged_name[:i+1]):].capitalize())

final = ''.join(arranged_name)

print('Final =>', final)


# Generate alpha code
alpha_code = ''
for letter in final:
    alpha_code += str(ord(letter.lower()) - 96) + ' '

print('Alpha code =>', alpha_code)

#TRY your name 

#made by Hritik don't copy my code make your own logic and create a good and new code and i request everyone please support My code. 
