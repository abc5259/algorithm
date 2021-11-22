function solution(arr) {
  let answer = [];
  answer = arr.filter((item, i) => {
    if (!arr[i - 1]) return true;
    return item > arr[i - 1];
  });
  return answer;
}

let arr = [7, 3, 9, 5, 6, 12];
console.log(solution(arr));
