
# Java Conditional Statements Practice Problems

## Easy Level Questions

### 1. Check if a Number is Positive, Negative, or Zero
**Problem Statement:**  
Write a program that takes a number as input and prints whether the number is "Positive", "Negative", or "Zero".

**Input:**  
```
An integer n.
```

**Output:**  
```
If n is positive, print "Positive".
If n is negative, print "Negative".
If n is zero, print "Zero".
```

**Sample Input/Output:**

Input:
```
5
```
Output:
```
Positive
```

Input:
```
-3
```
Output:
```
Negative
```

Input:
```
0
```
Output:
```
Zero
```

---

### 2. Even or Odd Number
**Problem Statement:**  
Write a program that takes an integer as input and prints whether it is "Even" or "Odd".

**Input:**  
```
An integer n.
```

**Output:**  
```
If n is even, print "Even".
If n is odd, print "Odd".
```

**Sample Input/Output:**

Input:
```
4
```
Output:
```
Even
```

Input:
```
7
```
Output:
```
Odd
```

---

### 3. Check Leap Year
**Problem Statement:**  
Write a program that takes a year as input and prints "Leap Year" if the year is a leap year, otherwise print "Not a Leap Year".

**Input:**  
```
A year y (an integer).
```

**Output:**  
```
If the year is a leap year, print "Leap Year".
If the year is not a leap year, print "Not a Leap Year".
```

**Sample Input/Output:**

Input:
```
2020
```
Output:
```
Leap Year
```

Input:
```
2021
```
Output:
```
Not a Leap Year
```

---

## Medium Level Questions

### 4. Largest of Three Numbers
**Problem Statement:**  
Write a program that takes three integers as input and prints the largest of the three numbers.

**Input:**  
```
Three integers a, b, c.
```

**Output:**  
```
The largest of the three integers.
```

**Sample Input/Output:**

Input:
```
12 45 23
```
Output:
```
45
```

Input:
```
89 23 56
```
Output:
```
89
```

---

### 5. Grade Calculator
**Problem Statement:**  
Write a program that takes the score of a student (out of 100) as input and prints the corresponding grade based on the following scale:
- Score >= 90: "A"
- Score >= 75 and < 90: "B"
- Score >= 50 and < 75: "C"
- Score < 50: "F"

**Input:**  
```
An integer score (0 ≤ score ≤ 100).
```

**Output:**  
```
The grade corresponding to the score.
```

**Sample Input/Output:**

Input:
```
85
```
Output:
```
B
```

Input:
```
92
```
Output:
```
A
```

Input:
```
45
```
Output:
```
F
```

---

### 6. Check Divisibility
**Problem Statement:**  
Write a program that takes an integer n as input and checks if it is divisible by both 2 and 3, or either 2 or 3. Print the corresponding result:
- If divisible by both 2 and 3, print "Divisible by both 2 and 3".
- If divisible by 2 but not 3, print "Divisible by 2".
- If divisible by 3 but not 2, print "Divisible by 3".
- If not divisible by 2 or 3, print "Not divisible by 2 or 3".

**Input:**  
```
An integer n.
```

**Output:**  
```
The appropriate message based on divisibility.
```

**Sample Input/Output:**

Input:
```
18
```
Output:
```
Divisible by both 2 and 3
```

Input:
```
10
```
Output:
```
Divisible by 2
```

Input:
```
9
```
Output:
```
Divisible by 3
```

Input:
```
7
```
Output:
```
Not divisible by 2 or 3
```

---

## Difficult Level Questions

### 7. Largest of Four Numbers
**Problem Statement:**  
Write a program that takes four integers as input and prints the largest number among them.

**Input:**  
```
Four integers a, b, c, d.
```

**Output:**  
```
The largest number among the four integers.
```

**Sample Input/Output:**

Input:
```
10 23 45 56
```
Output:
```
56
```

Input:
```
7 2 4 10
```
Output:
```
10
```

---

### 8. Check if a Year is Century Year
**Problem Statement:**  
Write a program that checks if a year is a century year or not. A century year is one that is divisible by 100 (e.g., 1900, 2000). A non-century year is one that is not divisible by 100 (e.g., 2020).

**Input:**  
```
A year y (integer).
```

**Output:**  
```
If the year is a century year, print "Century Year".
If it is not a century year, print "Not a Century Year".
```

**Sample Input/Output:**

Input:
```
1900
```
Output:
```
Century Year
```

Input:
```
2021
```
Output:
```
Not a Century Year
```

---

### 9. Number Classification
**Problem Statement:**  
Write a program that takes an integer as input and classifies it as follows:
- If the number is positive and a multiple of both 2 and 5, print "Multiple of 2 and 5".
- If the number is positive and a multiple of 2 but not 5, print "Multiple of 2".
- If the number is positive and a multiple of 5 but not 2, print "Multiple of 5".
- If the number is negative, print "Negative Number".
- If the number is zero, print "Zero".

**Input:**  
```
An integer n.
```

**Output:**  
```
The appropriate classification message based on the value of n.
```

**Sample Input/Output:**

Input:
```
10
```
Output:
```
Multiple of 2 and 5
```

Input:
```
4
```
Output:
```
Multiple of 2
```

Input:
```
-7
```
Output:
```
Negative Number
```

Input:
```
0
```
Output:
```
Zero
```

---

### 10. Triangle Type Checker
**Problem Statement:**  
Write a program that checks the type of a triangle given its three side lengths `a`, `b`, and `c`. The program should print:
- "Equilateral" if all three sides are equal.
- "Isosceles" if exactly two sides are equal.
- "Scalene" if all three sides are different.
- "Not a valid triangle" if the given sides do not satisfy the triangle inequality (i.e., the sum of any two sides must be greater than the third side).

**Input:**  
```
Three integers a, b, c.
```

**Output:**  
```
The type of triangle or "Not a valid triangle" if the sides do not form a valid triangle.
```

**Sample Input/Output:**

Input:
```
5 5 5
```
Output:
```
Equilateral
```

Input:
```
5 5 8
```
Output:
```
Isosceles
```

Input:
```
3 4 5
```
Output:
```
Scalene
```

Input:
```
1 2 3
```
Output:
```
Not a valid triangle
```

---
