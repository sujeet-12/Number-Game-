# Simple List Generator in Ruby

puts "Welcome to the List Generator!"
puts "Enter items one by one. Type 'done' when finished."

list = []

loop do
  print "Enter item: "
  input = gets.chomp
  break if input.downcase == "done"

  list << input
end

puts "\nYour Generated List:"
list.each_with_index do |item, index|
  puts "#{index + 1}. #{item}"
end
