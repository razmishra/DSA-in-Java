# Java Loop Questions

## 1. **Sum of First N Natural Numbers** (Easy)

### Problem Statement:
Write a program that calculates the sum of the first `N` natural numbers using a loop.

### Input:
- A single integer `N` (1 ≤ N ≤ 10^6).

### Output:
- A single integer which is the sum of first `N` natural numbers.

### Example 1:
#### Input:
```
5
```

#### Output:
```
15
```

#### Explanation:
The sum of the first 5 natural numbers is: 1 + 2 + 3 + 4 + 5 = 15.

### Example 2:
#### Input:
```
10
```

#### Output:
```
55
```

### Example 3:
#### Input:
```
100
```

#### Output:
```
5050
```

---

## 2. **Factorial of a Number** (Easy)

### Problem Statement:
Write a program that calculates the factorial of a given number `N` using a loop.

### Input:
- A single integer `N` (0 ≤ N ≤ 20).

### Output:
- A single integer representing the factorial of `N`.

### Example 1:
#### Input:
```
4
```

#### Output:
```
24
```

#### Explanation:
The factorial of 4 is: 4 × 3 × 2 × 1 = 24.

### Example 2:
#### Input:
```
6
```

#### Output:
```
720
```

### Example 3:
#### Input:
```
0
```

#### Output:
```
1
```

---

## 3. **Even Numbers Between 1 and N** (Easy)

### Problem Statement:
Write a program to print all even numbers between 1 and `N` (inclusive), using a loop.

### Input:
- A single integer `N` (1 ≤ N ≤ 100).

### Output:
- A list of all even numbers between 1 and `N`.

### Example 1:
#### Input:
```
10
```

#### Output:
```
2 4 6 8 10
```

### Example 2:
#### Input:
```
20
```

#### Output:
```
2 4 6 8 10 12 14 16 18 20
```

### Example 3:
#### Input:
```
15
```

#### Output:
```
2 4 6 8 10 12 14
```

---

## 4. **Reverse a Number** (Medium)

### Problem Statement:
Write a program to reverse the digits of a given number `N` using a loop.

### Input:
- A single integer `N` (1 ≤ N ≤ 10000).

### Output:
- A single integer, which is the reversed number.

### Example 1:
#### Input:
```
1234
```

#### Output:
```
4321
```

### Example 2:
#### Input:
```
9876
```

#### Output:
```
6789
```

### Example 3:
#### Input:
```
120
```

#### Output:
```
21
```

---

## 5. **Count Digits in a Number** (Easy)

### Problem Statement:
Write a program that counts how many digits are in a given number `N`.

### Input:
- A single integer `N` (1 ≤ N ≤ 1000000).

### Output:
- A single integer representing the number of digits in `N`.

### Example 1:
#### Input:
```
98765
```

#### Output:
```
5
```

### Example 2:
#### Input:
```
123
```

#### Output:
```
3
```

### Example 3:
#### Input:
```
9
```

#### Output:
```
1
```

---

## 6. **Prime Numbers Between 1 and N** (Medium)

### Problem Statement:
Write a program to print all prime numbers between 1 and `N` using a loop.

### Input:
- A single integer `N` (1 ≤ N ≤ 100).

### Output:
- A list of all prime numbers between 1 and `N`.

### Example 1:
#### Input:
```
10
```

#### Output:
```
2 3 5 7
```

### Example 2:
#### Input:
```
20
```

#### Output:
```
2 3 5 7 11 13 17 19
```

### Example 3:
#### Input:
```
30
```

#### Output:
```
2 3 5 7 11 13 17 19 23 29
```

---

## 7. **Armstrong Number Check** (Hard)

### Problem Statement:
Write a program to check if a given number `N` is an Armstrong number. An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

### Input:
- A single integer `N` (1 ≤ N ≤ 99999).

### Output:
- Output `True` if the number is an Armstrong number, otherwise output `False`.

### Example 1:
#### Input:
```
153
```

#### Output:
```
True
```

#### Explanation:
153 is an Armstrong number because 1³ + 5³ + 3³ = 153.

### Example 2:
#### Input:
```
9474
```

#### Output:
```
True
```

#### Explanation:
9474 is an Armstrong number because 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474.

### Example 3:
#### Input:
```
123
```

#### Output:
```
False
```

#### Explanation:
123 is not an Armstrong number because 1³ + 2³ + 3³ ≠ 123.

---


## 8. **Product of Digits of a Number** (Hard)

### Problem Statement:
Write a program that calculates the product of the digits of a given number `N`.

### Input:
- A single integer `N` (1 ≤ N ≤ 99999).

### Output:
- A single integer representing the product of the digits of `N`.

### Example 1:
#### Input:
123

#### Output:
6

#### Explanation:
The digits of 123 are 1, 2, and 3. Their product is: 1 × 2 × 3 = 6.

### Example 2:
#### Input:
432

#### Output:
24


#### Explanation:
The digits of 432 are 4, 3, and 2. Their product is: 4 × 3 × 2 = 24.

### Example 3:
#### Input:
507


#### Output:
0

#### Explanation:
The digits of 507 are 5, 0, and 7. Since one of the digits is 0, the product is 0.
