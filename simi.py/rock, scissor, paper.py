import random
def user2():
    choices =["rock","paper", "scissor"]
    user2=random.choice(choices)
    
    return user2

print("rock, paper, scissor")
user1=input("pick between rock, paper and scissor, user1: ")
print ;{user2}
 


if user1 == user2:
    print('It is a draw')
    
elif user1 == "rock" and user2 == "scissor" or user1== "paper" and user2=="rock" or user1=="scissor" and user2=="paper":
    print('User1 wins.')
else:
    print('User2 wins.')
    
def main():
    while True:
        playagain=input("Do you want to play again? (yes/no): ").lower()
        if playagain!= "yes":
            break  