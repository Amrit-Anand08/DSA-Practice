# Java Collections Framework - Quick Reference

## LIST

### ArrayList
- `add(value)` - Adds element at end
- `add(index, value)` - Adds element at specified index
- `get(index)` - Returns element at index
- `set(index, value)` - Replaces element at index
- `remove(index)` - Removes element at index
- `remove(value)` - Removes first occurrence of value
- `size()` - Returns number of elements
- `isEmpty()` - Checks if list is empty
- `contains(value)` - Checks if value exists
- `clear()` - Removes all elements
- `indexOf(value)` - Returns first index of value
- `lastIndexOf(value)` - Returns last index of value

### LinkedList
- `add(value)` - Adds element at end
- `add(index, value)` - Adds element at specified index
- `addFirst(value)` - Adds element at beginning
- `addLast(value)` - Adds element at end
- `get(index)` - Returns element at index
- `getFirst()` - Returns first element
- `getLast()` - Returns last element
- `set(index, value)` - Replaces element at index
- `remove(index)` - Removes element at index
- `remove(value)` - Removes first occurrence of value
- `removeFirst()` - Removes and returns first element
- `removeLast()` - Removes and returns last element
- `size()` - Returns number of elements
- `isEmpty()` - Checks if list is empty
- `contains(value)` - Checks if value exists
- `clear()` - Removes all elements

### Vector
- `add(value)` - Adds element at end
- `add(index, value)` - Adds element at specified index
- `get(index)` - Returns element at index
- `set(index, value)` - Replaces element at index
- `remove(index)` - Removes element at index
- `remove(value)` - Removes first occurrence of value
- `size()` - Returns number of elements
- `isEmpty()` - Checks if vector is empty
- `contains(value)` - Checks if value exists
- `capacity()` - Returns current capacity
- `clear()` - Removes all elements

### Stack (extends Vector)
- `push(value)` - Adds element to top
- `pop()` - Removes and returns top element
- `peek()` - Returns top element without removing
- `isEmpty()` - Checks if stack is empty
- `size()` - Returns number of elements
- `search(value)` - Returns 1-based position from top (returns -1 if not found)
- `clear()` - Removes all elements

## SET

### HashSet
- `add(value)` - Adds element (returns true if added)
- `remove(value)` - Removes element
- `size()` - Returns number of elements
- `isEmpty()` - Checks if set is empty
- `contains(value)` - Checks if value exists
- `clear()` - Removes all elements

### LinkedHashSet
- `add(value)` - Adds element (maintains insertion order)
- `remove(value)` - Removes element
- `size()` - Returns number of elements
- `isEmpty()` - Checks if set is empty
- `contains(value)` - Checks if value exists
- `clear()` - Removes all elements

### TreeSet
- `add(value)` - Adds element (sorted order)
- `remove(value)` - Removes element
- `size()` - Returns number of elements
- `isEmpty()` - Checks if set is empty
- `contains(value)` - Checks if value exists
- `first()` - Returns first (lowest) element
- `last()` - Returns last (highest) element
- `ceiling(value)` - Returns smallest element >= value
- `floor(value)` - Returns largest element <= value
- `higher(value)` - Returns smallest element > value
- `lower(value)` - Returns largest element < value
- `pollFirst()` - Removes and returns first element
- `pollLast()` - Removes and returns last element
- `clear()` - Removes all elements

## QUEUE

