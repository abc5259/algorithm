function solution(test) {
  let answer = [];

  for (let i = 0; i < test.length; i++) {
    for (let j = 0; j < test[i].length - 1; j++) {
      for (let k = j + 1; k < test[i].length; k++) {
        if (answer.includes(`${test[i][j]},${test[i][k]}`)) continue;
        if (answer.includes(`${test[i][k]},${test[i][j]}`)) {
          answer.splice(answer.indexOf(`${test[i][k]},${test[i][j]}`), 1);
          continue;
        }
        if (i !== 0) continue;
        answer.push(`${test[i][j]},${test[i][k]}`);
      }
    }
  }

  return answer;
}

function solution2(test) {
  let answer = 0;
  let cnt = 0;
  const n = test[0].length; //4
  const y = test.length;
  // 00
  for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= n; j++) {
      cnt = 0;
      for (let k = 0; k < y; k++) {
        let px = 0;
        let py = 0;
        for (let s = 0; s < n; s++) {
          if (i === test[k][s]) px = s;
          if (j === test[k][s]) py = s;
        }
        if (px < py) cnt++;
      }
      if (cnt === y) answer++;
    }
  }

  return answer;
}

let arr = [
  [3, 1, 4, 2],
  [4, 3, 2, 1],
  [3, 4, 1, 2],
];
console.log(solution2(arr));
