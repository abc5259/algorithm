function solution(a, b) {
  let answer = "";
  // for (let i = 0; i < a.length; i++) {
  //   if (a[i] === b[i]) answer += "D";
  //   if (a[i] === 3) {
  //     if (b[i] === 1) answer += "B";
  //     if (b[i] === 2) answer += "A";
  //   } else {
  //     if (a[i] < b[i]) answer += "B";
  //     if (a[i] > b[i]) answer += "A";
  //   }
  // }
  for (let i = 0; i < a.length; i++) {
    if (a[i] === b[i]) answer += "D";
    else if (
      (a[i] === 1 && b[i] === 3) ||
      (a[i] === 2 && b[i] === 1) ||
      (a[i] === 3 && b[i] === 2)
    )
      answer += "A";
    else answer += "B";
  }
  return answer;
}
// 1 은 2한테 지고 3한테 이김
// 2 는 3한테 지고 1한테 이김
// 3 은 1한테 지고 2한테 이김
let a = [2, 3, 3, 1, 3];
let b = [1, 1, 2, 2, 3];
console.log(solution(a, b));