### ArrayDeque
- `add(value)` - Adds element at end (throws exception if fails)
- `offer(value)` - Adds element at end (returns false if fails)
- `addFirst(value)` - Adds element at beginning
- `addLast(value)` - Adds element at end
- `offerFirst(value)` - Adds element at beginning (returns false if fails)
- `offerLast(value)` - Adds element at end (returns false if fails)
- `remove()` - Removes and returns first element (throws exception if empty)
- `poll()` - Removes and returns first element (returns null if empty)
- `removeFirst()` - Removes and returns first element
- `removeLast()` - Removes and returns last element
- `pollFirst()` - Removes and returns first element (returns null if empty)
- `pollLast()` - Removes and returns last element (returns null if empty)
- `element()` - Returns first element (throws exception if empty)
- `peek()` - Returns first element (returns null if empty)
- `peekFirst()` - Returns first element (returns null if empty)
- `peekLast()` - Returns last element (returns null if empty)
- `size()` - Returns number of elements
- `isEmpty()` - Checks if deque is empty
- `clear()` - Removes all elements

### LinkedList (as Queue)
- `add(value)` - Adds element at end (throws exception if fails)
- `offer(value)` - Adds element at end (returns false if fails)
- `remove()` - Removes and returns first element (throws exception if empty)
- `poll()` - Removes and returns first element (returns null if empty)
- `element()` - Returns first element (throws exception if empty)
- `peek()` - Returns first element (returns null if empty)
- `addFirst(value)` - Adds element at beginning
- `addLast(value)` - Adds element at end
- `removeFirst()` - Removes and returns first element
- `removeLast()` - Removes and returns last element
- `getFirst()` - Returns first element
- `getLast()` - Returns last element
- `size()` - Returns number of elements
- `isEmpty()` - Checks if queue is empty

### PriorityQueue (Min Heap by default)
- `add(value)` - Adds element (throws exception if fails)
- `offer(value)` - Adds element (returns false if fails)
- `remove()` - Removes and returns head element (throws exception if empty)
- `poll()` - Removes and returns head element (returns null if empty)
- `element()` - Returns head element (throws exception if empty)
- `peek()` - Returns head element (returns null if empty)
- `size()` - Returns number of elements
- `isEmpty()` - Checks if queue is empty
- `clear()` - Removes all elements
- `contains(value)` - Checks if value exists

## MAP

### HashMap
- `put(key, value)` - Adds or updates key-value pair
- `get(key)` - Returns value for key (returns null if not found)
- `remove(key)` - Removes key-value pair
- `containsKey(key)` - Checks if key exists
- `containsValue(value)` - Checks if value exists
- `size()` - Returns number of key-value pairs
- `isEmpty()` - Checks if map is empty
- `clear()` - Removes all entries
- `keySet()` - Returns set of all keys
- `values()` - Returns collection of all values
- `entrySet()` - Returns set of all key-value entries
- `putIfAbsent(key, value)` - Adds if key doesn't exist
- `getOrDefault(key, defaultValue)` - Returns value or default

### LinkedHashMap
- `put(key, value)` - Adds or updates key-value pair (maintains insertion order)
- `get(key)` - Returns value for key
- `remove(key)` - Removes key-value pair
- `containsKey(key)` - Checks if key exists
- `containsValue(value)` - Checks if value exists
- `size()` - Returns number of key-value pairs
- `isEmpty()` - Checks if map is empty
- `clear()` - Removes all entries
- `keySet()` - Returns set of all keys
- `values()` - Returns collection of all values
- `entrySet()` - Returns set of all key-value entries

### TreeMap
- `put(key, value)` - Adds or updates key-value pair (sorted by keys)
- `get(key)` - Returns value for key
- `remove(key)` - Removes key-value pair
- `containsKey(key)` - Checks if key exists
- `containsValue(value)` - Checks if value exists
- `size()` - Returns number of key-value pairs
- `isEmpty()` - Checks if map is empty
- `clear()` - Removes all entries
- `firstKey()` - Returns first (lowest) key
- `lastKey()` - Returns last (highest) key
- `ceilingKey(key)` - Returns smallest key >= given key
- `floorKey(key)` - Returns largest key <= given key
- `higherKey(key)` - Returns smallest key > given key
- `lowerKey(key)` - Returns largest key < given key
- `keySet()` - Returns set of all keys
- `values()` - Returns collection of all values
- `entrySet()` - Returns set of all key-value entries

