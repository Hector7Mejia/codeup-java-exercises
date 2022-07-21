package study_hall;

public class practiceInterviewQs {
    //For arr = ["Daisy", "Rose", "Hyacinth", "Poppy"], the output should be solution(arr) = "DRHPaoyoisapsecpyiynth".
    //
    //First, we append all 0th characters and obtain string "DRHP";
    //Then we append all 1st characters and obtain string "DRHPaoyo";
    //Then we append all 2nd characters and obtain string "DRHPaoyoisap";
    //Then we append all 3rd characters and obtain string "DRHPaoyoisapaecp";
    //Then we append all 4th characters and obtain string "DRHPaoyoisapaecpyiy";
    //Finally, only letters in the arr[2] are left, so we append the rest characters and get "DRHPaoyoisapaecpyiynth";

    //Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array. Return the array of these digits in ascending order.
    //
    //Example
    //
    //For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].

    //Given an integer n and an array a of length n, your task is to apply the following mutation to a:
    //
    //Array a mutates into a new array b of length n.
    //For each i from 0 to n - 1, b[i] = a[i - 1] + a[i] + a[i + 1].
    //If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it should be set to 0. For example, b[0] should be equal to 0 + a[0] + a[1].
    //Example
    //
    //For n = 5 and a = [4, 0, 1, -2, 3], the output should be solution(n, a) = [4, 5, -1, 2, 1].

    //For queryType = ["insert", "addToValue", "get", "insert", "addToKey", "addToValue", "get"] and query = [[1, 2], [2], [1], [2, 3], [1], [-1], [3]], the output should be solution(queryType, query) = 6.
    //
    //The hashmap looks like this after each query:
    //
    //1 query: {1: 2}
    //2 query: {1: 4}
    //3 query: answer is 4
    //4 query: {1: 4, 2: 3}
    //5 query: {2: 4, 3: 3}
    //6 query: {2: 3, 3: 2}
    //7 query: answer is 2
    //The sum of the results for all the get queries is equal to 4 + 2 = 6.
}
