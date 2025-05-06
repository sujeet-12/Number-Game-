import pandas as pd

# Create a DataFrame
data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David'],
    'Math': [85, 90, 78, 92],
    'Science': [88, 84, 75, 95],
    'English': [80, 87, 82, 88]
}

df = pd.DataFrame(data)

# Calculate total and average marks
df['Total'] = df[['Math', 'Science', 'English']].sum(axis=1)
df['Average'] = df['Total'] / 3

# Display full table
print("Student Marks Data:")
print(df)

# Find the top performer
top_student = df.loc[df['Total'].idxmax()]
print("\nTop Performer:")
print(top_student)