### Hashtable
- `put(key, value)` - Adds or updates key-value pair (synchronized)
- `get(key)` - Returns value for key
- `remove(key)` - Removes key-value pair
- `containsKey(key)` - Checks if key exists
- `containsValue(value)` - Checks if value exists
- `size()` - Returns number of key-value pairs
- `isEmpty()` - Checks if table is empty
- `clear()` - Removes all entries

## ITERATOR

### Iterator
- `hasNext()` - Returns true if more elements exist
- `next()` - Returns next element
- `remove()` - Removes current element

### ListIterator
- `hasNext()` - Returns true if more elements exist in forward direction
- `next()` - Returns next element
- `hasPrevious()` - Returns true if more elements exist in backward direction
- `previous()` - Returns previous element
- `nextIndex()` - Returns index of next element
- `previousIndex()` - Returns index of previous element
- `remove()` - Removes current element
- `set(value)` - Replaces current element
- `add(value)` - Inserts element before next element

## COLLECTIONS UTILITY CLASS

### Common Algorithms (Collections class)
- `Collections.sort(list)` - Sorts list in natural order
- `Collections.sort(list, comparator)` - Sorts list using comparator
- `Collections.reverse(list)` - Reverses order of elements
- `Collections.shuffle(list)` - Randomly shuffles elements
- `Collections.max(collection)` - Returns maximum element
- `Collections.max(collection, comparator)` - Returns maximum using comparator
- `Collections.min(collection)` - Returns minimum element
- `Collections.min(collection, comparator)` - Returns minimum using comparator
- `Collections.frequency(collection, value)` - Returns count of value occurrences
- `Collections.binarySearch(list, key)` - Returns index of key (list must be sorted)
- `Collections.binarySearch(list, key, comparator)` - Binary search with comparator
- `Collections.copy(dest, src)` - Copies all elements from src to dest
- `Collections.fill(list, value)` - Replaces all elements with value
- `Collections.swap(list, i, j)` - Swaps elements at indices i and j
- `Collections.replaceAll(list, oldVal, newVal)` - Replaces all occurrences
- `Collections.rotate(list, distance)` - Rotates elements by distance
- `Collections.disjoint(c1, c2)` - Returns true if no common elements
- `Collections.addAll(collection, elements...)` - Adds all elements to collection

### Wrapper Methods
- `Collections.unmodifiableList(list)` - Returns unmodifiable view of list
- `Collections.unmodifiableSet(set)` - Returns unmodifiable view of set
- `Collections.unmodifiableMap(map)` - Returns unmodifiable view of map
- `Collections.synchronizedList(list)` - Returns synchronized list
- `Collections.synchronizedSet(set)` - Returns synchronized set
- `Collections.synchronizedMap(map)` - Returns synchronized map
- `Collections.emptyList()` - Returns immutable empty list
- `Collections.emptySet()` - Returns immutable empty set
- `Collections.emptyMap()` - Returns immutable empty map
- `Collections.singletonList(value)` - Returns immutable list with single element

## ARRAYS UTILITY CLASS

### Common Methods (Arrays class)
- `Arrays.sort(array)` - Sorts array in natural order
- `Arrays.sort(array, fromIndex, toIndex)` - Sorts specified range
- `Arrays.sort(array, comparator)` - Sorts using comparator
- `Arrays.binarySearch(array, key)` - Returns index of key (array must be sorted)
- `Arrays.fill(array, value)` - Fills array with value
- `Arrays.copyOf(array, length)` - Copies array to new array of specified length
- `Arrays.copyOfRange(array, from, to)` - Copies specified range
- `Arrays.equals(array1, array2)` - Checks if arrays are equal
- `Arrays.toString(array)` - Returns string representation of array
- `Arrays.asList(elements...)` - Returns fixed-size list backed by array
- `Arrays.stream(array)` - Returns stream from array
