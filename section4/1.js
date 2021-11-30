function solution(n, arr) {
  let answer = Number.MIN_SAFE_INTEGER;
  let max = Number.MIN_SAFE_INTEGER;
  arr.forEach((item, i) => {
    let sum =
      Math.floor(item / 100) + Math.floor((item % 100) / 10) + (item % 10);
    if (max <= sum) {
      max = sum;
      if (answer < item) answer = item;
    }
  });
  return answer;
}

let arr = [128, 460, 603, 40, 521, 137, 123];
console.log(solution(7, arr));
