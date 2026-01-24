# Algorithm Revision Notes

## 1. Dutch National Flag Problem

### Problem
Sort an array containing only 0s, 1s, and 2s in a single pass.

### Approach: Three Pointer Method

**Core Idea:** Maintain three pointers to partition the array into three sections:
- `low` → boundary for 0s
- `mid` → current element being examined
- `high` → boundary for 2s

### Algorithm

```java
int low = 0, mid = 0, high = arr.length - 1;

while (mid <= high) {
    if (arr[mid] == 0) {
        swap(arr[mid], arr[low]);
        low++;
        mid++;
    } 
    else if (arr[mid] == 1) {
        mid++;
    } 
    else if (arr[mid] == 2) {
        swap(arr[mid], arr[high]);
        high--;
    }
}
```

### How It Works
1. **arr[mid] == 0:** Swap with `low`, increment both `low` and `mid`
2. **arr[mid] == 1:** Just move `mid` forward
3. **arr[mid] == 2:** Swap with `high`, decrement `high` (don't increment `mid` yet)

### Complexity
- **Time:** O(n) - single pass
- **Space:** O(1) - in-place sorting

---

## 2. Majority Element (Boyer-Moore Voting Algorithm)

### Problem
Find the element that appears more than ⌊n/2⌋ times in an array.

### Approach: Moore's Voting Algorithm

**Core Idea:** Cancel out different elements pair-wise. The remaining element is the potential majority element.

### Algorithm

```java
int n = arr.length;
int cnt = 0;
int el = 0;

// Step 1: Find the potential majority element
for (int i = 0; i < n; i++) {
    if (cnt == 0) {
        cnt = 1;
        el = arr[i];
    } 
    else if (el == arr[i]) {
        cnt++;
    } 
    else {
        cnt--;
    }
}

// Step 2: Verify the candidate
int cnt1 = 0;
for (int i = 0; i < n; i++) {
    if (arr[i] == el) {
        cnt1++;
    }
}

// Return the element if it's a majority
if (cnt1 > (n / 2)) {
    return el;
}

// No majority found
return -1;
```

### How It Works
1. **Phase 1 - Find Candidate:**
   - If count is 0, pick current element as candidate
   - If current element matches candidate, increment count
   - If different, decrement count (cancellation)

2. **Phase 2 - Verify Candidate:**
   - Count actual occurrences of the candidate
   - Check if it appears more than n/2 times

### Why Verification is Needed
The first phase only finds a **potential** majority element. If no majority exists, it still returns an element, so verification is essential.

### Complexity
- **Time:** O(n) - two passes through the array
- **Space:** O(1) - constant extra space

---

## 3. Maximum Subarray Sum (Kadane's Algorithm)

### Problem
Find the contiguous subarray with the largest sum in an array of integers.

### Approach: Kadane's Algorithm

**Core Idea:** At each position, decide whether to extend the current subarray or start a new one. Keep track of the maximum sum seen so far.

### Algorithm

```java
int n = arr.length;
int maxSum = Integer.MIN_VALUE;  // or arr[0]
int currentSum = 0;

for (int i = 0; i < n; i++) {
    currentSum += arr[i];
    
    // Update maximum sum if current is larger
    if (currentSum > maxSum) {
        maxSum = currentSum;
    }
    
    // Reset current sum if it becomes negative
    if (currentSum < 0) {
        currentSum = 0;
    }
}

return maxSum;
```

### Variant: Track Subarray Indices

```java
int maxSum = Integer.MIN_VALUE;
int currentSum = 0;
int start = 0, end = 0, tempStart = 0;

for (int i = 0; i < n; i++) {
    currentSum += arr[i];
    
    if (currentSum > maxSum) {
        maxSum = currentSum;
        start = tempStart;
        end = i;
    }
    
    if (currentSum < 0) {
        currentSum = 0;
        tempStart = i + 1;
    }
}

// Subarray is arr[start...end]
```

### Complexity
- **Time:** O(n) - single pass
- **Space:** O(1) - constant extra space

---