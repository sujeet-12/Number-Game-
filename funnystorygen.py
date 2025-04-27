import random

# Lists of random story elements
characters = ["a grumpy cat", "an alien from Mars", "a sneezing dragon", "a confused robot", "a dancing banana"]
locations = ["in a haunted house", "on a flying carpet", "at the zoo", "inside a video game", "on top of a mountain"]
actions = ["started singing opera", "forgot how to walk", "began talking in emojis", "turned into a potato", "won a dance battle"]
sidekicks = ["a chicken with sunglasses", "a turtle on a skateboard", "a ghost who loves pizza", "a jellybean detective", "a llama that does kung-fu"]
plot_twists = ["and then it started raining tacos", "but it was all a dream", "until they found a portal to a donut world", "and they were crowned king of the squirrels", "then aliens joined their party"]

# Function to generate a random funny story
def generate_story():
    character = random.choice(characters)
    location = random.choice(locations)
    action = random.choice(actions)
    sidekick = random.choice(sidekicks)
    twist = random.choice(plot_twists)
    
    story = f"One day, {character} was {location} when they suddenly {action}. Luckily, they were not alone—{sidekick} was there to help. {twist}!"
    return story

# Generate and print a story
if __name__ == "__main__":
    print("Here's your random funny story:")
    print(generate_story())
