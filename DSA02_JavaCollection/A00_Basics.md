# 📚 Java Collections Framework - Complete Guide

A comprehensive reference for Java Collections interfaces, implementations, and their time complexities.

---

## 🗂️ Collection Hierarchy

### List Interface (Ordered + Allows Duplicates)
Maintains insertion order and permits duplicate elements.

| Implementation | Description | Use Case |
|---------------|-------------|----------|
| **ArrayList** | Resizable array implementation | Fast random access, frequent reads |
| **LinkedList** | Doubly-linked list implementation | Frequent insertions/deletions |
| **Vector** | Synchronized ArrayList | Thread-safe operations (legacy) |
| **Stack** | LIFO stack (extends Vector) | Last-In-First-Out operations |

---

### Set Interface (Unique Elements)
Stores only unique elements, no duplicates allowed.

| Implementation | Description | Use Case |
|---------------|-------------|----------|
| **HashSet** | Hash table backed, no ordering | Fast lookups, uniqueness required |
| **LinkedHashSet** | Hash table + linked list, maintains insertion order | Unique elements with predictable iteration |
| **TreeSet** | Red-Black tree, sorted order | Sorted unique elements |

---

### Queue Interface (FIFO - First In First Out)
Processes elements in a specific order.

| Implementation | Description | Use Case |
|---------------|-------------|----------|
| **PriorityQueue** | Min-heap by default, priority-based ordering | Task scheduling, priority processing |
| **ArrayDeque** | Resizable array, double-ended queue | Stack/Queue operations, no null elements |
| **LinkedList** | Also implements Queue interface | FIFO operations with frequent modifications |

---

### Map Interface (Key-Value Pairs)
Stores data as key-value pairs, keys must be unique.

| Implementation | Description | Use Case |
|---------------|-------------|----------|
| **HashMap** | Hash table backed, no ordering | Fast lookups, insertions, deletions |
| **LinkedHashMap** | Hash table + linked list, maintains insertion order | Ordered key-value pairs |
| **TreeMap** | Red-Black tree, sorted by keys | Sorted key-value pairs, range queries |
| **Hashtable** | Synchronized HashMap (legacy) | Thread-safe key-value storage |

---

## ⚡ Time Complexity Reference

| Data Structure | Access | Insert | Delete | Search |
|---------------|--------|--------|--------|--------|
| **ArrayList** | O(1) | O(n) | O(n) | O(n) |
| **LinkedList** | O(n) | O(1)* | O(1)* | O(n) |
| **HashMap** | O(1) | O(1) | O(1) | O(1) |
| **LinkedHashMap** | O(1) | O(1) | O(1) | O(1) |
| **TreeMap** | O(log n) | O(log n) | O(log n) | O(log n) |
| **HashSet** | - | O(1) | O(1) | O(1) |
| **LinkedHashSet** | - | O(1) | O(1) | O(1) |
| **TreeSet** | - | O(log n) | O(log n) | O(log n) |
| **PriorityQueue** | O(1)** | O(log n) | O(log n) | O(n) |
| **ArrayDeque** | O(1)*** | O(1) | O(1) | O(n) |

**Notes:**
- `*` O(1) for LinkedList insert/delete at known positions (head/tail)
- `**` O(1) for peek operation in PriorityQueue
- `***` O(1) for access at both ends in ArrayDeque

---

## 🎯 Practice Order (IMPORTANT)

Follow this sequence to build a strong foundation:

```
1️⃣ ArrayList          → Master dynamic arrays and basic operations
2️⃣ HashMap            → Understand hash-based lookups
3️⃣ HashSet            → Learn uniqueness constraints
4️⃣ Stack              → Practice LIFO operations
5️⃣ Queue / Deque      → Master FIFO and double-ended operations
6️⃣ PriorityQueue      → Explore heap-based priority processing
7️⃣ LinkedList         → Understand linked structures
8️⃣ TreeMap / TreeSet  → Learn balanced tree operations
```

---

## 💡 Quick Selection Guide

**Need fast random access?** → `ArrayList`

**Frequent insertions at beginning/middle?** → `LinkedList`

**Need unique elements only?** → `HashSet`, `LinkedHashSet`, or `TreeSet`

**Need sorted data?** → `TreeSet` or `TreeMap`

**Need key-value mapping?** → `HashMap`, `LinkedHashMap`, or `TreeMap`

**Need FIFO processing?** → `Queue`, `ArrayDeque`, or `LinkedList`

**Need priority-based processing?** → `PriorityQueue`

**Need LIFO processing?** → `Stack` or `ArrayDeque` (preferred)

---

## 📝 Common Interview Patterns

- **Two Sum / Three Sum** → HashMap
- **Sliding Window** → ArrayDeque / HashMap
- **Top K Elements** → PriorityQueue
- **LRU Cache** → LinkedHashMap
- **Graph Traversal (BFS)** → Queue
- **Graph Traversal (DFS)** → Stack
- **Range Queries** → TreeMap / TreeSet
- **Duplicate Detection** → HashSet

---

## 🚀 Best Practices

✅ Use `ArrayList` as default List implementation  
✅ Prefer `ArrayDeque` over `Stack` for stack operations  
✅ Use `HashMap` for O(1) lookups  
✅ Use `TreeMap`/`TreeSet` when you need sorted data  
✅ Initialize with capacity if size is known to avoid resizing  
✅ Prefer interfaces over concrete types in declarations  

```java
List<String> list = new ArrayList<>();        // Good
ArrayList<String> list = new ArrayList<>();   // Less flexible
```

---

**Happy Coding! 🎉**