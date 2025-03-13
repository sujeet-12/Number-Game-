class Dictionary
  def initialize
    @dictionary = {
      "apple" => "A sweet fruit that grows on trees.",
      "ruby" => "A dynamic, open-source programming language.",
      "github" => "A platform for hosting and collaborating on code projects.",
      "developer" => "A person who creates software applications.",
      "algorithm" => "A set of rules to solve a problem in computing.",
      "variable" => "A storage location paired with an associated name in programming."
    }
  end

  # Display all words
  def display_words
    puts "\n📖 Dictionary Words:"
    @dictionary.each { |word, definition| puts "- #{word.capitalize}: #{definition}" }
  end

  # Search for a word
  def search_word(word)
    if @dictionary.key?(word)
      puts "\n🔍 Definition of '#{word}': #{@dictionary[word]}"
    else
      puts "\n❌ Word '#{word}' not found in the dictionary."
    end
  end

  # Add a new word
  def add_word(word, definition)
    if @dictionary.key?(word)
      puts "\n⚠️ The word '#{word}' already exists in the dictionary."
    else
      @dictionary[word] = definition
      puts "\n✅ Word '#{word}' added successfully!"
    end
  end

  # Update an existing word
  def update_word(word, new_definition)
    if @dictionary.key?(word)
      @dictionary[word] = new_definition
      puts "\n🔄 Definition of '#{word}' updated successfully!"
    else
      puts "\n❌ Word '#{word}' not found in the dictionary."
    end
  end

  # Delete a word
  def delete_word(word)
    if @dictionary.key?(word)
      @dictionary.delete(word)
      puts "\n🗑️ Word '#{word}' deleted successfully!"
    else
      puts "\n❌ Word '#{word}' not found in the dictionary."
    end
  end
end

# Create a dictionary object
dict = Dictionary.new

# User interaction
loop do
  puts "\n📚 Ruby Dictionary"
  puts "1. Display all words"
  puts "2. Search for a word"
  puts "3. Add a new word"
  puts "4. Update a word"
  puts "5. Delete a word"
  puts "6. Exit"
  print "Choose an option: "
  
  choice = gets.chomp.to_i

  case choice
  when 1
    dict.display_words
  when 2
    print "Enter the word to search: "
    word = gets.chomp.downcase
    dict.search_word(word)
  when 3
    print "Enter the new word: "
    word = gets.chomp.downcase
    print "Enter its definition: "
    definition = gets.chomp
    dict.add_word(word, definition)
  when 4
    print "Enter the word to update: "
    word = gets.chomp.downcase
    print "Enter the new definition: "
    new_definition = gets.chomp
    dict.update_word(word, new_definition)
  when 5
    print "Enter the word to delete: "
    word = gets.chomp.downcase
    dict.delete_word(word)
  when 6
    puts "\n👋 Exiting the dictionary. Have a great day!"
    break
  else
    puts "\n❌ Invalid option. Please choose again."
  end
end
