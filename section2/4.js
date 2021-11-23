function solution(arr) {
  let answer = 0;
  let cnt = 0;
  arr.forEach((a, i) => {
    if (a >= 1 && arr[i + 1] >= 1) {
      arr[i + 1] += a;
      answer += a;
    } else if (a >= 1) {
      answer += a;
    }
  });
  // arr.forEach(a => {
  //   if (a === 1) {
  //     cnt++;
  //     answer += cnt;
  //   } else cnt = 0;
  // });
  return answer;
}

let arr = [1, 0, 1, 1, 1, 0, 0, 1, 1, 0];
console.log(solution(arr));
// 1 0 1 2 3
// 1 0 2 4
