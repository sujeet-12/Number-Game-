def bubble_sort(arr)
  n = arr.length
  swapped = true

  while swapped
    swapped = false
    (n - 1).times do |i|
      if arr[i] > arr[i + 1]
        arr[i], arr[i + 1] = arr[i + 1], arr[i] # Swap elements
        swapped = true
      end
    end
  end

  arr
end

# Example usage
numbers = [64, 34, 25, 12, 22, 11, 90]
sorted_numbers = bubble_sort(numbers)
puts "Sorted array: #{sorted_numbers}"
