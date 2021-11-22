function solution(arr) {
  // let answer = arr.length;
  // for (let i = 1; i < arr.length; i++) {
  //   for (let j = 0; j < i; j++) {
  //     if (arr[i] <= arr[j]) {
  //       answer--;
  //       break;
  //     }
  //   }
  // }
  let answer = 1;
  let max = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
      answer++;
    }
  }
  return answer;
}

let arr = [130, 135, 148, 140, 145, 150, 150, 153];
console.log(solution(arr));
