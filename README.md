# QuerryArray

Chef has an array a consisting of positive integers. This array is sorted in non-decreasing order from left to right. You are given Q queries. Each query consists of three integers l,r,x. The answer to this query can be found as follows. Consider the subarray al,al+1,…,ar. The answer to the query is the count of numbers in this subarray that are greater than or equal to x.

Input Format
The first line of each test case contains two space-separated integers n,Q.
The second line contains n space separated integers denoting the array a.
Each of the next Q lines contains three space-separated integers l,r,x denoting the query.

Output Format
Output Q lines one for each query containing the answer for the corresponding query. 


Constraints

1≤n,Q≤105
1≤ai≤109
1≤l≤r≤n
1≤x≤109 


Subtasks

For 10% of the score: 1≤n,Q≤100
For 20% of the score: 1≤x≤100
Remaining 70%: No extra constraints.


Sample Input 

5 6 

1 2 3 6 9

1 5 1

1 5 3

1 5 10

1 4 4

2 5 4

2 5 1 


Sample Output

5

3

0

1

2

4 


Explanation:

For the first query, all the elements of the array are ≥1. Thus, the answer is 5.
For the second query, the answer will be 3, as the elements 3,6,9 are ≥3
